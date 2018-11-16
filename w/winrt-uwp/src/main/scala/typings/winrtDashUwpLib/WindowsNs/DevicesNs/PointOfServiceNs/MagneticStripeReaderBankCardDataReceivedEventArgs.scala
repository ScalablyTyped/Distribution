package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides bank card data from the BankCardDataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderBankCardDataReceivedEventArgs () extends js.Object {
  /** Gets the account number from the swiped bank card. */
  var accountNumber: java.lang.String = js.native
  /** Gets the expiration date from the swiped card. */
  var expirationDate: java.lang.String = js.native
  /** Gets the first name from the swiped bank card. */
  var firstName: java.lang.String = js.native
  /** Gets the middle initial from the swiped bank card. */
  var middleInitial: java.lang.String = js.native
  /** Gets the data from the swiped bank card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the service code for the swiped bank card. */
  var serviceCode: java.lang.String = js.native
  /** Gets the suffix from the swiped bank card. */
  var suffix: java.lang.String = js.native
  /** Gets the surname from the swiped bank card. */
  var surname: java.lang.String = js.native
  /** Gets the title from the swiped bank card. */
  var title: java.lang.String = js.native
}

