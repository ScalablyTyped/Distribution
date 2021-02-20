package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CancellationToken {
  
  @JSImport("vscode-languageserver-protocol", "CancellationToken.Cancelled")
  @js.native
  val Cancelled: typings.vscodeJsonrpc.cancellationMod.CancellationToken = js.native
  
  @JSImport("vscode-languageserver-protocol", "CancellationToken.None")
  @js.native
  val None: typings.vscodeJsonrpc.cancellationMod.CancellationToken = js.native
  
  @JSImport("vscode-languageserver-protocol", "CancellationToken.is")
  @js.native
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/cancellation.CancellationToken */ Boolean = js.native
}
