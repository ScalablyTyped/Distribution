package typings.tuyaPanelKit.routersTypesMod

import typings.std.Extract
import typings.std.Omit
import typings.tuyaPanelKit.anon.`16`
import typings.tuyaPanelKit.tuyaPanelKitStrings.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>, 'stale' | 'routes'>> & {  routes :std.Array<std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<string, object | undefined>, 'key'> & {  state :tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.InitialState | undefined}>}> */
@js.native
trait InitialState extends js.Object {
  
  val history: js.UndefOr[js.Array[_]] = js.native
  
  val index: js.UndefOr[Double] = js.native
  
  val key: js.UndefOr[String] = js.native
  
  val routeNames: js.UndefOr[
    js.Array[
      Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
        String
      ]
    ]
  ] = js.native
  
  val routes: js.Array[
    (Omit[Route[String, js.UndefOr[js.Object]], typings.tuyaPanelKit.tuyaPanelKitStrings.key]) with `16`
  ] = js.native
  
  val `type`: js.UndefOr[String] = js.native
}
object InitialState {
  
  @scala.inline
  def apply(routes: js.Array[(Omit[Route[String, js.UndefOr[js.Object]], key]) with `16`]): InitialState = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialState]
  }
  
  @scala.inline
  implicit class InitialStateOps[Self <: InitialState] (val x: Self) extends AnyVal {
    
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
    def setRoutesVarargs(value: ((Omit[Route[String, js.UndefOr[js.Object]], key]) with `16`)*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[(Omit[Route[String, js.UndefOr[js.Object]], key]) with `16`]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
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
    def setRouteNamesVarargs(
      value: (Extract[
          /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
          String
        ])*
    ): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteNames: Self = this.set("routeNames", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
