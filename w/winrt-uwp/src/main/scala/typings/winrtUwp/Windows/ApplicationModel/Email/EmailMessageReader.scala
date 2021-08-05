package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets a batch of email messages. */
trait EmailMessageReader extends StObject {
  
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailMessageBatch]
}
object EmailMessageReader {
  
  inline def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): EmailMessageReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMessageReader]
  }
  
  extension [Self <: EmailMessageReader](x: Self) {
    
    inline def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
