package typings.vscodeJsonrpc.mod

import typings.vscodeJsonrpc.eventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "Emitter")
@js.native
class Emitter[T] ()
  extends typings.vscodeJsonrpc.eventsMod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}
/* static members */
@JSImport("vscode-jsonrpc", "Emitter")
@js.native
object Emitter extends js.Object {
  
  var _noop: js.Any = js.native
}
