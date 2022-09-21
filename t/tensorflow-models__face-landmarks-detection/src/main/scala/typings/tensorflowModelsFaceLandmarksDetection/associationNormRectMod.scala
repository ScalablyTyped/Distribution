package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.BoundingBox
import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object associationNormRectMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/association_norm_rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateAssociationNormRect(rectsArray: js.Array[js.Array[Rect]], minSimilarityThreshold: Double): js.Array[Rect] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateAssociationNormRect")(rectsArray.asInstanceOf[js.Any], minSimilarityThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[Rect]]
  
  inline def getBoundingBox(rect: Rect): BoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingBox")(rect.asInstanceOf[js.Any]).asInstanceOf[BoundingBox]
}
