package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.windows.CreateCreateData
import typings.thunderbirdWebextBrowser.browser.windows.GetInfo
import typings.thunderbirdWebextBrowser.browser.windows.UpdateUpdateInfo
import typings.thunderbirdWebextBrowser.browser.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windows {
  
  @JSGlobal("browser.windows")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("browser.windows.WINDOW_ID_CURRENT")
  @js.native
  val WINDOW_ID_CURRENT: Double = js.native
  
  @JSGlobal("browser.windows.WINDOW_ID_NONE")
  @js.native
  val WINDOW_ID_NONE: Double = js.native
  
  inline def create(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[Window]]
  inline def create(createData: CreateCreateData): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  inline def get(windowId: Double): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  inline def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any], getInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
  
  inline def getAll(): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Window]]]
  inline def getAll(getInfo: GetInfo): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Window]]]
  
  inline def getCurrent(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[Window]]
  inline def getCurrent(getInfo: GetInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  inline def getLastFocused(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")().asInstanceOf[js.Promise[Window]]
  inline def getLastFocused(getInfo: GetInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  @JSGlobal("browser.windows.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* window */ Window, Unit]] = js.native
  
  @JSGlobal("browser.windows.onFocusChanged")
  @js.native
  val onFocusChanged: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  @JSGlobal("browser.windows.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  inline def openDefaultBrowser(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDefaultBrowser")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def remove(windowId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def update(windowId: Double, updateInfo: UpdateUpdateInfo): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], updateInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
}
