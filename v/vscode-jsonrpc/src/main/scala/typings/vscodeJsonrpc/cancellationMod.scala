package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.eventsMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancellationMod {
  
  @js.native
  trait CancellationToken extends StObject {
    
    /**
      * Is `true` when the token has been cancelled, `false` otherwise.
      */
    val isCancellationRequested: Boolean = js.native
    
    /**
      * An [event](#Event) which fires upon cancellation.
      */
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
    def onCancellationRequested(
      listener: js.Function1[/* e */ js.Any, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  }
  object CancellationToken {
    
    @JSImport("vscode-jsonrpc/lib/cancellation", "CancellationToken.Cancelled")
    @js.native
    val Cancelled: CancellationToken = js.native
    
    @JSImport("vscode-jsonrpc/lib/cancellation", "CancellationToken.None")
    @js.native
    val None: CancellationToken = js.native
    
    @JSImport("vscode-jsonrpc/lib/cancellation", "CancellationToken.is")
    @js.native
    def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/cancellation.CancellationToken */ Boolean = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/cancellation", "CancellationTokenSource")
  @js.native
  class CancellationTokenSource () extends StObject {
    
    var _token: js.Any = js.native
    
    def cancel(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def token: CancellationToken = js.native
  }
}
