package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAamvaCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderAamvaCardDataReceivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAamvaCardDataReceivedEventArgs {
  
  /** Gets the address from the swiped AAMVA card. */
  /* CompleteClass */
  var address: String = js.native
  
  /** Gets the birth date from the swiped AAMVA card. */
  /* CompleteClass */
  var birthDate: String = js.native
  
  /** Gets the city from the swiped AAMVA card. */
  /* CompleteClass */
  var city: String = js.native
  
  /** Gets the class from the swiped AAMVA card. */
  /* CompleteClass */
  var `class`: String = js.native
  
  /** Gets the endorsements from the swiped AAMVA card. */
  /* CompleteClass */
  var endorsements: String = js.native
  
  /** Gets the expiration date from the swiped AAMVA card. */
  /* CompleteClass */
  var expirationDate: String = js.native
  
  /** Gets the eye color from the swiped AAMVA card. */
  /* CompleteClass */
  var eyeColor: String = js.native
  
  /** Gets the first name from the swiped AAMVA card. */
  /* CompleteClass */
  var firstName: String = js.native
  
  /** Gets the gender from the swiped AAMVA card. */
  /* CompleteClass */
  var gender: String = js.native
  
  /** Gets the hair color from the swiped AAMVA card. */
  /* CompleteClass */
  var hairColor: String = js.native
  
  /** Gets the height from the swiped AAMVA card. */
  /* CompleteClass */
  var height: String = js.native
  
  /** Gets the license number from the swiped AAMVA card. */
  /* CompleteClass */
  var licenseNumber: String = js.native
  
  /** Gets the postal code from the swiped AAMVA card. */
  /* CompleteClass */
  var postalCode: String = js.native
  
  /** Gets the additional data from the swiped AAMVA card. */
  /* CompleteClass */
  var report: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport = js.native
  
  /** Gets the restrictions from the swiped AAMVA card. */
  /* CompleteClass */
  var restrictions: String = js.native
  
  /** Gets the state from the swiped AAMVA card. */
  /* CompleteClass */
  var state: String = js.native
  
  /** Gets the suffix from the swiped AAMVA card. */
  /* CompleteClass */
  var suffix: String = js.native
  
  /** Gets the surname from the swiped card. */
  /* CompleteClass */
  var surname: String = js.native
  
  /** Gets the weight from the swiped AAMVA card. */
  /* CompleteClass */
  var weight: String = js.native
}
