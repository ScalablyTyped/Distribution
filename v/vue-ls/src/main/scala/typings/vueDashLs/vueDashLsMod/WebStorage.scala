package typings.vueDashLs.vueDashLsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-ls", "WebStorage")
@js.native
class WebStorage protected () extends js.Object {
  def this(storage: Types) = this()
  var length: Double = js.native
  def clear(): Unit = js.native
  def get(name: String): js.Any = js.native
  def get(name: String, `def`: js.Any): js.Any = js.native
  def key(index: Double): String | Null = js.native
  def off(name: String, callback: js.Function0[Unit]): Unit = js.native
  def on(name: String, callback: js.Function0[Unit]): Unit = js.native
  def remove(name: String): Unit = js.native
  def set(name: String, value: js.Any): Unit = js.native
  def set(name: String, value: js.Any, expire: Double): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(options: Options): Unit = js.native
}

