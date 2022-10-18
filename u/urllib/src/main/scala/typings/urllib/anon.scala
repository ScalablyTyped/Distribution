package typings.urllib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cert extends StObject {
    
    /**
      * A string or Buffer containing the certificate key of the client in PEM format.
      * Notes: This is necessary only if using the client certificate authentication
      */
    var cert: js.UndefOr[String | Buffer] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails.Default: true.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object Cert {
    
    inline def apply(): Cert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cert]
    }
    
    extension [Self <: Cert](x: Self) {
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
