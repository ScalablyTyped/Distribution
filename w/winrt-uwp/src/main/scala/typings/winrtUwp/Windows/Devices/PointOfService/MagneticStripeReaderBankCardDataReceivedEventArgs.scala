package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides bank card data from the BankCardDataReceived event. */
trait MagneticStripeReaderBankCardDataReceivedEventArgs extends js.Object {
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
  @scala.inline
  def apply(
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
}

