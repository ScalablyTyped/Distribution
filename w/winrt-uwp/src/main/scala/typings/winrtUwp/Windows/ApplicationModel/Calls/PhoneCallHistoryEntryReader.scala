package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the calling app to read through the phone call history entries. */
@js.native
trait PhoneCallHistoryEntryReader extends StObject {
  
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}
object PhoneCallHistoryEntryReader {
  
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]): PhoneCallHistoryEntryReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[PhoneCallHistoryEntryReader]
  }
  
  @scala.inline
  implicit class PhoneCallHistoryEntryReaderMutableBuilder[Self <: PhoneCallHistoryEntryReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
