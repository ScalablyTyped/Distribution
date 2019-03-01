package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransportKind extends Transport

@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends js.Object {
  @js.native
  sealed trait ipc
    extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.TransportKind
  
  @js.native
  sealed trait pipe
    extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.TransportKind
  
  @js.native
  sealed trait socket
    extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.TransportKind
  
  @js.native
  sealed trait stdio
    extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.TransportKind
  
  /* 1 */ val ipc: ipc with scala.Double = js.native
  /* 2 */ val pipe: pipe with scala.Double = js.native
  /* 3 */ val socket: socket with scala.Double = js.native
  /* 0 */ val stdio: stdio with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.TransportKind with scala.Double
  ] = js.native
}

