package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides random access of data in input and output streams for a file. */
trait RandomAccessStreamReference extends StObject {
  
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}
object RandomAccessStreamReference {
  
  @scala.inline
  def apply(openReadAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): RandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[RandomAccessStreamReference]
  }
  
  @scala.inline
  implicit class RandomAccessStreamReferenceMutableBuilder[Self <: RandomAccessStreamReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenReadAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "openReadAsync", js.Any.fromFunction0(value))
  }
}
