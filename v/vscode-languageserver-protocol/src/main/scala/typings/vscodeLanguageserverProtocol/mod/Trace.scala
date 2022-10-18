package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "Trace")
@js.native
object Trace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.vscodeJsonrpc.libCommonConnectionMod.Trace & Double] = js.native
  
  /* 2 */ val Compact: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Compact & Double = js.native
  
  /* 1 */ val Messages: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Messages & Double = js.native
  
  /* 0 */ val Off: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Off & Double = js.native
  
  /* 3 */ val Verbose: typings.vscodeJsonrpc.libCommonConnectionMod.Trace.Verbose & Double = js.native
  
  def fromString(value: String): typings.vscodeJsonrpc.libCommonConnectionMod.Trace = js.native
  
  def toString_(value: typings.vscodeJsonrpc.libCommonConnectionMod.Trace): typings.vscodeJsonrpc.libCommonConnectionMod.TraceValues = js.native
}
