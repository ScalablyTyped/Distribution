package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CancellationToken {
  
  @JSImport("vscode-jsonrpc", "CancellationToken")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-jsonrpc", "CancellationToken.Cancelled")
  @js.native
  val Cancelled: typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken = js.native
  
  @JSImport("vscode-jsonrpc", "CancellationToken.None")
  @js.native
  val None: typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/cancellation.CancellationToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/cancellation.CancellationToken */ Boolean]
}
