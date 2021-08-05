package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Authentication.OnlineId.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[UserIdentity]
  
  def getResults(): UserIdentity
}
object `6` {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[UserIdentity], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => UserIdentity
  ): `6` = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[UserIdentity], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => UserIdentity): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
