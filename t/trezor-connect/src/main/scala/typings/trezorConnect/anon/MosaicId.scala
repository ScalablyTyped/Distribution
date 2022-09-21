package typings.trezorConnect.anon

import typings.trezorConnect.nemMod.MosaicID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MosaicId extends StObject {
  
  var fee: js.UndefOr[Double] = js.undefined
  
  var mosaicId: js.UndefOr[MosaicID] = js.undefined
  
  var recipient: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object MosaicId {
  
  inline def apply(): MosaicId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicId]
  }
  
  extension [Self <: MosaicId](x: Self) {
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setMosaicId(value: MosaicID): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    
    inline def setMosaicIdUndefined: Self = StObject.set(x, "mosaicId", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
