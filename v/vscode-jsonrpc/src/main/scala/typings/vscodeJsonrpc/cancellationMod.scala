package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.disposableMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def onCancellationRequested(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  }
  object CancellationToken {
    
    @JSImport("vscode-jsonrpc/lib/common/cancellation", "CancellationToken")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/cancellation", "CancellationToken.Cancelled")
    @js.native
    val Cancelled: CancellationToken = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/cancellation", "CancellationToken.None")
    @js.native
    val None: CancellationToken = js.native
    
    inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/cancellation.CancellationToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/cancellation.CancellationToken */ Boolean]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/cancellation", "CancellationTokenSource")
  @js.native
  open class CancellationTokenSource ()
    extends StObject
       with AbstractCancellationTokenSource {
    
    /* private */ var _token: Any = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /**
      * Dispose this object.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    var token: CancellationToken = js.native
    @JSName("token")
    def token_MCancellationTokenSource: CancellationToken = js.native
  }
  
  trait AbstractCancellationTokenSource
    extends StObject
       with Disposable {
    
    def cancel(): Unit
    
    var token: CancellationToken
  }
  object AbstractCancellationTokenSource {
    
    inline def apply(cancel: () => Unit, dispose: () => Unit, token: CancellationToken): AbstractCancellationTokenSource = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dispose = js.Any.fromFunction0(dispose), token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractCancellationTokenSource]
    }
    
    extension [Self <: AbstractCancellationTokenSource](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setToken(value: CancellationToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
