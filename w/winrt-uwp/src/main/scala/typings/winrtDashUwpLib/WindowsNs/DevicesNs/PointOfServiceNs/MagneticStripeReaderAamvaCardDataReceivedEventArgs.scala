package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAamvaCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderAamvaCardDataReceivedEventArgs () extends js.Object {
  /** Gets the address from the swiped AAMVA card. */
  var address: java.lang.String = js.native
  /** Gets the birth date from the swiped AAMVA card. */
  var birthDate: java.lang.String = js.native
  /** Gets the city from the swiped AAMVA card. */
  var city: java.lang.String = js.native
  /** Gets the class from the swiped AAMVA card. */
  var `class`: java.lang.String = js.native
  /** Gets the endorsements from the swiped AAMVA card. */
  var endorsements: java.lang.String = js.native
  /** Gets the expiration date from the swiped AAMVA card. */
  var expirationDate: java.lang.String = js.native
  /** Gets the eye color from the swiped AAMVA card. */
  var eyeColor: java.lang.String = js.native
  /** Gets the first name from the swiped AAMVA card. */
  var firstName: java.lang.String = js.native
  /** Gets the gender from the swiped AAMVA card. */
  var gender: java.lang.String = js.native
  /** Gets the hair color from the swiped AAMVA card. */
  var hairColor: java.lang.String = js.native
  /** Gets the height from the swiped AAMVA card. */
  var height: java.lang.String = js.native
  /** Gets the license number from the swiped AAMVA card. */
  var licenseNumber: java.lang.String = js.native
  /** Gets the postal code from the swiped AAMVA card. */
  var postalCode: java.lang.String = js.native
  /** Gets the additional data from the swiped AAMVA card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the restrictions from the swiped AAMVA card. */
  var restrictions: java.lang.String = js.native
  /** Gets the state from the swiped AAMVA card. */
  var state: java.lang.String = js.native
  /** Gets the suffix from the swiped AAMVA card. */
  var suffix: java.lang.String = js.native
  /** Gets the surname from the swiped card. */
  var surname: java.lang.String = js.native
  /** Gets the weight from the swiped AAMVA card. */
  var weight: java.lang.String = js.native
}

