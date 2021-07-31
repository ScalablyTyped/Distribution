package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides convenience methods to facilitate geometric math for a camera device, combining the intrinsic properties of that camera with correlated depth frames to provide screen-space pixel to camera-space coordinate projections. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthCorrelatedCameraIntrinsics")
@js.native
abstract class PerceptionDepthCorrelatedCameraIntrinsics ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthCorrelatedCameraIntrinsics {
  
  /**
    * Unprojects all pixels in an image from camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The coordinates of each pixel in the image will be mapped from camera image space to depth image space, and then used to look up the depth in this depth frame.
    */
  /* CompleteClass */
  override def unprojectAllPixelsAtCorrelatedDepthAsync(depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame): Results = js.native
  
  /**
    * Unprojects a point in camera image space out into the coordinate frame of the camera device, using the corresponding depth from a correlated depth camera.
    * @param pixelCoordinate A point, relative to the camera frame.
    * @param depthFrame The depth frame containing the depth value to use when projecting the point into camera space. The pixelCoordinate will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    * @return An unprojected coordinate, relative to the coordinate system of the camera device. The coordinate is located in front of the camera, at the depth of the corresponding pixel in depthFrame.
    */
  /* CompleteClass */
  override def unprojectPixelAtCorrelatedDepth(
    pixelCoordinate: Point,
    depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame
  ): Vector3 = js.native
  
  /**
    * Unprojects a set of points in camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param sourceCoordinates A set of points, relative to the camera frame.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The pixelCoordinate will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    * @return A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values.
    */
  /* CompleteClass */
  override def unprojectPixelsAtCorrelatedDepth(
    sourceCoordinates: Point,
    depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame
  ): Vector3 = js.native
  
  /**
    * Unprojects a region of pixels in an image from camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param region The region of pixels to project from camera image space out into the coordinate frame of the camera device.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The pixelCoordinates will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    */
  /* CompleteClass */
  override def unprojectRegionPixelsAtCorrelatedDepthAsync(region: Rect, depthFrame: typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame): Results = js.native
}
