package typings.vscodeJsonrpc.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  /**
    * Dispose this object.
    */
  def dispose(): Unit
}

@JSImport("vscode-jsonrpc/lib/events", "Disposable")
@js.native
object Disposable extends js.Object {
  def create(func: js.Function0[Unit]): Disposable = js.native
}

