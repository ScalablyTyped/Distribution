package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.identity.AccountInfo
import typings.thunderbirdWebextBrowser.browser.identity.GetAuthTokenDetails
import typings.thunderbirdWebextBrowser.browser.identity.GetProfileUserInfoReturnUserinfo
import typings.thunderbirdWebextBrowser.browser.identity.LaunchWebAuthFlowDetails
import typings.thunderbirdWebextBrowser.browser.identity.RemoveCachedAuthTokenDetails
import typings.thunderbirdWebextBrowser.browser.identity.RemoveCachedAuthTokenReturnUserinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identity {
  
  @JSGlobal("browser.identity")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccounts(): js.Promise[js.Array[AccountInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")().asInstanceOf[js.Promise[js.Array[AccountInfo]]]
  
  inline def getAuthToken(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")().asInstanceOf[js.Promise[String]]
  inline def getAuthToken(details: GetAuthTokenDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getProfileUserInfo(): js.Promise[GetProfileUserInfoReturnUserinfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")().asInstanceOf[js.Promise[GetProfileUserInfoReturnUserinfo]]
  
  inline def getRedirectURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")().asInstanceOf[String]
  inline def getRedirectURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def launchWebAuthFlow(details: LaunchWebAuthFlowDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSGlobal("browser.identity.onSignInChanged")
  @js.native
  val onSignInChanged: js.UndefOr[
    WebExtEvent[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
  ] = js.native
  
  inline def removeCachedAuthToken(details: RemoveCachedAuthTokenDetails): js.Promise[RemoveCachedAuthTokenReturnUserinfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RemoveCachedAuthTokenReturnUserinfo]]
}
