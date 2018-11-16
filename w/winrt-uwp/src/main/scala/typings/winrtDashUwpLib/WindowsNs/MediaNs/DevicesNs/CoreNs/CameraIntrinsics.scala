package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the intrinsics that describe the camera distortion model. */
@JSGlobal("Windows.Media.Devices.Core.CameraIntrinsics")
@js.native
class CameraIntrinsics protected () extends js.Object {
  /**
                       * Initializes a new instance of the CameraIntrinsics class.
                       * @param focalLength The focal length of the camera.
                       * @param principalPoint The principal point of the camera.
                       * @param radialDistortion The radial distortion coefficient of the camera.
                       * @param tangentialDistortion The tangential distortion coefficient of the camera.
                       * @param imageWidth The image width of the camera, in pixels.
                       * @param imageHeight The image height of the camera, in pixels.
                       */
  def this(focalLength: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2, principalPoint: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2, radialDistortion: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3, tangentialDistortion: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2, imageWidth: scala.Double, imageHeight: scala.Double) = this()
  /** Gets the focal length of the camera. */
  var focalLength: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2 = js.native
  /** Gets the image height of the camera, in pixels. */
  var imageHeight: scala.Double = js.native
  /** Gets the image width of the camera, in pixels. */
  var imageWidth: scala.Double = js.native
  /** Gets the principal point of the camera. */
  var principalPoint: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2 = js.native
  /** Gets the radial distortion coefficient of the camera. */
  var radialDistortion: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3 = js.native
  /** Gets the tangential distortion coefficient of the camera. */
  var tangentialDistortion: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2 = js.native
  /**
                       * Projects an array of camera space points into screen space pixel coordinates.
                       * @param coordinates The array of camera space points to project into screen space.
                       * @return The array of screen space pixel coordinates.
                       */
  def projectManyOntoFrame(coordinates: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3): winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /**
                       * Projects a camera space point into screen space pixel coordinates.
                       * @param coordinate The camera space point to project into screen space.
                       * @return The screen space pixel coordinates.
                       */
  def projectOntoFrame(coordinate: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3): winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /**
                       * Unprojects pixel coordinates into a camera space ray from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
                       * @param pixelCoordinate The pixel coordinates to unproject into camera space.
                       * @return The X, Y coordinates of the unprojected pixel on the plane at Z = 1.0.
                       */
  def unprojectAtUnitDepth(pixelCoordinate: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2 = js.native
  /**
                       * Unprojects an array pixel coordinates into a camera space rays from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
                       * @param pixelCoordinates The array of pixel coordinates to unproject into camera space.
                       * @return The array of X, Y coordinates of the unprojected pixels on the plane at Z = 1.0.
                       */
  def unprojectPixelsAtUnitDepth(pixelCoordinates: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector2 = js.native
}

