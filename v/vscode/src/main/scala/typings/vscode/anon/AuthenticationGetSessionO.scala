package typings.vscode.anon

import typings.vscode.vscodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode.vscode.AuthenticationGetSessionOptions & {  createIfNone :true} */
trait AuthenticationGetSessionO extends StObject {
  
  /**
    * Whether the existing user session preference should be cleared.
    *
    * For authentication providers that support being signed into multiple accounts at once, the user will be
    * prompted to select an account to use when [getSession](#authentication.getSession) is called. This preference
    * is remembered until [getSession](#authentication.getSession) is called with this flag.
    *
    * Defaults to false.
    */
  var clearSessionPreference: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether login should be performed if there is no matching session.
    *
    * If true, a modal dialog will be shown asking the user to sign in. If false, a numbered badge will be shown
    * on the accounts activity bar icon. An entry for the extension will be added under the menu to sign in. This
    * allows quietly prompting the user to sign in.
    *
    * Defaults to false.
    */
  var createIfNone: js.UndefOr[Boolean] & `true`
}
object AuthenticationGetSessionO {
  
  inline def apply(createIfNone: js.UndefOr[Boolean] & `true`): AuthenticationGetSessionO = {
    val __obj = js.Dynamic.literal(createIfNone = createIfNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationGetSessionO]
  }
  
  extension [Self <: AuthenticationGetSessionO](x: Self) {
    
    inline def setClearSessionPreference(value: Boolean): Self = StObject.set(x, "clearSessionPreference", value.asInstanceOf[js.Any])
    
    inline def setClearSessionPreferenceUndefined: Self = StObject.set(x, "clearSessionPreference", js.undefined)
    
    inline def setCreateIfNone(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "createIfNone", value.asInstanceOf[js.Any])
  }
}
