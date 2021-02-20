package typings.winrtUwp.Windows.Web.Http

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

/** Provides HTTP content that uses a stream. */
@js.native
trait HttpStreamContent extends StObject {
  
  /**
    * Serialize the HttpStreamContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpStreamContent instance and releases allocated resources. */
  def close(): Unit = js.native
  
  /** Get a collection of content headers set on the HttpStreamContent . */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpStreamContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpStreamContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpStreamContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Determines whether the HttpStreamContent has a valid length in bytes.
    */
  def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpStreamContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
object HttpStreamContent {
  
  @scala.inline
  def apply(
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpStreamContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpStreamContent]
  }
  
  @scala.inline
  implicit class HttpStreamContentMutableBuilder[Self <: HttpStreamContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferAllAsync(value: () => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "bufferAllAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
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
