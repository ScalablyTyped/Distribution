package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static methods for retrieving intrinsic properties of a camera. */
@JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
@js.native
abstract class KnownCameraIntrinsicsProperties ()
  extends typings.winrtUwp.Windows.Devices.Perception.KnownCameraIntrinsicsProperties
/* static members */
@JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
@js.native
object KnownCameraIntrinsicsProperties extends js.Object {
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the focal length of the camera. */
  var focalLength: String = js.native
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the principal point, relative to the camera. */
  var principalPoint: String = js.native
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the radial distortion of the camera. */
  var radialDistortion: String = js.native
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the tangential distortion of the camera. */
  var tangentialDistortion: String = js.native
}
