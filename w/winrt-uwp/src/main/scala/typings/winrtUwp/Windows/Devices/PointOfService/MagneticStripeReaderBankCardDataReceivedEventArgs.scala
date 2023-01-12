package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides bank card data from the BankCardDataReceived event. */
trait MagneticStripeReaderBankCardDataReceivedEventArgs extends StObject {
  
  /** Gets the account number from the swiped bank card. */
  var accountNumber: String
  
  /** Gets the expiration date from the swiped card. */
  var expirationDate: String
  
  /** Gets the first name from the swiped bank card. */
  var firstName: String
  
  /** Gets the middle initial from the swiped bank card. */
  var middleInitial: String
  
  /** Gets the data from the swiped bank card. */
  var report: MagneticStripeReaderReport
  
  /** Gets the service code for the swiped bank card. */
  var serviceCode: String
  
  /** Gets the suffix from the swiped bank card. */
  var suffix: String
  
  /** Gets the surname from the swiped bank card. */
  var surname: String
  
  /** Gets the title from the swiped bank card. */
  var title: String
}
object MagneticStripeReaderBankCardDataReceivedEventArgs {
  
  inline def apply(
    accountNumber: String,
    expirationDate: String,
    firstName: String,
    middleInitial: String,
    report: MagneticStripeReaderReport,
    serviceCode: String,
    suffix: String,
    surname: String,
    title: String
  ): MagneticStripeReaderBankCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(accountNumber = accountNumber.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], middleInitial = middleInitial.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderBankCardDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagneticStripeReaderBankCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setMiddleInitial(value: String): Self = StObject.set(x, "middleInitial", value.asInstanceOf[js.Any])
    
    inline def setReport(value: MagneticStripeReaderReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
