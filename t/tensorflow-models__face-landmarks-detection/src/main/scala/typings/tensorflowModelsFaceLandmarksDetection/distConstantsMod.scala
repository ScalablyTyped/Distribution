package typings.tensorflowModelsFaceLandmarksDetection

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_CONNECTED_KEYPOINTS_PAIRS")
  @js.native
  val MEDIAPIPE_FACE_MESH_CONNECTED_KEYPOINTS_PAIRS: PairArray = js.native
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS")
  @js.native
  val MEDIAPIPE_FACE_MESH_KEYPOINTS: Map[Double, String] = js.native
  
  object MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR {
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.faceOval")
    @js.native
    def faceOval: js.Array[Double] = js.native
    inline def faceOval_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("faceOval")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.leftEye")
    @js.native
    def leftEye: js.Array[Double] = js.native
    inline def leftEye_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftEye")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.leftEyebrow")
    @js.native
    def leftEyebrow: js.Array[Double] = js.native
    inline def leftEyebrow_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftEyebrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.leftIris")
    @js.native
    def leftIris: js.Array[Double] = js.native
    inline def leftIris_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftIris")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.lips")
    @js.native
    def lips: js.Array[Double] = js.native
    inline def lips_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lips")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.rightEye")
    @js.native
    def rightEye: js.Array[Double] = js.native
    inline def rightEye_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightEye")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.rightEyebrow")
    @js.native
    def rightEyebrow: js.Array[Double] = js.native
    inline def rightEyebrow_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightEyebrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_KEYPOINTS_BY_CONTOUR.rightIris")
    @js.native
    def rightIris: js.Array[Double] = js.native
    inline def rightIris_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightIris")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_NUM_KEYPOINTS")
  @js.native
  val MEDIAPIPE_FACE_MESH_NUM_KEYPOINTS: /* 468 */ Double = js.native
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/constants", "MEDIAPIPE_FACE_MESH_NUM_KEYPOINTS_WITH_IRISES")
  @js.native
  val MEDIAPIPE_FACE_MESH_NUM_KEYPOINTS_WITH_IRISES: /* 478 */ Double = js.native
  
  type PairArray = js.Array[js.Tuple2[Double, Double]]
}
