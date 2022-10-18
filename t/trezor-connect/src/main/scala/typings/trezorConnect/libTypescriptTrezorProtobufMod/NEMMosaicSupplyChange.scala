package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaicSupplyChange extends StObject {
  
  var delta: Double
  
  var mosaic: String
  
  var namespace: String
  
  var `type`: NEMSupplyChangeType
}
object NEMMosaicSupplyChange {
  
  inline def apply(delta: Double, mosaic: String, namespace: String, `type`: NEMSupplyChangeType): NEMMosaicSupplyChange = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], mosaic = mosaic.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMosaicSupplyChange]
  }
  
  extension [Self <: NEMMosaicSupplyChange](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setMosaic(value: String): Self = StObject.set(x, "mosaic", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: NEMSupplyChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
