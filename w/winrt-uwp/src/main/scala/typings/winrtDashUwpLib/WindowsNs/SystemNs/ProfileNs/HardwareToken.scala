package typings
package winrtDashUwpLib.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a token that contains a hardware based identification that is sufficiently unique. */
@JSGlobal("Windows.System.Profile.HardwareToken")
@js.native
abstract class HardwareToken () extends js.Object {
  /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
  var certificate: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the hardware identifier that identifies the device. */
  var id: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
  var signature: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

