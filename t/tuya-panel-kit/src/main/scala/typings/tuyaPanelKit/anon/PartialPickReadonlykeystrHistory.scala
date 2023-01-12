package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.Route<string, object | undefined>>>}> & {  state :std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.Route<string, object | undefined>>>}> & any | undefined} */
trait PartialPickReadonlykeystrHistory extends StObject {
  
  var history: js.UndefOr[js.Array[Any]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var routeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  val routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
    ]
  ]
  
  val stale: js.UndefOr[`true`] = js.undefined
  
  var state: js.UndefOr[PartialPickReadonlykeystr & Readonlystaletrueundefine & Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialPickReadonlykeystrHistory {
  
  inline def apply(
    routes: js.Array[
      PartialRoute[
        typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
      ]
    ]
  ): PartialPickReadonlykeystrHistory = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickReadonlykeystrHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPickReadonlykeystrHistory] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    inline def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRoutes(
      value: js.Array[
          PartialRoute[
            typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: (PartialRoute[
          typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    inline def setState(value: PartialPickReadonlykeystr & Readonlystaletrueundefine & Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
