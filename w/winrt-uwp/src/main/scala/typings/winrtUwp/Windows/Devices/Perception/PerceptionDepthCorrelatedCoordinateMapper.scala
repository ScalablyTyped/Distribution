package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.anon.TargetCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides convenience methods to map pixel coordinates in camera image space to depth image space. */
@js.native
trait PerceptionDepthCorrelatedCoordinateMapper extends js.Object {
  /**
    * Maps all pixels in an image from camera image space to depth image space.
    * @param depthFrame The depth frame to map the pixels to.
    */
  def mapAllPixelsToTargetAsync(depthFrame: PerceptionDepthFrame): TargetCoordinates = js.native
  /**
    * Maps a pixel from camera image space to depth image space.
    * @param sourcePixelCoordinate A pixel coordinate, in camera image space.
    * @param depthFrame The depth frame to map the pixel to.
    * @return Returns the mapping of the pixel coordinate to depth image space.
    */
  def mapPixelToTarget(sourcePixelCoordinate: Point, depthFrame: PerceptionDepthFrame): Point = js.native
  /**
    * Maps a set of pixels from camera image space to depth image space.
    * @param sourceCoordinates A set of pixel coordinates, in camera image space.
    * @param depthFrame The depth frame to map the pixels to.
    * @return The mapping of the pixel coordinate to depth image space.
    */
  def mapPixelsToTarget(sourceCoordinates: Point, depthFrame: PerceptionDepthFrame): Point = js.native
  /**
    * Maps a region of pixels from camera image space to depth image space.
    * @param region The region of pixels to map from camera image space to depth image space.
    * @param depthFrame The depth frame to map the region of pixels to.
    */
  def mapRegionOfPixelsToTargetAsync(region: Rect, depthFrame: PerceptionDepthFrame): TargetCoordinates = js.native
}

object PerceptionDepthCorrelatedCoordinateMapper {
  @scala.inline
  def apply(
    mapAllPixelsToTargetAsync: PerceptionDepthFrame => TargetCoordinates,
    mapPixelToTarget: (Point, PerceptionDepthFrame) => Point,
    mapPixelsToTarget: (Point, PerceptionDepthFrame) => Point,
    mapRegionOfPixelsToTargetAsync: (Rect, PerceptionDepthFrame) => TargetCoordinates
  ): PerceptionDepthCorrelatedCoordinateMapper = {
    val __obj = js.Dynamic.literal(mapAllPixelsToTargetAsync = js.Any.fromFunction1(mapAllPixelsToTargetAsync), mapPixelToTarget = js.Any.fromFunction2(mapPixelToTarget), mapPixelsToTarget = js.Any.fromFunction2(mapPixelsToTarget), mapRegionOfPixelsToTargetAsync = js.Any.fromFunction2(mapRegionOfPixelsToTargetAsync))
    __obj.asInstanceOf[PerceptionDepthCorrelatedCoordinateMapper]
  }
  @scala.inline
  implicit class PerceptionDepthCorrelatedCoordinateMapperOps[Self <: PerceptionDepthCorrelatedCoordinateMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMapAllPixelsToTargetAsync(value: PerceptionDepthFrame => TargetCoordinates): Self = this.set("mapAllPixelsToTargetAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setMapPixelToTarget(value: (Point, PerceptionDepthFrame) => Point): Self = this.set("mapPixelToTarget", js.Any.fromFunction2(value))
    @scala.inline
    def setMapPixelsToTarget(value: (Point, PerceptionDepthFrame) => Point): Self = this.set("mapPixelsToTarget", js.Any.fromFunction2(value))
    @scala.inline
    def setMapRegionOfPixelsToTargetAsync(value: (Rect, PerceptionDepthFrame) => TargetCoordinates): Self = this.set("mapRegionOfPixelsToTargetAsync", js.Any.fromFunction2(value))
  }
  
}

