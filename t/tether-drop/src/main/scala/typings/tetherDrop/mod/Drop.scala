package typings.tetherDrop.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Drop constructor
@js.native
trait Drop extends js.Object {
  var content: HTMLElement = js.native
  var tether: typings.tether.mod.^ = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def isOpened(): Boolean = js.native
  def off(event: String): Unit = js.native
  def off(event: String, handler: js.Function): Unit = js.native
  /*
    * Drop instances fire "open" and "close" events.
    */
  def on(event: String, handler: js.Function): Unit = js.native
  def on(event: String, handler: js.Function, context: js.Any): Unit = js.native
  def once(event: String, handler: js.Function): Unit = js.native
  def once(event: String, handler: js.Function, context: js.Any): Unit = js.native
  def open(): Unit = js.native
  def position(): Unit = js.native
  def remove(): Unit = js.native
  def toggle(): Unit = js.native
}

