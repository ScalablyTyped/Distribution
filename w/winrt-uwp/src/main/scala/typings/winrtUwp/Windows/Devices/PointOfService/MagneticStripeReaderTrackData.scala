package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the track data obtained following a card swipe. */
@js.native
trait MagneticStripeReaderTrackData extends StObject {
  
  /** Gets the raw or decoded data from the swiped card. */
  var data: IBuffer = js.native
  
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: IBuffer = js.native
  
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: IBuffer = js.native
}
object MagneticStripeReaderTrackData {
  
  @scala.inline
  def apply(data: IBuffer, discretionaryData: IBuffer, encryptedData: IBuffer): MagneticStripeReaderTrackData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], discretionaryData = discretionaryData.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderTrackData]
  }
  
  @scala.inline
  implicit class MagneticStripeReaderTrackDataMutableBuilder[Self <: MagneticStripeReaderTrackData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscretionaryData(value: IBuffer): Self = StObject.set(x, "discretionaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
