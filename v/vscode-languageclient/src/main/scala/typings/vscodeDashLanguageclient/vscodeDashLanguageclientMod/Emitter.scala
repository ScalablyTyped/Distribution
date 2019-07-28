package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashJsonrpc.libEventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Emitter")
@js.native
class Emitter[T] ()
  extends typings.vscodeDashLanguageclient.libClientMod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}

/* static members */
@JSImport("vscode-languageclient", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}

