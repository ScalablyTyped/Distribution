package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the track data obtained following a card swipe. */
trait MagneticStripeReaderTrackData extends StObject {
  
  /** Gets the raw or decoded data from the swiped card. */
  var data: IBuffer
  
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: IBuffer
  
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: IBuffer
}
object MagneticStripeReaderTrackData {
  
  inline def apply(data: IBuffer, discretionaryData: IBuffer, encryptedData: IBuffer): MagneticStripeReaderTrackData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], discretionaryData = discretionaryData.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderTrackData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagneticStripeReaderTrackData] (val x: Self) extends AnyVal {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDiscretionaryData(value: IBuffer): Self = StObject.set(x, "discretionaryData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
