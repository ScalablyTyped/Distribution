package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the encryption algorithm supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
@js.native
abstract class MagneticStripeReaderEncryptionAlgorithms () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
@js.native
object MagneticStripeReaderEncryptionAlgorithms extends js.Object {
  /** Indicates vendor specific encryption algorithm. */
  var extendedBase: scala.Double = js.native
  /** Indicates no encryption algorithm. */
  var none: scala.Double = js.native
  /** Indicates Triple DES DUKPT (Derived Unique Key Per Transaction) encryption algorithm supported by the device. */
  var tripleDesDukpt: scala.Double = js.native
}

