package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides bank card data from the BankCardDataReceived event. */
@js.native
trait MagneticStripeReaderBankCardDataReceivedEventArgs extends js.Object {
  /** Gets the account number from the swiped bank card. */
  var accountNumber: String = js.native
  /** Gets the expiration date from the swiped card. */
  var expirationDate: String = js.native
  /** Gets the first name from the swiped bank card. */
  var firstName: String = js.native
  /** Gets the middle initial from the swiped bank card. */
  var middleInitial: String = js.native
  /** Gets the data from the swiped bank card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the service code for the swiped bank card. */
  var serviceCode: String = js.native
  /** Gets the suffix from the swiped bank card. */
  var suffix: String = js.native
  /** Gets the surname from the swiped bank card. */
  var surname: String = js.native
  /** Gets the title from the swiped bank card. */
  var title: String = js.native
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
  @scala.inline
  implicit class MagneticStripeReaderBankCardDataReceivedEventArgsOps[Self <: MagneticStripeReaderBankCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountNumber(value: String): Self = this.set("accountNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddleInitial(value: String): Self = this.set("middleInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: MagneticStripeReaderReport): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: String): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

