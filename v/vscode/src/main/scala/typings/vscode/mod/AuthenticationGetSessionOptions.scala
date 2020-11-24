package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationGetSessionOptions extends js.Object {
  
  /**
    * Whether the existing user session preference should be cleared.
    *
    * For authentication providers that support being signed into multiple accounts at once, the user will be
    * prompted to select an account to use when [getSession](#authentication.getSession) is called. This preference
    * is remembered until [getSession](#authentication.getSession) is called with this flag.
    *
    * Defaults to false.
    */
  var clearSessionPreference: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether login should be performed if there is no matching session.
    *
    * If true, a modal dialog will be shown asking the user to sign in. If false, a numbered badge will be shown
    * on the accounts activity bar icon. An entry for the extension will be added under the menu to sign in. This
    * allows quietly prompting the user to sign in.
    *
    * Defaults to false.
    */
  var createIfNone: js.UndefOr[Boolean] = js.native
}
object AuthenticationGetSessionOptions {
  
  @scala.inline
  def apply(): AuthenticationGetSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationGetSessionOptions]
  }
  
  @scala.inline
  implicit class AuthenticationGetSessionOptionsOps[Self <: AuthenticationGetSessionOptions] (val x: Self) extends AnyVal {
    
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
    def setClearSessionPreference(value: Boolean): Self = this.set("clearSessionPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearSessionPreference: Self = this.set("clearSessionPreference", js.undefined)
    
    @scala.inline
    def setCreateIfNone(value: Boolean): Self = this.set("createIfNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateIfNone: Self = this.set("createIfNone", js.undefined)
  }
}
