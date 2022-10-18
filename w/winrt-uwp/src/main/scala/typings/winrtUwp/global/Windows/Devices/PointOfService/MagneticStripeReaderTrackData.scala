package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the track data obtained following a card swipe. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackData")
@js.native
open class MagneticStripeReaderTrackData ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData {
  
  /** Gets the raw or decoded data from the swiped card. */
  /* CompleteClass */
  var data: IBuffer = js.native
  
  /** Gets the discretionary data from the swiped card. */
  /* CompleteClass */
  var discretionaryData: IBuffer = js.native
  
  /** Gets the encrypted data from the swiped card. */
  /* CompleteClass */
  var encryptedData: IBuffer = js.native
}
