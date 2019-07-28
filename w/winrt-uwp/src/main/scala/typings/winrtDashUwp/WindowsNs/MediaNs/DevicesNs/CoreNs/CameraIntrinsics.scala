package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.NumericsNs.Vector2
import typings.winrtDashUwp.WindowsNs.FoundationNs.NumericsNs.Vector3
import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
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
  def this(
    focalLength: Vector2,
    principalPoint: Vector2,
    radialDistortion: Vector3,
    tangentialDistortion: Vector2,
    imageWidth: Double,
    imageHeight: Double
  ) = this()
  /** Gets the focal length of the camera. */
  var focalLength: Vector2 = js.native
  /** Gets the image height of the camera, in pixels. */
  var imageHeight: Double = js.native
  /** Gets the image width of the camera, in pixels. */
  var imageWidth: Double = js.native
  /** Gets the principal point of the camera. */
  var principalPoint: Vector2 = js.native
  /** Gets the radial distortion coefficient of the camera. */
  var radialDistortion: Vector3 = js.native
  /** Gets the tangential distortion coefficient of the camera. */
  var tangentialDistortion: Vector2 = js.native
  /**
    * Projects an array of camera space points into screen space pixel coordinates.
    * @param coordinates The array of camera space points to project into screen space.
    * @return The array of screen space pixel coordinates.
    */
  def projectManyOntoFrame(coordinates: Vector3): Point = js.native
  /**
    * Projects a camera space point into screen space pixel coordinates.
    * @param coordinate The camera space point to project into screen space.
    * @return The screen space pixel coordinates.
    */
  def projectOntoFrame(coordinate: Vector3): Point = js.native
  /**
    * Unprojects pixel coordinates into a camera space ray from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
    * @param pixelCoordinate The pixel coordinates to unproject into camera space.
    * @return The X, Y coordinates of the unprojected pixel on the plane at Z = 1.0.
    */
  def unprojectAtUnitDepth(pixelCoordinate: Point): Vector2 = js.native
  /**
    * Unprojects an array pixel coordinates into a camera space rays from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
    * @param pixelCoordinates The array of pixel coordinates to unproject into camera space.
    * @return The array of X, Y coordinates of the unprojected pixels on the plane at Z = 1.0.
    */
  def unprojectPixelsAtUnitDepth(pixelCoordinates: Point): Vector2 = js.native
}

