package typings.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Trace extends StObject
@JSImport("vscode-jsonrpc/lib/common/connection", "Trace")
@js.native
object Trace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trace & Double] = js.native
  
  @js.native
  sealed trait Compact
    extends StObject
       with Trace
  /* 2 */ val Compact: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Compact & Double = js.native
  
  @js.native
  sealed trait Messages
    extends StObject
       with Trace
  /* 1 */ val Messages: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Messages & Double = js.native
  
  @js.native
  sealed trait Off
    extends StObject
       with Trace
  /* 0 */ val Off: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Off & Double = js.native
  
  @js.native
  sealed trait Verbose
    extends StObject
       with Trace
  /* 3 */ val Verbose: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Verbose & Double = js.native
  
  def fromString(value: String): Trace = js.native
  
  def toString_(value: Trace): TraceValues = js.native
}
