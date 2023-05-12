package typings.thunderbirdWebextBrowser.global.messenger

import typings.std.Window
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.`extension`.GetViewsFetchProperties
import typings.thunderbirdWebextBrowser.messenger.`extension`.LastError
import typings.thunderbirdWebextBrowser.messenger.runtime.MessageSender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `extension` {
  
  @JSGlobal("messenger.extension")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundPage(): Window | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")().asInstanceOf[Window | Unit]
  
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getViews(): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")().asInstanceOf[js.Array[Window]]
  inline def getViews(fetchProperties: GetViewsFetchProperties): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")(fetchProperties.asInstanceOf[js.Any]).asInstanceOf[js.Array[Window]]
  
  @JSGlobal("messenger.extension.inIncognitoContext")
  @js.native
  val inIncognitoContext: js.UndefOr[Boolean] = js.native
  
  inline def isAllowedFileSchemeAccess(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowedFileSchemeAccess")().asInstanceOf[js.Promise[Boolean]]
  
  inline def isAllowedIncognitoAccess(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowedIncognitoAccess")().asInstanceOf[js.Promise[Boolean]]
  
  @JSGlobal("messenger.extension.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  @JSGlobal("messenger.extension.onRequest")
  @js.native
  val onRequest: js.UndefOr[
    WebExtEvent[
      js.Function3[
        /* request */ Any, 
        /* sender */ MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
        Unit
      ]
    ]
  ] = js.native
  
  @JSGlobal("messenger.extension.onRequestExternal")
  @js.native
  val onRequestExternal: js.UndefOr[
    WebExtEvent[
      js.Function3[
        /* request */ Any, 
        /* sender */ MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
        Unit
      ]
    ]
  ] = js.native
  
  inline def setUpdateUrlData(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpdateUrlData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
