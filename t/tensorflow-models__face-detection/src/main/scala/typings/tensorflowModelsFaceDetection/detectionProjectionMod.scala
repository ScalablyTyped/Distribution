package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.calculateInverseMatrixMod.Matrix4x4
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.Detection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectionProjectionMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/detection_projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectionProjection(detections: js.Array[Detection], projectionMatrix: Matrix4x4): js.Array[Detection] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectionProjection")(detections.asInstanceOf[js.Any], projectionMatrix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Detection]]
}
