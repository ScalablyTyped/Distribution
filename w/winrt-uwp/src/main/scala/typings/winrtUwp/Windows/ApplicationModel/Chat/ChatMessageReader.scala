package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for reading messages from the message store. */
@js.native
trait ChatMessageReader extends StObject {
  
  /**
    * Returns a batch list of chat messages from the message store.
    * @return An asynchronous operation that returns a list of chat messages upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
  /**
    * Returns a batch list of chat messages from the message store limited to the specified size.
    * @param count The size of the batch to read.
    * @return An asynchronous operation that returns a list of chat messages upon successful completion.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
}
