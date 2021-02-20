package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses the multipart/ * MIME type. */
@js.native
trait HttpMultipartContent extends StObject {
  
  /**
    * Add HTTP content to the HttpMultipartContent instance.
    * @param content The HTTP content to add to HttpMultipartContent .
    */
  def add(content: IHttpContent): Unit = js.native
  
  /**
    * Serialize the HttpMultipartContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  def close(): Unit = js.native
  
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
    */
  def first(): IIterator[IHttpContent] = js.native
  
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpMultipartContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Determines whether the HttpMultipartContent has a valid length in bytes.
    */
  def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
object HttpMultipartContent {
  
  @scala.inline
  def apply(
    add: IHttpContent => Unit,
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    first: () => IIterator[IHttpContent],
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpMultipartContent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), first = js.Any.fromFunction0(first), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpMultipartContent]
  }
  
  @scala.inline
  implicit class HttpMultipartContentMutableBuilder[Self <: HttpMultipartContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: IHttpContent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBufferAllAsync(value: () => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "bufferAllAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => IIterator[IHttpContent]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: HttpContentHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsBufferAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]): Self = StObject.set(x, "readAsBufferAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadAsInputStreamAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]): Self = StObject.set(x, "readAsInputStreamAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadAsStringAsync(value: () => IPromiseWithIAsyncOperationWithProgress[String, Double]): Self = StObject.set(x, "readAsStringAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTryComputeLength(value: () => Length): Self = StObject.set(x, "tryComputeLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteToStreamAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeToStreamAsync", js.Any.fromFunction1(value))
  }
}
