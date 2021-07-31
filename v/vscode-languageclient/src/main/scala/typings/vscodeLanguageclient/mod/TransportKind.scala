package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransportKind
  extends StObject
     with Transport
@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportKind & Double] = js.native
  
  @js.native
  sealed trait ipc
    extends StObject
       with TransportKind
  /* 1 */ val ipc: typings.vscodeLanguageclient.mod.TransportKind.ipc & Double = js.native
  
  @js.native
  sealed trait pipe
    extends StObject
       with TransportKind
  /* 2 */ val pipe: typings.vscodeLanguageclient.mod.TransportKind.pipe & Double = js.native
  
  @js.native
  sealed trait socket
    extends StObject
       with TransportKind
  /* 3 */ val socket: typings.vscodeLanguageclient.mod.TransportKind.socket & Double = js.native
  
  @js.native
  sealed trait stdio
    extends StObject
       with TransportKind
  /* 0 */ val stdio: typings.vscodeLanguageclient.mod.TransportKind.stdio & Double = js.native
}
