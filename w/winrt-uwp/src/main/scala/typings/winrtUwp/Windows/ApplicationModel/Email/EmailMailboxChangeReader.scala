package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
trait EmailMailboxChangeReader extends StObject {
  
  /** Accepts all changes. */
  def acceptChanges(): Unit
  
  /**
    * Accepts all changes through the current change.
    * @param lastChangeToAcknowledge The current change.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange): Unit
  
  /**
    * Reads a collection of changes.
    * @return A batch of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]]
}
object EmailMailboxChangeReader {
  
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: EmailMailboxChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]
  ): EmailMailboxChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMailboxChangeReader]
  }
  
  @scala.inline
  implicit class EmailMailboxChangeReaderMutableBuilder[Self <: EmailMailboxChangeReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptChanges(value: () => Unit): Self = StObject.set(x, "acceptChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAcceptChangesThrough(value: EmailMailboxChange => Unit): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
