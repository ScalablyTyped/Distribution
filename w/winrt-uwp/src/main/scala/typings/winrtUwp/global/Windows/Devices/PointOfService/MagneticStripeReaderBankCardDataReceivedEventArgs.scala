package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides bank card data from the BankCardDataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderBankCardDataReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs {
  /** Gets the account number from the swiped bank card. */
  /* CompleteClass */
  override var accountNumber: String = js.native
  /** Gets the expiration date from the swiped card. */
  /* CompleteClass */
  override var expirationDate: String = js.native
  /** Gets the first name from the swiped bank card. */
  /* CompleteClass */
  override var firstName: String = js.native
  /** Gets the middle initial from the swiped bank card. */
  /* CompleteClass */
  override var middleInitial: String = js.native
  /** Gets the data from the swiped bank card. */
  /* CompleteClass */
  override var report: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport = js.native
  /** Gets the service code for the swiped bank card. */
  /* CompleteClass */
  override var serviceCode: String = js.native
  /** Gets the suffix from the swiped bank card. */
  /* CompleteClass */
  override var suffix: String = js.native
  /** Gets the surname from the swiped bank card. */
  /* CompleteClass */
  override var surname: String = js.native
  /** Gets the title from the swiped bank card. */
  /* CompleteClass */
  override var title: String = js.native
}

