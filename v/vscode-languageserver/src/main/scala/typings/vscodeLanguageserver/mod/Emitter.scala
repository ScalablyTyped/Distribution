package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.eventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Emitter")
@js.native
class Emitter[T] ()
  extends typings.vscodeLanguageserverProtocol.mod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}

/* static members */
@JSImport("vscode-languageserver", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}

