package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides convenience methods to map pixel coordinates in camera image space to depth image space. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthCorrelatedCoordinateMapper")
@js.native
abstract class PerceptionDepthCorrelatedCoordinateMapper () extends js.Object {
  /**
    * Maps all pixels in an image from camera image space to depth image space.
    * @param depthFrame The depth frame to map the pixels to.
    */
  def mapAllPixelsToTargetAsync(depthFrame: PerceptionDepthFrame): winrtDashUwpLib.Anon_TargetCoordinates = js.native
  /**
    * Maps a pixel from camera image space to depth image space.
    * @param sourcePixelCoordinate A pixel coordinate, in camera image space.
    * @param depthFrame The depth frame to map the pixel to.
    * @return Returns the mapping of the pixel coordinate to depth image space.
    */
  def mapPixelToTarget(
    sourcePixelCoordinate: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    depthFrame: PerceptionDepthFrame
  ): winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /**
    * Maps a set of pixels from camera image space to depth image space.
    * @param sourceCoordinates A set of pixel coordinates, in camera image space.
    * @param depthFrame The depth frame to map the pixels to.
    * @return The mapping of the pixel coordinate to depth image space.
    */
  def mapPixelsToTarget(sourceCoordinates: winrtDashUwpLib.WindowsNs.FoundationNs.Point, depthFrame: PerceptionDepthFrame): winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /**
    * Maps a region of pixels from camera image space to depth image space.
    * @param region The region of pixels to map from camera image space to depth image space.
    * @param depthFrame The depth frame to map the region of pixels to.
    */
  def mapRegionOfPixelsToTargetAsync(region: winrtDashUwpLib.WindowsNs.FoundationNs.Rect, depthFrame: PerceptionDepthFrame): winrtDashUwpLib.Anon_TargetCoordinates = js.native
}

