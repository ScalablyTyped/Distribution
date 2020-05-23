package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the track data obtained following a card swipe. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackData")
@js.native
abstract class MagneticStripeReaderTrackData ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData {
  /** Gets the raw or decoded data from the swiped card. */
  /* CompleteClass */
  override var data: IBuffer = js.native
  /** Gets the discretionary data from the swiped card. */
  /* CompleteClass */
  override var discretionaryData: IBuffer = js.native
  /** Gets the encrypted data from the swiped card. */
  /* CompleteClass */
  override var encryptedData: IBuffer = js.native
}

