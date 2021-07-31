package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.anon.TargetCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides convenience methods to map pixel coordinates in camera image space to depth image space. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthCorrelatedCoordinateMapper")
@js.native
abstract class PerceptionDepthCorrelatedCoordinateMapper ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthCorrelatedCoordinateMapper {
  
  /**
    * Maps all pixels in an image from camera image space to depth image space.
    * @param depthFrame The depth frame to map the pixels to.
    */
  /* CompleteClass */
  override def mapAllPixelsToTargetAsync(depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame): TargetCoordinates = js.native
  
  /**
    * Maps a pixel from camera image space to depth image space.
    * @param sourcePixelCoordinate A pixel coordinate, in camera image space.
    * @param depthFrame The depth frame to map the pixel to.
    * @return Returns the mapping of the pixel coordinate to depth image space.
    */
  /* CompleteClass */
  override def mapPixelToTarget(
    sourcePixelCoordinate: Point,
    depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame
  ): Point = js.native
  
  /**
    * Maps a set of pixels from camera image space to depth image space.
    * @param sourceCoordinates A set of pixel coordinates, in camera image space.
    * @param depthFrame The depth frame to map the pixels to.
    * @return The mapping of the pixel coordinate to depth image space.
    */
  /* CompleteClass */
  override def mapPixelsToTarget(
    sourceCoordinates: Point,
    depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame
  ): Point = js.native
  
  /**
    * Maps a region of pixels from camera image space to depth image space.
    * @param region The region of pixels to map from camera image space to depth image space.
    * @param depthFrame The depth frame to map the region of pixels to.
    */
  /* CompleteClass */
  override def mapRegionOfPixelsToTargetAsync(region: Rect, depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame): TargetCoordinates = js.native
}
