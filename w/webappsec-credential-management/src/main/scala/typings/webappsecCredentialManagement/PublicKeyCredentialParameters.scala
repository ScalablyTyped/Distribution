package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialparameters}
  */
trait PublicKeyCredentialParameters extends StObject {
  
  var alg: Double
  
  var `type`: `public-key`
}
object PublicKeyCredentialParameters {
  
  @scala.inline
  def apply(alg: Double): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public-key")
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialParametersMutableBuilder[Self <: PublicKeyCredentialParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: Double): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `public-key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
