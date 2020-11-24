package typings.tuyaPanelKit.createStackNavigatorMod

import typings.react.mod.ReactNode
import typings.std.Extract
import typings.tuyaPanelKit.anon.NavigationRoute
import typings.tuyaPanelKit.stackTypesMod.StackCardMode
import typings.tuyaPanelKit.stackTypesMod.StackHeaderMode
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line strict-export-declare-modifiers
/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native.DefaultNavigatorOptions<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationOptions, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase> & tuya-panel-kit.tuya-panel-kit/@react-navigation/native.StackRouterOptions & tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationConfig */
@js.native
trait Props extends js.Object {
  
  /**
    * Children React Elements to extract the route configuration from.
    * Only `Screen` components are supported as children.
    */
  var children: ReactNode = js.native
  
  /**
    * Whether inactive screens should be detached from the view hierarchy to save memory.
    * Make sure to call `enableScreens` from `react-native-screens` to make it work.
    * Defaults to `true` on Android, depends on the version of `react-native-screens` on iOS.
    */
  var detachInactiveScreens: js.UndefOr[Boolean] = js.native
  
  var headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  /**
    * Name of the route to focus by on initial render.
    * If not specified, usually the first route is used.
    */
  var initialRouteName: (js.UndefOr[
    Extract[
      /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
      String
    ]
  ]) with js.UndefOr[String] = js.native
  
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[StackCardMode] = js.native
  
  /**
    * Default options for all screens under this navigator.
    */
  var screenOptions: js.UndefOr[
    StackNavigationOptions | (js.Function1[/* props */ NavigationRoute, StackNavigationOptions])
  ] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDetachInactiveScreens(value: Boolean): Self = this.set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetachInactiveScreens: Self = this.set("detachInactiveScreens", js.undefined)
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMode: Self = this.set("headerMode", js.undefined)
    
    @scala.inline
    def setInitialRouteName(
      value: (js.UndefOr[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ]) with js.UndefOr[String]
    ): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = this.set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandlingEnabled: Self = this.set("keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setScreenOptionsFunction1(value: /* props */ NavigationRoute => StackNavigationOptions): Self = this.set("screenOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenOptions(
      value: StackNavigationOptions | (js.Function1[/* props */ NavigationRoute, StackNavigationOptions])
    ): Self = this.set("screenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenOptions: Self = this.set("screenOptions", js.undefined)
  }
}
