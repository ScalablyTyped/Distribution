package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
@js.native
trait PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  
  var id: js.UndefOr[String] = js.native
}
object PublicKeyCredentialRpEntity {
  
  @scala.inline
  def apply(name: String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialRpEntityMutableBuilder[Self <: PublicKeyCredentialRpEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
