package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.PartialState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>>, 'stale'> */
@js.native
trait OmitPartialStateNavigatio extends StObject {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var routeNames: js.UndefOr[
    js.Array[
      Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
        String
      ]
    ]
  ] = js.native
  
  var routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.routersTypesMod.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OmitPartialStateNavigatio {
  
  @scala.inline
  def apply(
    routes: js.Array[
      PartialRoute[
        typings.tuyaPanelKit.routersTypesMod.Route[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
          js.UndefOr[js.Object]
        ]
      ]
    ]
  ): OmitPartialStateNavigatio = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPartialStateNavigatio]
  }
  
  @scala.inline
  implicit class OmitPartialStateNavigatioMutableBuilder[Self <: OmitPartialStateNavigatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
    def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
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
          PartialRoute[
            typings.tuyaPanelKit.routersTypesMod.Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(
      value: (PartialRoute[
          typings.tuyaPanelKit.routersTypesMod.Route[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
