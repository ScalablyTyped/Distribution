package typings.w2ui.W2UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Common extends js.Object {
  var box: HTMLElement = js.native
  var handlers: js.Array[js.Function] = js.native
  var name: String = js.native
  var style: String = js.native
  def destroy(): Unit = js.native
  def off(`type`: String): Unit = js.native
  def off(`type`: String, handler: js.Function): Unit = js.native
  def off(`type`: js.Object): Unit = js.native
  def off(`type`: js.Object, handler: js.Function): Unit = js.native
  def on(`type`: String): Unit = js.native
  def on(`type`: String, handler: js.Function): Unit = js.native
  def on(`type`: js.Object): Unit = js.native
  def on(`type`: js.Object, handler: js.Function): Unit = js.native
  def refresh(): Double = js.native
  def refresh(id: String): Double = js.native
  def render(): Double = js.native
  def render(box: js.Object): Double = js.native
  def resize(): Double = js.native
  def trigger(eventData: js.Object): js.Object = js.native
}

