package typings
package tinyDashEmitterLib.tinyDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): EventEmitter = js.native
  def off(event: java.lang.String): EventEmitter = js.native
  def off(event: java.lang.String, callback: js.Function): EventEmitter = js.native
  def on(event: java.lang.String, callback: js.Function): EventEmitter = js.native
  def on(event: java.lang.String, callback: js.Function, ctx: js.Any): EventEmitter = js.native
  def once(event: java.lang.String, callback: js.Function): EventEmitter = js.native
  def once(event: java.lang.String, callback: js.Function, ctx: js.Any): EventEmitter = js.native
}

