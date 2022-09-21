package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "Trace")
@js.native
object Trace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.vscodeJsonrpc.connectionMod.Trace & Double] = js.native
  
  /* 2 */ val Compact: typings.vscodeJsonrpc.connectionMod.Trace.Compact & Double = js.native
  
  /* 1 */ val Messages: typings.vscodeJsonrpc.connectionMod.Trace.Messages & Double = js.native
  
  /* 0 */ val Off: typings.vscodeJsonrpc.connectionMod.Trace.Off & Double = js.native
  
  /* 3 */ val Verbose: typings.vscodeJsonrpc.connectionMod.Trace.Verbose & Double = js.native
  
  def fromString(value: String): typings.vscodeJsonrpc.connectionMod.Trace = js.native
  
  def toString_(value: typings.vscodeJsonrpc.connectionMod.Trace): typings.vscodeJsonrpc.connectionMod.TraceValues = js.native
}
