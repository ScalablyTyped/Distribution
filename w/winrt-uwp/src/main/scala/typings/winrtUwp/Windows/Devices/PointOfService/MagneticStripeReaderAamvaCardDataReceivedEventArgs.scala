package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
trait MagneticStripeReaderAamvaCardDataReceivedEventArgs extends js.Object {
  /** Gets the address from the swiped AAMVA card. */
  var address: String
  /** Gets the birth date from the swiped AAMVA card. */
  var birthDate: String
  /** Gets the city from the swiped AAMVA card. */
  var city: String
  /** Gets the class from the swiped AAMVA card. */
  var `class`: String
  /** Gets the endorsements from the swiped AAMVA card. */
  var endorsements: String
  /** Gets the expiration date from the swiped AAMVA card. */
  var expirationDate: String
  /** Gets the eye color from the swiped AAMVA card. */
  var eyeColor: String
  /** Gets the first name from the swiped AAMVA card. */
  var firstName: String
  /** Gets the gender from the swiped AAMVA card. */
  var gender: String
  /** Gets the hair color from the swiped AAMVA card. */
  var hairColor: String
  /** Gets the height from the swiped AAMVA card. */
  var height: String
  /** Gets the license number from the swiped AAMVA card. */
  var licenseNumber: String
  /** Gets the postal code from the swiped AAMVA card. */
  var postalCode: String
  /** Gets the additional data from the swiped AAMVA card. */
  var report: MagneticStripeReaderReport
  /** Gets the restrictions from the swiped AAMVA card. */
  var restrictions: String
  /** Gets the state from the swiped AAMVA card. */
  var state: String
  /** Gets the suffix from the swiped AAMVA card. */
  var suffix: String
  /** Gets the surname from the swiped card. */
  var surname: String
  /** Gets the weight from the swiped AAMVA card. */
  var weight: String
}

object MagneticStripeReaderAamvaCardDataReceivedEventArgs {
  @scala.inline
  def apply(
    address: String,
    birthDate: String,
    city: String,
    `class`: String,
    endorsements: String,
    expirationDate: String,
    eyeColor: String,
    firstName: String,
    gender: String,
    hairColor: String,
    height: String,
    licenseNumber: String,
    postalCode: String,
    report: MagneticStripeReaderReport,
    restrictions: String,
    state: String,
    suffix: String,
    surname: String,
    weight: String
  ): MagneticStripeReaderAamvaCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], birthDate = birthDate.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], endorsements = endorsements.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], eyeColor = eyeColor.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], hairColor = hairColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], licenseNumber = licenseNumber.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  }
}

