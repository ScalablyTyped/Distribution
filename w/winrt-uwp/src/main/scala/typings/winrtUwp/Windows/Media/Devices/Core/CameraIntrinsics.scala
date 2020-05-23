package typings.winrtUwp.Windows.Media.Devices.Core

import typings.winrtUwp.Windows.Foundation.Numerics.Vector2
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the intrinsics that describe the camera distortion model. */
trait CameraIntrinsics extends js.Object {
  /** Gets the focal length of the camera. */
  var focalLength: Vector2
  /** Gets the image height of the camera, in pixels. */
  var imageHeight: Double
  /** Gets the image width of the camera, in pixels. */
  var imageWidth: Double
  /** Gets the principal point of the camera. */
  var principalPoint: Vector2
  /** Gets the radial distortion coefficient of the camera. */
  var radialDistortion: Vector3
  /** Gets the tangential distortion coefficient of the camera. */
  var tangentialDistortion: Vector2
  /**
    * Projects an array of camera space points into screen space pixel coordinates.
    * @param coordinates The array of camera space points to project into screen space.
    * @return The array of screen space pixel coordinates.
    */
  def projectManyOntoFrame(coordinates: Vector3): Point
  /**
    * Projects a camera space point into screen space pixel coordinates.
    * @param coordinate The camera space point to project into screen space.
    * @return The screen space pixel coordinates.
    */
  def projectOntoFrame(coordinate: Vector3): Point
  /**
    * Unprojects pixel coordinates into a camera space ray from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
    * @param pixelCoordinate The pixel coordinates to unproject into camera space.
    * @return The X, Y coordinates of the unprojected pixel on the plane at Z = 1.0.
    */
  def unprojectAtUnitDepth(pixelCoordinate: Point): Vector2
  /**
    * Unprojects an array pixel coordinates into a camera space rays from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
    * @param pixelCoordinates The array of pixel coordinates to unproject into camera space.
    * @return The array of X, Y coordinates of the unprojected pixels on the plane at Z = 1.0.
    */
  def unprojectPixelsAtUnitDepth(pixelCoordinates: Point): Vector2
}

object CameraIntrinsics {
  @scala.inline
  def apply(
    focalLength: Vector2,
    imageHeight: Double,
    imageWidth: Double,
    principalPoint: Vector2,
    projectManyOntoFrame: Vector3 => Point,
    projectOntoFrame: Vector3 => Point,
    radialDistortion: Vector3,
    tangentialDistortion: Vector2,
    unprojectAtUnitDepth: Point => Vector2,
    unprojectPixelsAtUnitDepth: Point => Vector2
  ): CameraIntrinsics = {
    val __obj = js.Dynamic.literal(focalLength = focalLength.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], principalPoint = principalPoint.asInstanceOf[js.Any], projectManyOntoFrame = js.Any.fromFunction1(projectManyOntoFrame), projectOntoFrame = js.Any.fromFunction1(projectOntoFrame), radialDistortion = radialDistortion.asInstanceOf[js.Any], tangentialDistortion = tangentialDistortion.asInstanceOf[js.Any], unprojectAtUnitDepth = js.Any.fromFunction1(unprojectAtUnitDepth), unprojectPixelsAtUnitDepth = js.Any.fromFunction1(unprojectPixelsAtUnitDepth))
    __obj.asInstanceOf[CameraIntrinsics]
  }
}

