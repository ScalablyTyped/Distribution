package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CancellationToken {
  
  @JSImport("vscode-languageclient/lib/client", "CancellationToken.Cancelled")
  @js.native
  val Cancelled: typings.vscodeJsonrpc.cancellationMod.CancellationToken = js.native
  
  @JSImport("vscode-languageclient/lib/client", "CancellationToken.None")
  @js.native
  val None: typings.vscodeJsonrpc.cancellationMod.CancellationToken = js.native
  
  @JSImport("vscode-languageclient/lib/client", "CancellationToken.is")
  @js.native
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/cancellation.CancellationToken */ Boolean = js.native
}
