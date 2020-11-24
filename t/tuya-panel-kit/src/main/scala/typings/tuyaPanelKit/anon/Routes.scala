package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Routes[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  // tslint:disable-next-line array-type
  var routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.routersTypesMod.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ] = js.native
  
  var stale: js.UndefOr[`true`] = js.native
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
  implicit class RoutesOps[Self <: Routes[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Routes[State]) extends AnyVal {
    
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
    def setRoutesVarargs(
      value: (PartialRoute[
          typings.tuyaPanelKit.routersTypesMod.Route[
            /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = this.set("routes", js.Array(value :_*))
    
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
    ): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStale(value: `true`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
}
