package typings.tuyaPanelKit

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
}
