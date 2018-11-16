package typings
package tetherDashDropLib.tetherDashDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Drop constructor
@js.native
trait Drop extends js.Object {
  var content: stdLib.HTMLElement = js.native
  var tether: tetherLib.tetherMod.namespaced = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def isOpened(): scala.Boolean = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  /*
       * Drop instances fire "open" and "close" events.
       */
  def on(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  /*
       * Drop instances fire "open" and "close" events.
       */
  def on(event: java.lang.String, handler: js.Function, context: js.Any): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function, context: js.Any): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

