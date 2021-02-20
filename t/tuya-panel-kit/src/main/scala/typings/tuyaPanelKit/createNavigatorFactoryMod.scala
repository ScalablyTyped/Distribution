package typings.tuyaPanelKit

import typings.react.mod.ComponentType
import typings.std.Record
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.EventMapBase
import typings.tuyaPanelKit.typesMod.TypedNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNavigatorFactoryMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/createNavigatorFactory", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
}
