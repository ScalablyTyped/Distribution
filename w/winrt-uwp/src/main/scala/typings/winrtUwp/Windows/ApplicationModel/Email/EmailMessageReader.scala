package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets a batch of email messages. */
@js.native
trait EmailMessageReader extends StObject {
  
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailMessageBatch] = js.native
}
object EmailMessageReader {
  
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): EmailMessageReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMessageReader]
  }
  
  @scala.inline
  implicit class EmailMessageReaderMutableBuilder[Self <: EmailMessageReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
