package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data from the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderReport")
@js.native
abstract class MagneticStripeReaderReport () extends js.Object {
  /** Gets the additional security or encryption information for the recently swiped card. */
  var additionalSecurityInformation: IBuffer = js.native
  /** Gets the card authentication information for the recently swiped card. */
  var cardAuthenticationData: IBuffer = js.native
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  var cardAuthenticationDataLength: Double = js.native
  /** Gets the card type identifier for the recently swiped card. */
  var cardType: Double = js.native
  /** Gets a dictionary of properties for the recently swiped card. */
  var properties: IMapView[String, String] = js.native
  /** Gets the track data for Track 1. */
  var track1: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 2. */
  var track2: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 3. */
  var track3: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 4. */
  var track4: MagneticStripeReaderTrackData = js.native
}

