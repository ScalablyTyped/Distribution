package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Routes[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  // tslint:disable-next-line array-type
  var routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.routersTypesMod.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ]
  
  var stale: js.UndefOr[`true`] = js.undefined
}
object Routes {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](
    routes: js.Array[
      PartialRoute[
        typings.tuyaPanelKit.routersTypesMod.Route[
          /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
          js.UndefOr[js.Object]
        ]
      ]
    ]
  ): Routes[State] = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Routes[State]]
  }
  
  @scala.inline
  implicit class RoutesMutableBuilder[Self <: Routes[?], State /* <: NavigationState[ParamListBase] */] (val x: Self & Routes[State]) extends AnyVal {
    
    @scala.inline
    def setRoutes(
      value: js.Array[
          PartialRoute[
            typings.tuyaPanelKit.routersTypesMod.Route[
              /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(
      value: (PartialRoute[
          typings.tuyaPanelKit.routersTypesMod.Route[
            /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
