package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  def addDisposableListener(`type`: String, handler: js.Function1[/* repeated */ js.Any, Unit]): IDisposable = js.native
  def emit(`type`: String): Unit = js.native
  def emit(`type`: String, data: js.Any): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

