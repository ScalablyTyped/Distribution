package typings.vscodeJsonrpc.connectionMod

import typings.vscodeJsonrpc.vscodeJsonrpcStrings.compact
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.messages
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.off
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.off
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.messages
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.compact
  - typings.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
*/
trait TraceValues extends StObject
object TraceValues {
  
  /**
    * Compact message tracing.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Compact")
  @js.native
  val Compact: compact = js.native
  
  /**
    * Trace messages only.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Messages")
  @js.native
  val Messages: messages = js.native
  
  /**
    * Turn tracing off.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Off")
  @js.native
  val Off: off = js.native
  
  /**
    * Verbose message tracing.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Verbose")
  @js.native
  val Verbose: verbose = js.native
}
