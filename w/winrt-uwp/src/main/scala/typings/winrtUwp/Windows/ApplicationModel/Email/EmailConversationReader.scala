package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads a batch of email conversations. */
trait EmailConversationReader extends StObject {
  
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailConversationBatch]
}
object EmailConversationReader {
  
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailConversationBatch]): EmailConversationReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailConversationReader]
  }
  
  @scala.inline
  implicit class EmailConversationReaderMutableBuilder[Self <: EmailConversationReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[EmailConversationBatch]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
