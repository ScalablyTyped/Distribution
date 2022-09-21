package typings.wordpressApiFetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Nonce extends StObject {
    
    var nonce: String
  }
  object Nonce {
    
    inline def apply(nonce: String): Nonce = {
      val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nonce]
    }
    
    extension [Self <: Nonce](x: Self) {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
