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
    * An {@link Event} which fires upon cancellation.
    */
  def onCancellationRequested(listener: js.Function1[/* e */ Any, Any]): Disposable
  def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable
  def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable
  def onCancellationRequested(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable
  /**
    * An {@link Event} which fires upon cancellation.
    */
  @JSName("onCancellationRequested")
  var onCancellationRequested_Original: Event[Any]
}
object CancellationToken {
  
  inline def apply(
    isCancellationRequested: Boolean,
    onCancellationRequested: (/* listener */ js.Function1[Any, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
  ): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction3(onCancellationRequested))
    __obj.asInstanceOf[CancellationToken]
  }
  
  extension [Self <: CancellationToken](x: Self) {
    
    inline def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
    
    inline def setOnCancellationRequested(
      value: (/* listener */ js.Function1[Any, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onCancellationRequested", js.Any.fromFunction3(value))
  }
}
