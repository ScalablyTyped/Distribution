package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static methods for retrieving intrinsic properties of a camera. */
@JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
@js.native
abstract class KnownCameraIntrinsicsProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
@js.native
object KnownCameraIntrinsicsProperties extends js.Object {
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the focal length of the camera. */
  var focalLength: java.lang.String = js.native
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the principal point, relative to the camera. */
  var principalPoint: java.lang.String = js.native
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the radial distortion of the camera. */
  var radialDistortion: java.lang.String = js.native
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the tangential distortion of the camera. */
  var tangentialDistortion: java.lang.String = js.native
}

