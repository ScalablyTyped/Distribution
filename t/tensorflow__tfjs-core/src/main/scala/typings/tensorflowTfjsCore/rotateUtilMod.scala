package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rotate_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImageCenter(center: js.Tuple2[Double, Double], imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageCenter")(center.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  inline def getImageCenter(center: Double, imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageCenter")(center.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
}
