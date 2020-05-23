package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the track data obtained following a card swipe. */
trait MagneticStripeReaderTrackData extends js.Object {
  /** Gets the raw or decoded data from the swiped card. */
  var data: IBuffer
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: IBuffer
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: IBuffer
}

object MagneticStripeReaderTrackData {
  @scala.inline
  def apply(data: IBuffer, discretionaryData: IBuffer, encryptedData: IBuffer): MagneticStripeReaderTrackData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], discretionaryData = discretionaryData.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderTrackData]
  }
}

