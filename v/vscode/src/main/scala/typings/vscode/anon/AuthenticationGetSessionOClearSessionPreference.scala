package typings.vscode.anon

import typings.vscode.vscodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode.vscode.AuthenticationGetSessionOptions & {  forceNewSession :true | {  detail :string}} */
trait AuthenticationGetSessionOClearSessionPreference extends StObject {
  
  /**
    * Whether the existing user session preference should be cleared.
    *
    * For authentication providers that support being signed into multiple accounts at once, the user will be
    * prompted to select an account to use when {@link authentication.getSession getSession} is called. This preference
    * is remembered until {@link authentication.getSession getSession} is called with this flag.
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
    * If there is a matching session but the extension has not been granted access to it, setting this to true
    * will also result in an immediate modal dialog, and false will add a numbered badge to the accounts icon.
    *
    * Defaults to false.
    *
    * Note: you cannot use this option with {@link AuthenticationGetSessionOptions.silent silent}.
    */
  var createIfNone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether we should attempt to reauthenticate even if there is already a session available.
    *
    * If true, a modal dialog will be shown asking the user to sign in again. This is mostly used for scenarios
    * where the token needs to be re minted because it has lost some authorization.
    *
    * If there are no existing sessions and forceNewSession is true, it will behave identically to
    * {@link AuthenticationGetSessionOptions.createIfNone createIfNone}.
    *
    * This defaults to false.
    */
  var forceNewSession: (js.UndefOr[Boolean | Detail]) & (`true` | Detail)
  
  /**
    * Whether we should show the indication to sign in in the Accounts menu.
    *
    * If false, the user will be shown a badge on the Accounts menu with an option to sign in for the extension.
    * If true, no indication will be shown.
    *
    * Defaults to false.
    *
    * Note: you cannot use this option with any other options that prompt the user like {@link AuthenticationGetSessionOptions.createIfNone createIfNone}.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}
object AuthenticationGetSessionOClearSessionPreference {
  
  inline def apply(forceNewSession: (js.UndefOr[Boolean | Detail]) & (`true` | Detail)): AuthenticationGetSessionOClearSessionPreference = {
    val __obj = js.Dynamic.literal(forceNewSession = forceNewSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationGetSessionOClearSessionPreference]
  }
  
  extension [Self <: AuthenticationGetSessionOClearSessionPreference](x: Self) {
    
    inline def setClearSessionPreference(value: Boolean): Self = StObject.set(x, "clearSessionPreference", value.asInstanceOf[js.Any])
    
    inline def setClearSessionPreferenceUndefined: Self = StObject.set(x, "clearSessionPreference", js.undefined)
    
    inline def setCreateIfNone(value: Boolean): Self = StObject.set(x, "createIfNone", value.asInstanceOf[js.Any])
    
    inline def setCreateIfNoneUndefined: Self = StObject.set(x, "createIfNone", js.undefined)
    
    inline def setForceNewSession(value: (js.UndefOr[Boolean | Detail]) & (`true` | Detail)): Self = StObject.set(x, "forceNewSession", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
