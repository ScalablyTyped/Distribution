package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native.PartialState<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & any>,   type :string,   stale :false}>> */
@js.native
trait PartialStateReadonlykeystIndex extends js.Object {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var routeNames: js.UndefOr[js.Array[String]] = js.native
  
  val routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.routersTypesMod.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Readonly<tuya-panel-kit.anon.Index>['routeNames'][number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ] = js.native
  
  val stale: js.UndefOr[`true`] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PartialStateReadonlykeystIndex {
  
  @scala.inline
  def apply(
    routes: js.Array[
      PartialRoute[
        typings.tuyaPanelKit.routersTypesMod.Route[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Readonly<tuya-panel-kit.anon.Index>['routeNames'][number] */ js.Any, 
          js.UndefOr[js.Object]
        ]
      ]
    ]
  ): PartialStateReadonlykeystIndex = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateReadonlykeystIndex]
  }
  
  @scala.inline
  implicit class PartialStateReadonlykeystIndexOps[Self <: PartialStateReadonlykeystIndex] (val x: Self) extends AnyVal {
    
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
            /* import warning: importer.ImportType#apply Failed type conversion: std.Readonly<tuya-panel-kit.anon.Index>['routeNames'][number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(
      value: js.Array[
          PartialRoute[
            typings.tuyaPanelKit.routersTypesMod.Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Readonly<tuya-panel-kit.anon.Index>['routeNames'][number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteNames: Self = this.set("routeNames", js.undefined)
    
    @scala.inline
    def setStale(value: `true`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
