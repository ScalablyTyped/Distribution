package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationToken extends StObject {
  
  /**
    * Is `true` when the token has been cancelled, `false` otherwise.
    */
  var isCancellationRequested: Boolean
  
  /**
    * An [event](#Event) which fires upon cancellation.
    */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable
  def onCancellationRequested(
    listener: js.Function1[/* e */ js.Any, js.Any],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable
  /**
    * An [event](#Event) which fires upon cancellation.
    */
  @JSName("onCancellationRequested")
  var onCancellationRequested_Original: Event[js.Any]
}
object CancellationToken {
  
  @scala.inline
  def apply(
    isCancellationRequested: Boolean,
    onCancellationRequested: (/* listener */ js.Function1[js.Any, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
  ): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction3(onCancellationRequested))
    __obj.asInstanceOf[CancellationToken]
  }
  
  @scala.inline
  implicit class CancellationTokenMutableBuilder[Self <: CancellationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCancellationRequested(
      value: (/* listener */ js.Function1[js.Any, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onCancellationRequested", js.Any.fromFunction3(value))
  }
}
