package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "util.Observable")
@js.native
class Observable () extends js.Object {
  def fire(name: String): js.Object = js.native
  def fire(name: String, args: js.Object): js.Object = js.native
  def fire(name: String, args: js.Object, bubble: Boolean): js.Object = js.native
  def hasEventListeners(name: String): Boolean = js.native
  def off(): js.Object = js.native
  def off(name: String): js.Object = js.native
  def off(name: String, callback: js.Function0[Unit]): js.Object = js.native
  def on(name: String, callback: js.Function1[/* event */ js.Any, Unit]): js.Object = js.native
  def on(name: String, callback: js.Function1[/* event */ js.Any, Unit], first: Boolean): js.Object = js.native
  def once(name: String, callback: js.Function1[/* event */ js.Any, Unit]): js.Object = js.native
}

