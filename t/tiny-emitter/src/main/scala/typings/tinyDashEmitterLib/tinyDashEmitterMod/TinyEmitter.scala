package typings
package tinyDashEmitterLib.tinyDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tiny-emitter", "TinyEmitter")
@js.native
class TinyEmitter () extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): this.type = js.native
  def off(event: java.lang.String): this.type = js.native
  def off(event: java.lang.String, callback: js.Function): this.type = js.native
  def on(event: java.lang.String, callback: js.Function): this.type = js.native
  def on(event: java.lang.String, callback: js.Function, ctx: js.Any): this.type = js.native
  def once(event: java.lang.String, callback: js.Function): this.type = js.native
  def once(event: java.lang.String, callback: js.Function, ctx: js.Any): this.type = js.native
}

