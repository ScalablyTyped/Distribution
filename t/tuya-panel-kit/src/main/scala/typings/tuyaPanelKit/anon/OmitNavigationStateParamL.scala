package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.std.Omit
import typings.tuyaPanelKit.commonActionsMod._ResetState
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>, 'routes'> & {  routes :std.Array<std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<string, object | undefined>, 'key'>>} */
@js.native
trait OmitNavigationStateParamL extends _ResetState {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: Double = js.native
  
  var key: String = js.native
  
  var routeNames: js.Array[
    Extract[
      /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
      String
    ]
  ] = js.native
  
  // tslint:disable-next-line array-type
  var routes: js.Array[
    Omit[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]], key]
  ] = js.native
  
  var stale: `false` = js.native
  
  var `type`: String = js.native
}
object OmitNavigationStateParamL {
  
  @scala.inline
  def apply(
    index: Double,
    key: String,
    routeNames: js.Array[
      Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
        String
      ]
    ],
    routes: js.Array[
      Omit[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]], key]
    ],
    stale: `false`,
    `type`: String
  ): OmitNavigationStateParamL = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitNavigationStateParamL]
  }
  
  @scala.inline
  implicit class OmitNavigationStateParamLMutableBuilder[Self <: OmitNavigationStateParamL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(
      value: (Extract[
          /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
          String
        ])*
    ): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(
      value: js.Array[
          Omit[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]], key]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (Omit[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]], key])*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
