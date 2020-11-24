package typings.tuyaPanelKit.typesMod

import typings.react.mod.ReactNode
import typings.std.Extract
import typings.tuyaPanelKit.anon.Navigation
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.DefaultRouterOptions<std.Extract<keyof ParamList, string>> & {  children :react.react.ReactNode,   screenOptions :ScreenOptions | (props : {  route :tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.RouteProp<ParamList, keyof ParamList>,   navigation :any}): ScreenOptions | undefined} */
@js.native
trait DefaultNavigatorOptions[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */] extends js.Object {
  
  /**
    * Children React Elements to extract the route configuration from.
    * Only `Screen` components are supported as children.
    */
  var children: ReactNode = js.native
  
  /**
    * Name of the route to focus by on initial render.
    * If not specified, usually the first route is used.
    */
  var initialRouteName: js.UndefOr[Extract[/* keyof ParamList */ String, String]] = js.native
  
  /**
    * Default options for all screens under this navigator.
    */
  var screenOptions: js.UndefOr[ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])] = js.native
}
object DefaultNavigatorOptions {
  
  @scala.inline
  def apply[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */](): DefaultNavigatorOptions[ScreenOptions, ParamList] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNavigatorOptions[ScreenOptions, ParamList]]
  }
  
  @scala.inline
  implicit class DefaultNavigatorOptionsOps[Self <: DefaultNavigatorOptions[_, _], ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */] (val x: Self with (DefaultNavigatorOptions[ScreenOptions, ParamList])) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: Extract[/* keyof ParamList */ String, String]): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ Navigation[ParamList] => ScreenOptions): Self = this.set("screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])): Self = this.set("screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenOptions: Self = this.set("screenOptions", js.undefined)
  }
}
