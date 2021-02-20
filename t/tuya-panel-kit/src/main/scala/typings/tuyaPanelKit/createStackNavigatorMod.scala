package typings.tuyaPanelKit

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Extract
import typings.std.Record
import typings.tuyaPanelKit.anon.NavigationRoute
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackTypesMod.StackCardMode
import typings.tuyaPanelKit.stackTypesMod.StackHeaderMode
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typings.tuyaPanelKit.typesMod.TypedNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStackNavigatorMod {
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  @JSImport("tuya-panel-kit/@react-navigation/stack/navigators/createStackNavigator", JSImport.Default)
  @js.native
  def default[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ] = js.native
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native.DefaultNavigatorOptions<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationOptions, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase> & tuya-panel-kit.tuya-panel-kit/@react-navigation/native.StackRouterOptions & tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationConfig */
  @js.native
  trait Props extends StObject {
    
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
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
      
      @scala.inline
      def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
      
      @scala.inline
      def setInitialRouteName(
        value: (js.UndefOr[
              Extract[
                /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
                String
              ]
            ]) with js.UndefOr[String]
      ): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
      
      @scala.inline
      def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setScreenOptions(
        value: StackNavigationOptions | (js.Function1[/* props */ NavigationRoute, StackNavigationOptions])
      ): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenOptionsFunction1(value: /* props */ NavigationRoute => StackNavigationOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
    }
  }
}
