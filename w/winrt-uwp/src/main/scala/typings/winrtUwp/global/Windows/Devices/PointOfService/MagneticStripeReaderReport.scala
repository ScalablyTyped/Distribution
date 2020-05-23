package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data from the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderReport")
@js.native
abstract class MagneticStripeReaderReport ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport {
  /** Gets the additional security or encryption information for the recently swiped card. */
  /* CompleteClass */
  override var additionalSecurityInformation: IBuffer = js.native
  /** Gets the card authentication information for the recently swiped card. */
  /* CompleteClass */
  override var cardAuthenticationData: IBuffer = js.native
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  /* CompleteClass */
  override var cardAuthenticationDataLength: Double = js.native
  /** Gets the card type identifier for the recently swiped card. */
  /* CompleteClass */
  override var cardType: Double = js.native
  /** Gets a dictionary of properties for the recently swiped card. */
  /* CompleteClass */
  override var properties: IMapView[String, String] = js.native
  /** Gets the track data for Track 1. */
  /* CompleteClass */
  override var track1: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 2. */
  /* CompleteClass */
  override var track2: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 3. */
  /* CompleteClass */
  override var track3: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 4. */
  /* CompleteClass */
  override var track4: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
}

