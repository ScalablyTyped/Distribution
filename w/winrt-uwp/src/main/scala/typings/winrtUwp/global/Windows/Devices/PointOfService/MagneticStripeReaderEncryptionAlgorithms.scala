package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the encryption algorithm supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
@js.native
abstract class MagneticStripeReaderEncryptionAlgorithms ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms
/* static members */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
@js.native
object MagneticStripeReaderEncryptionAlgorithms extends js.Object {
  
  /** Indicates vendor specific encryption algorithm. */
  var extendedBase: Double = js.native
  
  /** Indicates no encryption algorithm. */
  var none: Double = js.native
  
  /** Indicates Triple DES DUKPT (Derived Unique Key Per Transaction) encryption algorithm supported by the device. */
  var tripleDesDukpt: Double = js.native
}
