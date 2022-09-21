package typings.tensorflowModelsFaceLandmarksDetection

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdjacentPairs(model: SupportedModels): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentPairs")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def getKeypointIndexByContour(model: SupportedModels): StringDictionary[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeypointIndexByContour")(model.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[Double]]]
}
