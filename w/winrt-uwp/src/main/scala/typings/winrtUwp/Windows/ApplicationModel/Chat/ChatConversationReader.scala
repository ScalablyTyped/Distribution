package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for reading batches of conversations from the ChatMessageStore . */
@js.native
trait ChatConversationReader extends StObject {
  
  /**
    * Asynchronously reads batches of conversations from the ChatMessageStore .
    * @return The list of conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  /**
    * Asynchronously reads batches of conversations from the ChatMessageStore .
    * @param count Specifies the size of the batch to read.
    * @return The list of conversations.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
}
