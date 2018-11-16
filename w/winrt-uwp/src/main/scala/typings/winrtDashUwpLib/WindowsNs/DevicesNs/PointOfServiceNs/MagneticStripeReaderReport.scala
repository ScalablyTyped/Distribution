package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data from the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderReport")
@js.native
abstract class MagneticStripeReaderReport () extends js.Object {
  /** Gets the additional security or encryption information for the recently swiped card. */
  var additionalSecurityInformation: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the card authentication information for the recently swiped card. */
  var cardAuthenticationData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  var cardAuthenticationDataLength: scala.Double = js.native
  /** Gets the card type identifier for the recently swiped card. */
  var cardType: scala.Double = js.native
  /** Gets a dictionary of properties for the recently swiped card. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /** Gets the track data for Track 1. */
  var track1: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 2. */
  var track2: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 3. */
  var track3: MagneticStripeReaderTrackData = js.native
  /** Gets the track data for Track 4. */
  var track4: MagneticStripeReaderTrackData = js.native
}

