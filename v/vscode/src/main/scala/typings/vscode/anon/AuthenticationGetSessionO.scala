package typings.vscode.anon

import typings.vscode.vscodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode.vscode.AuthenticationGetSessionOptions & {  createIfNone :true} */
@js.native
trait AuthenticationGetSessionO extends js.Object {
  
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
  var createIfNone: js.UndefOr[Boolean] with `true` = js.native
}
object AuthenticationGetSessionO {
  
  @scala.inline
  def apply(createIfNone: js.UndefOr[Boolean] with `true`): AuthenticationGetSessionO = {
    val __obj = js.Dynamic.literal(createIfNone = createIfNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationGetSessionO]
  }
  
  @scala.inline
  implicit class AuthenticationGetSessionOOps[Self <: AuthenticationGetSessionO] (val x: Self) extends AnyVal {
    
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
    def setCreateIfNone(value: js.UndefOr[Boolean] with `true`): Self = this.set("createIfNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSessionPreference(value: Boolean): Self = this.set("clearSessionPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearSessionPreference: Self = this.set("clearSessionPreference", js.undefined)
  }
}
