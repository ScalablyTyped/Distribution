package typings.trezorConnect.cardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolMetadata extends StObject {
  
  var hash: String
  
  var url: String
}
object CardanoPoolMetadata {
  
  inline def apply(hash: String, url: String): CardanoPoolMetadata = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolMetadata]
  }
  
  extension [Self <: CardanoPoolMetadata](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
