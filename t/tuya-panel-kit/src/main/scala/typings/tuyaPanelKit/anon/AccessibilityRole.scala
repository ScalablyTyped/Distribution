package typings.tuyaPanelKit.anon

import typings.reactNative.mod.GestureResponderEvent
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import typings.tuyaPanelKit.tuyaPanelKitStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityRole extends js.Object {
  
  var accessibilityRole: link = js.native
  
  var href: String = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def onPress(): Unit = js.native
  def onPress(e: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
  def onPress(e: GestureResponderEvent): Unit = js.native
}
