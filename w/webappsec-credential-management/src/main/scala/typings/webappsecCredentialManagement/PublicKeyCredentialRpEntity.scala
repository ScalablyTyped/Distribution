package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
trait PublicKeyCredentialRpEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  var id: js.UndefOr[String] = js.undefined
}
object PublicKeyCredentialRpEntity {
  
  inline def apply(name: String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
  
  extension [Self <: PublicKeyCredentialRpEntity](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
