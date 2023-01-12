package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the calling app to read through the phone call history entries. */
trait PhoneCallHistoryEntryReader extends StObject {
  
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]]
}
object PhoneCallHistoryEntryReader {
  
  inline def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[Any]]): PhoneCallHistoryEntryReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[PhoneCallHistoryEntryReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneCallHistoryEntryReader] (val x: Self) extends AnyVal {
    
    inline def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[Any]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
