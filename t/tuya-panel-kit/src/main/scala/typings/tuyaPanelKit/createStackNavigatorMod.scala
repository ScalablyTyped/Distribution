package typings.tuyaPanelKit

import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackTypesMod.StackNavigationConfig
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typings.tuyaPanelKit.typesMod.DefaultNavigatorOptions
import typings.tuyaPanelKit.typesMod.TypedNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStackNavigatorMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/navigators/createStackNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  inline def default[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ]]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  trait Props
    extends StObject
       with DefaultNavigatorOptions[StackNavigationOptions, ParamListBase]
       with StackNavigationConfig
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
  }
}
