package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAamvaCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderAamvaCardDataReceivedEventArgs () extends js.Object {
  /** Gets the address from the swiped AAMVA card. */
  var address: String = js.native
  /** Gets the birth date from the swiped AAMVA card. */
  var birthDate: String = js.native
  /** Gets the city from the swiped AAMVA card. */
  var city: String = js.native
  /** Gets the class from the swiped AAMVA card. */
  var `class`: String = js.native
  /** Gets the endorsements from the swiped AAMVA card. */
  var endorsements: String = js.native
  /** Gets the expiration date from the swiped AAMVA card. */
  var expirationDate: String = js.native
  /** Gets the eye color from the swiped AAMVA card. */
  var eyeColor: String = js.native
  /** Gets the first name from the swiped AAMVA card. */
  var firstName: String = js.native
  /** Gets the gender from the swiped AAMVA card. */
  var gender: String = js.native
  /** Gets the hair color from the swiped AAMVA card. */
  var hairColor: String = js.native
  /** Gets the height from the swiped AAMVA card. */
  var height: String = js.native
  /** Gets the license number from the swiped AAMVA card. */
  var licenseNumber: String = js.native
  /** Gets the postal code from the swiped AAMVA card. */
  var postalCode: String = js.native
  /** Gets the additional data from the swiped AAMVA card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the restrictions from the swiped AAMVA card. */
  var restrictions: String = js.native
  /** Gets the state from the swiped AAMVA card. */
  var state: String = js.native
  /** Gets the suffix from the swiped AAMVA card. */
  var suffix: String = js.native
  /** Gets the surname from the swiped card. */
  var surname: String = js.native
  /** Gets the weight from the swiped AAMVA card. */
  var weight: String = js.native
}

