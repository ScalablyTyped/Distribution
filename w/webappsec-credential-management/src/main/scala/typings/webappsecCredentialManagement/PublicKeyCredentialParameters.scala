package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialparameters}
  */
@js.native
trait PublicKeyCredentialParameters extends StObject {
  
  var alg: Double = js.native
  
  var `type`: `public-key` = js.native
}
object PublicKeyCredentialParameters {
  
  @scala.inline
  def apply(alg: Double, `type`: `public-key`): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
