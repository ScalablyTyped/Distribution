package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data from the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderReport")
@js.native
abstract class MagneticStripeReaderReport ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport {
  
  /** Gets the additional security or encryption information for the recently swiped card. */
  /* CompleteClass */
  var additionalSecurityInformation: IBuffer = js.native
  
  /** Gets the card authentication information for the recently swiped card. */
  /* CompleteClass */
  var cardAuthenticationData: IBuffer = js.native
  
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  /* CompleteClass */
  var cardAuthenticationDataLength: Double = js.native
  
  /** Gets the card type identifier for the recently swiped card. */
  /* CompleteClass */
  var cardType: Double = js.native
  
  /** Gets a dictionary of properties for the recently swiped card. */
  /* CompleteClass */
  var properties: IMapView[String, String] = js.native
  
  /** Gets the track data for Track 1. */
  /* CompleteClass */
  var track1: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 2. */
  /* CompleteClass */
  var track2: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 3. */
  /* CompleteClass */
  var track3: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 4. */
  /* CompleteClass */
  var track4: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
}
