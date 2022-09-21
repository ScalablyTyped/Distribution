package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.eventsMod.EmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "Emitter")
@js.native
open class Emitter[T] ()
  extends typings.vscodeLanguageserverProtocol.mod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}
/* static members */
object Emitter {
  
  @JSImport("vscode-languageserver", "Emitter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageserver", "Emitter._noop")
  @js.native
  def _noop: Any = js.native
  inline def _noop_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noop")(x.asInstanceOf[js.Any])
}
