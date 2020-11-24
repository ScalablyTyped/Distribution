package typings.tuyaPanelKit.tabRouterMod

import typings.std.Extract
import typings.tuyaPanelKit.anon.KeyType
import typings.tuyaPanelKit.routersTypesMod.NavigationRoute
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<ParamList>, 'history'> & {  type :'tab',   history :std.Array<{  type :'route',   key :string}>} */
@js.native
trait TabNavigationState[ParamList /* <: ParamListBase */] extends js.Object {
  
  /**
    * List of previously visited route keys.
    */
  // tslint:disable-next-line array-type
  var history: js.Array[KeyType] = js.native
  
  var index: Double = js.native
  
  var key: String = js.native
  
  var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
  
  var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
  
  var stale: `false` = js.native
  
  /**
    * Type of the router, in this case, it's tab.
    */
  var `type`: String with tab = js.native
}
object TabNavigationState {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](
    history: js.Array[KeyType],
    index: Double,
    key: String,
    routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
    routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
    stale: `false`,
    `type`: String with tab
  ): TabNavigationState[ParamList] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabNavigationState[ParamList]]
  }
  
  @scala.inline
  implicit class TabNavigationStateOps[Self <: TabNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with TabNavigationState[ParamList]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHistoryVarargs(value: KeyType*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[KeyType]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStale(value: `false`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String with tab): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
