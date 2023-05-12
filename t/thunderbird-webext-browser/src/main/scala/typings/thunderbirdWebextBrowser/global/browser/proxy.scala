package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.proxy.OnRequestDetails
import typings.thunderbirdWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typings.thunderbirdWebextBrowser.browser.types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @JSGlobal("browser.proxy.onError")
  @js.native
  val onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]] = js.native
  
  @JSGlobal("browser.proxy.onRequest")
  @js.native
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ OnRequestDetails, Unit]] = js.native
  
  @JSGlobal("browser.proxy.settings")
  @js.native
  val settings: Setting = js.native
}
