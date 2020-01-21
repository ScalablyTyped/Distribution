package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDispatcher extends js.Object {
  def fire(name: String): js.Object = js.native
  def fire(name: String, args: js.Object): js.Object = js.native
  def has(name: String): Boolean = js.native
  def isNative(name: String): Boolean = js.native
  def off(name: String): js.Object = js.native
  def off(name: String, callback: js.Function0[Unit]): js.Object = js.native
  def on(name: String, callback: js.Function0[Unit]): js.Object = js.native
  def on(name: String, callback: js.Function0[Unit], first: Boolean): js.Object = js.native
  def once(name: String, callback: js.Function0[Unit], first: Boolean): js.Object = js.native
}

