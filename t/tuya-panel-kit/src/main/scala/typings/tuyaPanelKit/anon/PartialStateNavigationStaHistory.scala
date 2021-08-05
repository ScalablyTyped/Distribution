package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> */
trait PartialStateNavigationStaHistory extends StObject {
  
  var history: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var routeNames: js.UndefOr[
    js.Array[
      Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
        String
      ]
    ]
  ] = js.undefined
  
  val routes: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number], object | undefined>> */ js.Object
  ]
  
  val stale: js.UndefOr[`true`] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialStateNavigationStaHistory {
  
  inline def apply(
    routes: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number], object | undefined>> */ js.Object
    ]
  ): PartialStateNavigationStaHistory = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateNavigationStaHistory]
  }
  
  extension [Self <: PartialStateNavigationStaHistory](x: Self) {
    
    inline def setHistory(value: js.Array[js.Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    inline def setRouteNamesVarargs(
      value: (Extract[
          /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
          String
        ])*
    ): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    inline def setRoutes(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number], object | undefined>> */ js.Object
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number], object | undefined>> */ js.Object)*
    ): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    inline def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
