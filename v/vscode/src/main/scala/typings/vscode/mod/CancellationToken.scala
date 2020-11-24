package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancellationToken extends js.Object {
  
  /**
    * Is `true` when the token has been cancelled, `false` otherwise.
    */
  var isCancellationRequested: Boolean = js.native
  
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
  /**
    * An [event](#Event) which fires upon cancellation.
    */
  @JSName("onCancellationRequested")
  var onCancellationRequested_Original: Event[_] = js.native
}
