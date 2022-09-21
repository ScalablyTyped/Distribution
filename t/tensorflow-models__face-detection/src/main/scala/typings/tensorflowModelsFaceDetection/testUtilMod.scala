package typings.tensorflowModelsFaceDetection

import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/test_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/test_util", "KARMA_SERVER")
  @js.native
  val KARMA_SERVER: /* "./base/test_data" */ String = js.native
  
  inline def getXYPerFrame(result: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[js.Array[Double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getXYPerFrame")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Array[Double]]]]
  
  inline def imageToBooleanMask(rgbaData: js.typedarray.Uint8ClampedArray, r: Double, g: Double, b: Double): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageToBooleanMask")(rgbaData.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  inline def loadImage(imagePath: String, width: Double, height: Double): js.Promise[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imagePath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLImageElement]]
  
  inline def loadVideo(
    videoPath: String,
    videoFPS: Double,
    callback: js.Function2[/* video */ HTMLVideoElement, /* timestamp */ Double, js.Promise[js.Array[Keypoint]]],
    expected: js.Array[js.Array[js.Array[Double]]],
    skeletonAdjacentPairs: js.Array[js.Array[Double]],
    simulatedInterval: Double
  ): js.Promise[HTMLVideoElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadVideo")(videoPath.asInstanceOf[js.Any], videoFPS.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], skeletonAdjacentPairs.asInstanceOf[js.Any], simulatedInterval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLVideoElement]]
  
  inline def segmentationIOU(expectedMask: js.Array[Boolean], actualMask: js.Array[Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentationIOU")(expectedMask.asInstanceOf[js.Any], actualMask.asInstanceOf[js.Any])).asInstanceOf[Double]
}
