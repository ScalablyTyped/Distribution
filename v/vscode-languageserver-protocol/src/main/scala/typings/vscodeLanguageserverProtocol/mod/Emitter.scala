package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeJsonrpc.eventsMod.EmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "Emitter")
@js.native
class Emitter[T] ()
  extends typings.vscodeJsonrpc.mod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}
/* static members */
object Emitter {
  
  @JSImport("vscode-languageserver-protocol", "Emitter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageserver-protocol", "Emitter._noop")
  @js.native
  def _noop: js.Any = js.native
  @scala.inline
  def _noop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noop")(x.asInstanceOf[js.Any])
}
