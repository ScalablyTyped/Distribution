package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides bank card data from the BankCardDataReceived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs")
@js.native
open class MagneticStripeReaderBankCardDataReceivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs {
  
  /** Gets the account number from the swiped bank card. */
  /* CompleteClass */
  var accountNumber: String = js.native
  
  /** Gets the expiration date from the swiped card. */
  /* CompleteClass */
  var expirationDate: String = js.native
  
  /** Gets the first name from the swiped bank card. */
  /* CompleteClass */
  var firstName: String = js.native
  
  /** Gets the middle initial from the swiped bank card. */
  /* CompleteClass */
  var middleInitial: String = js.native
  
  /** Gets the data from the swiped bank card. */
  /* CompleteClass */
  var report: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport = js.native
  
  /** Gets the service code for the swiped bank card. */
  /* CompleteClass */
  var serviceCode: String = js.native
  
  /** Gets the suffix from the swiped bank card. */
  /* CompleteClass */
  var suffix: String = js.native
  
  /** Gets the surname from the swiped bank card. */
  /* CompleteClass */
  var surname: String = js.native
  
  /** Gets the title from the swiped bank card. */
  /* CompleteClass */
  var title: String = js.native
}
