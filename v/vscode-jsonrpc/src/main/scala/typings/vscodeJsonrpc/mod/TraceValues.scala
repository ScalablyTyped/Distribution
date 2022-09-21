package typings.vscodeJsonrpc.mod

import typings.vscodeJsonrpc.vscodeJsonrpcStrings.compact
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.messages
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.off
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TraceValues {
  
  /**
    * Compact message tracing.
    */
  @JSImport("vscode-jsonrpc", "TraceValues.Compact")
  @js.native
  val Compact: compact = js.native
  
  /**
    * Trace messages only.
    */
  @JSImport("vscode-jsonrpc", "TraceValues.Messages")
  @js.native
  val Messages: messages = js.native
  
  /**
    * Turn tracing off.
    */
  @JSImport("vscode-jsonrpc", "TraceValues.Off")
  @js.native
  val Off: off = js.native
  
  /**
    * Verbose message tracing.
    */
  @JSImport("vscode-jsonrpc", "TraceValues.Verbose")
  @js.native
  val Verbose: verbose = js.native
}
