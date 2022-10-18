package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsCalculateInverseMatrixMod.Matrix4x4
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsGetRotatedSubRectToRectTransformationMatrixMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/get_rotated_sub_rect_to_rect_transformation_matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRotatedSubRectToRectTransformMatrix(subRect: Rect, rectWidth: Double, rectHeight: Double, flipHorizontally: Boolean): Matrix4x4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotatedSubRectToRectTransformMatrix")(subRect.asInstanceOf[js.Any], rectWidth.asInstanceOf[js.Any], rectHeight.asInstanceOf[js.Any], flipHorizontally.asInstanceOf[js.Any])).asInstanceOf[Matrix4x4]
}
