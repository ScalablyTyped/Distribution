package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double]
  
  def getResults(): Double
}
object `7` {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => Double
  ): `7` = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => Double): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
