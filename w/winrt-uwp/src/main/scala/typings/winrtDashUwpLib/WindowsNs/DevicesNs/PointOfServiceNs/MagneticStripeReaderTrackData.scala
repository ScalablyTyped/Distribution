package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the track data obtained following a card swipe. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackData")
@js.native
abstract class MagneticStripeReaderTrackData () extends js.Object {
  /** Gets the raw or decoded data from the swiped card. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

