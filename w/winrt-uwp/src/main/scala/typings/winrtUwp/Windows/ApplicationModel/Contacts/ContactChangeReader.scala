package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to monitor and react to changes to contacts. */
trait ContactChangeReader extends StObject {
  
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  def acceptChanges(): Unit
  
  /**
    * Call this method to indicate that you have processed and accepted up through the specified change.
    * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
    */
  def acceptChangesThrough(lastChangeToAccept: ContactChange): Unit
  
  /**
    * Asynchronously gets a list of ContactChange objects.
    * @return A list of ContactChange objects.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]]
}
object ContactChangeReader {
  
  inline def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: ContactChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]
  ): ContactChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ContactChangeReader]
  }
  
  extension [Self <: ContactChangeReader](x: Self) {
    
    inline def setAcceptChanges(value: () => Unit): Self = StObject.set(x, "acceptChanges", js.Any.fromFunction0(value))
    
    inline def setAcceptChangesThrough(value: ContactChange => Unit): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1(value))
    
    inline def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
