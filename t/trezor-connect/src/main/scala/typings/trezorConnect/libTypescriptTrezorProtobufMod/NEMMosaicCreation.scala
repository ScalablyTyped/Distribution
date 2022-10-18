package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaicCreation extends StObject {
  
  var definition: NEMMosaicDefinition
  
  var fee: UintType
  
  var sink: String
}
object NEMMosaicCreation {
  
  inline def apply(definition: NEMMosaicDefinition, fee: UintType, sink: String): NEMMosaicCreation = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMosaicCreation]
  }
  
  extension [Self <: NEMMosaicCreation](x: Self) {
    
    inline def setDefinition(value: NEMMosaicDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setSink(value: String): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
  }
}
