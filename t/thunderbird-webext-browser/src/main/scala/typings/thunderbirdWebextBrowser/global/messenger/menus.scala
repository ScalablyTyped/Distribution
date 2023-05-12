package typings.thunderbirdWebextBrowser.global.messenger

import typings.std.Element
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.menus.CreateCreateProperties
import typings.thunderbirdWebextBrowser.messenger.menus.OnClickData
import typings.thunderbirdWebextBrowser.messenger.menus.OnShowData
import typings.thunderbirdWebextBrowser.messenger.menus.OverrideContextContextOptions
import typings.thunderbirdWebextBrowser.messenger.menus.UpdateUpdateProperties
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menus {
  
  @JSGlobal("messenger.menus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("messenger.menus.ACTION_MENU_TOP_LEVEL_LIMIT")
  @js.native
  val ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  
  inline def create(createProperties: CreateCreateProperties): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  inline def create(createProperties: CreateCreateProperties, callback: js.Function0[Unit]): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def getTargetElement(targetElementId: Double): Element | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetElement")(targetElementId.asInstanceOf[js.Any]).asInstanceOf[Element | Unit]
  
  @JSGlobal("messenger.menus.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]] = js.native
  
  @JSGlobal("messenger.menus.onHidden")
  @js.native
  val onHidden: WebExtEvent[js.Function0[Unit]] = js.native
  
  @JSGlobal("messenger.menus.onShown")
  @js.native
  val onShown: WebExtEvent[js.Function2[/* info */ OnShowData, /* tab */ Tab, Unit]] = js.native
  
  inline def overrideContext(contextOptions: OverrideContextContextOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideContext")(contextOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def refresh(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[js.Promise[Any]]
  
  inline def remove(menuItemId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(menuItemId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeAll(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[js.Promise[Unit]]
  
  inline def update(id: String, updateProperties: UpdateUpdateProperties): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def update(id: Double, updateProperties: UpdateUpdateProperties): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
