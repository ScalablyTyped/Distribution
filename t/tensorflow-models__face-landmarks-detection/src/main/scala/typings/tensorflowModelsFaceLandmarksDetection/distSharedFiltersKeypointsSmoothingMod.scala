package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.KeypointsSmoothingConfig
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedFiltersKeypointsSmoothingMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/filters/keypoints_smoothing", "KeypointsSmoothingFilter")
  @js.native
  open class KeypointsSmoothingFilter protected () extends StObject {
    def this(config: KeypointsSmoothingConfig) = this()
    
    /**
      * Apply one of the stateful `KeypointsFilter` to keypoints.
      *
      * Currently supports `OneEuroFilter` and `VelocityFilter`.
      * @param keypoints A list of 2D or 3D keypoints, can be normalized or
      *     non-normalized.
      * @param timestamp The timestamp of the video frame.
      * @param imageSize Optional. The imageSize is useful when keypoints are
      *     normalized.
      * @param normalized Optional. Whether the keypoints are normalized. Default
      *     to false.
      * @param objectScaleROI Optional. The auxiliary ROI to calculate object
      *     scale. If not set, objectScale defaults to 1.
      */
    @JSName("apply")
    def apply(keypoints: js.Array[Keypoint], timestamp: Double): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(keypoints: js.Array[Keypoint], timestamp: Double, imageSize: Unit, normalized: Boolean): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(
      keypoints: js.Array[Keypoint],
      timestamp: Double,
      imageSize: Unit,
      normalized: Boolean,
      objectScaleROI: Rect
    ): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(
      keypoints: js.Array[Keypoint],
      timestamp: Double,
      imageSize: Unit,
      normalized: Unit,
      objectScaleROI: Rect
    ): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(keypoints: js.Array[Keypoint], timestamp: Double, imageSize: ImageSize): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(keypoints: js.Array[Keypoint], timestamp: Double, imageSize: ImageSize, normalized: Boolean): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(
      keypoints: js.Array[Keypoint],
      timestamp: Double,
      imageSize: ImageSize,
      normalized: Boolean,
      objectScaleROI: Rect
    ): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(
      keypoints: js.Array[Keypoint],
      timestamp: Double,
      imageSize: ImageSize,
      normalized: Unit,
      objectScaleROI: Rect
    ): js.Array[Keypoint] = js.native
    
    /* private */ val keypointsFilter: Any = js.native
  }
}
