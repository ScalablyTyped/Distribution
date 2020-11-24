package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationSession extends js.Object {
  
  /**
    * The access token.
    */
  val accessToken: String = js.native
  
  /**
    * The account associated with the session.
    */
  val account: AuthenticationSessionAccountInformation = js.native
  
  /**
    * The identifier of the authentication session.
    */
  val id: String = js.native
  
  /**
    * The permissions granted by the session's access token. Available scopes
    * are defined by the [AuthenticationProvider](#AuthenticationProvider).
    */
  val scopes: js.Array[String] = js.native
}
object AuthenticationSession {
  
  @scala.inline
  def apply(
    accessToken: String,
    account: AuthenticationSessionAccountInformation,
    id: String,
    scopes: js.Array[String]
  ): AuthenticationSession = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSession]
  }
  
  @scala.inline
  implicit class AuthenticationSessionOps[Self <: AuthenticationSession] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: AuthenticationSessionAccountInformation): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
}
