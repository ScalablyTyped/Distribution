package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the track data obtained following a card swipe. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackData")
@js.native
abstract class MagneticStripeReaderTrackData () extends js.Object {
  /** Gets the raw or decoded data from the swiped card. */
  var data: IBuffer = js.native
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: IBuffer = js.native
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: IBuffer = js.native
}

