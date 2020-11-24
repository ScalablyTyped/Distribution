package typings.viewabilityHelper.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("viewability-helper", "ViewabilityHelper")
@js.native
class ViewabilityHelper protected () extends js.Object {
  def this(element: Element, callback: js.Function0[Unit]) = this()
  def this(element: HTMLElement, callback: js.Function0[Unit]) = this()
  def this(element: Element, callback: js.Function0[Unit], options: Options) = this()
  def this(element: HTMLElement, callback: js.Function0[Unit], options: Options) = this()
  
  def observe(): Unit = js.native
}
