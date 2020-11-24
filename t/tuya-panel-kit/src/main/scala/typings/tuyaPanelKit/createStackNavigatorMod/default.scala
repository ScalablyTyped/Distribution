package typings.tuyaPanelKit.createStackNavigatorMod

import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typings.tuyaPanelKit.typesMod.TypedNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/stack/navigators/createStackNavigator", JSImport.Default)
@js.native
object default extends js.Object {
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  def apply[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ] = js.native
}
