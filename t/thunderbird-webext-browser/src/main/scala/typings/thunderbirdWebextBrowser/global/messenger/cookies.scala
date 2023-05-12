package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.cookies.Cookie
import typings.thunderbirdWebextBrowser.messenger.cookies.CookieStore
import typings.thunderbirdWebextBrowser.messenger.cookies.GetAllDetails
import typings.thunderbirdWebextBrowser.messenger.cookies.GetDetails
import typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedChangeInfo
import typings.thunderbirdWebextBrowser.messenger.cookies.RemoveDetails
import typings.thunderbirdWebextBrowser.messenger.cookies.RemoveReturnDetails
import typings.thunderbirdWebextBrowser.messenger.cookies.SetDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookies {
  
  @JSGlobal("messenger.cookies")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(details: GetDetails): js.Promise[Cookie | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie | Null]]
  
  inline def getAll(details: GetAllDetails): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
  
  inline def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookieStores")().asInstanceOf[js.Promise[js.Array[CookieStore]]]
  
  @JSGlobal("messenger.cookies.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ OnChangedChangeInfo, Unit]] = js.native
  
  inline def remove(details: RemoveDetails): js.Promise[RemoveReturnDetails | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RemoveReturnDetails | Null]]
  
  inline def set(details: SetDetails): js.Promise[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie]]
}
