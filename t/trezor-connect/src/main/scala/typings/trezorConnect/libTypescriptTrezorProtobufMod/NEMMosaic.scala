package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaic extends StObject {
  
  var mosaic: String
  
  var namespace: String
  
  var quantity: Double
}
object NEMMosaic {
  
  inline def apply(mosaic: String, namespace: String, quantity: Double): NEMMosaic = {
    val __obj = js.Dynamic.literal(mosaic = mosaic.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMosaic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMMosaic] (val x: Self) extends AnyVal {
    
    inline def setMosaic(value: String): Self = StObject.set(x, "mosaic", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
