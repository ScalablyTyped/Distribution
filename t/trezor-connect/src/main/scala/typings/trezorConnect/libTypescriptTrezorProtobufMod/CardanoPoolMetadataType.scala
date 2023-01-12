package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolMetadataType extends StObject {
  
  var hash: String
  
  var url: String
}
object CardanoPoolMetadataType {
  
  inline def apply(hash: String, url: String): CardanoPoolMetadataType = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolMetadataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoPoolMetadataType] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
