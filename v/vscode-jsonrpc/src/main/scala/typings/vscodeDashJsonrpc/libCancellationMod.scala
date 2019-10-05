package typings.vscodeDashJsonrpc

import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/cancellation", JSImport.Namespace)
@js.native
object libCancellationMod extends js.Object {
  @js.native
  trait CancellationToken extends js.Object {
    /**
      * Is `true` when the token has been cancelled, `false` otherwise.
      */
    val isCancellationRequested: Boolean = js.native
    /**
      * An [event](#Event) which fires upon cancellation.
      */
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
    def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  }
  
  @js.native
  class CancellationTokenSource () extends js.Object {
    var _token: js.Any = js.native
    val token: CancellationToken = js.native
    def cancel(): Unit = js.native
    def dispose(): Unit = js.native
  }
  
  @js.native
  object CancellationToken extends js.Object {
    val Cancelled: CancellationToken = js.native
    val None: CancellationToken = js.native
    def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/cancellation.CancellationToken */ Boolean = js.native
  }
  
}

