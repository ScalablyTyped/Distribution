package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
trait MagneticStripeReaderAamvaCardDataReceivedEventArgs extends StObject {
  
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
  
  @scala.inline
  implicit class MagneticStripeReaderAamvaCardDataReceivedEventArgsMutableBuilder[Self <: MagneticStripeReaderAamvaCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndorsements(value: String): Self = StObject.set(x, "endorsements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeColor(value: String): Self = StObject.set(x, "eyeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHairColor(value: String): Self = StObject.set(x, "hairColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseNumber(value: String): Self = StObject.set(x, "licenseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: MagneticStripeReaderReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictions(value: String): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
