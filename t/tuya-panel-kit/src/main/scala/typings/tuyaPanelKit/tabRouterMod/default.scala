package typings.tuyaPanelKit.tabRouterMod

import typings.std.Record
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.routersTypesMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
}
