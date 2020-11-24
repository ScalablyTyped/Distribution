package typings.webappsecCredentialManagement

import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
  */
@js.native
trait PasswordCredential
  extends SiteBoundCredential
     with CredentialType {
  
  /**
    * If the developer wishes to specify additional data to insert into the
    * request body when submitting the credential information to a remote
    * endpoint, they can do so by assigning a FormData or URLSearchParams
    * object to this attribute. The credential information will be
    * mixed into the object to produce the body. The value is {@code null}
    * unless otherwise specified.
    */
  var additionalData: CredentialBodyType | Null = js.native
  
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via {@code fetch()}. It
    * defaults to "username", but can be overridden by a developer to match
    * whatever the backend service expects.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-idname}
    */
  var idName: String = js.native
  
  /**
    * The plain-text password. Returned for implementation of the 08/04/2017
    * Working Draft of Credential Management, not returned before this.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
    */
  val password: js.UndefOr[String] = js.native
  
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via fetch(). It defaults to
    * "password", but can be overridden by a developer to match whatever the
    * backend service expects.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordname}
    */
  var passwordName: String = js.native
  
  @JSName("type")
  val type_PasswordCredential: typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.password = js.native
}
object PasswordCredential {
  
  @scala.inline
  def apply(id: String, idName: String, passwordName: String, `type`: password): PasswordCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredential]
  }
  
  @scala.inline
  implicit class PasswordCredentialOps[Self <: PasswordCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdName(value: String): Self = this.set("idName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordName(value: String): Self = this.set("passwordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: password): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalData(value: CredentialBodyType): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataNull: Self = this.set("additionalData", null)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
