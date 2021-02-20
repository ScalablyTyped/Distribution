package typings.tuyaPanelKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type DpValue = scala.Boolean | scala.Double | java.lang.String
  
  type GotoDpAlarmData = js.Array[typings.tuyaPanelKit.anon.DpId]
  
  type LinearGradientBackgroundOffset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ScreenOptions = typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions | (js.Function1[
    /* props */ typings.tuyaPanelKit.anon.NavigationAny, 
    typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
  ])
  
  type TabBarArr = org.scalablytyped.runtime.NumberDictionary[typings.tuyaPanelKit.anon.AccessibilityLabel]
  
  @scala.inline
  def createNavigator[P, S](createNavigatorParam: typings.tuyaPanelKit.mod.NavigationParam): typings.tuyaPanelKit.mod.NavigationComponentClass[P, S] = typings.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(createNavigatorParam.asInstanceOf[js.Any]).asInstanceOf[typings.tuyaPanelKit.mod.NavigationComponentClass[P, S]]
  
  @scala.inline
  def defaultTheme: typings.tuyaPanelKit.themeMod.GlobalTheme = typings.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTheme").asInstanceOf[typings.tuyaPanelKit.themeMod.GlobalTheme]
  @scala.inline
  def defaultTheme_=(x: typings.tuyaPanelKit.themeMod.GlobalTheme): scala.Unit = typings.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(x.asInstanceOf[js.Any])
}
