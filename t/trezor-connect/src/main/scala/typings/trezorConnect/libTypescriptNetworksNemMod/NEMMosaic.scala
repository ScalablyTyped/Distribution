package typings.trezorConnect.libTypescriptNetworksNemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaic extends StObject {
  
  var mosaicId: MosaicID
  
  var quantity: Double
}
object NEMMosaic {
  
  inline def apply(mosaicId: MosaicID, quantity: Double): NEMMosaic = {
    val __obj = js.Dynamic.literal(mosaicId = mosaicId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMosaic]
  }
  
  extension [Self <: NEMMosaic](x: Self) {
    
    inline def setMosaicId(value: MosaicID): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
