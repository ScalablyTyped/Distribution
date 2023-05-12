package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.proxy.OnRequestDetails
import typings.thunderbirdWebextBrowser.messenger.proxy.ProxyOnRequestEvent
import typings.thunderbirdWebextBrowser.messenger.types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @JSGlobal("messenger.proxy.onError")
  @js.native
  val onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]] = js.native
  
  @JSGlobal("messenger.proxy.onRequest")
  @js.native
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ OnRequestDetails, Unit]] = js.native
  
  @JSGlobal("messenger.proxy.settings")
  @js.native
  val settings: Setting = js.native
}
