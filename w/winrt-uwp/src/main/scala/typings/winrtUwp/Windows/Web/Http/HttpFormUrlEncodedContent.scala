package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
trait HttpFormUrlEncodedContent extends StObject {
  
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  def close(): Unit
  
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  var headers: HttpContentHeaderCollection
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  def tryComputeLength(): Length
  
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object HttpFormUrlEncodedContent {
  
  inline def apply(
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpFormUrlEncodedContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpFormUrlEncodedContent]
  }
  
  extension [Self <: HttpFormUrlEncodedContent](x: Self) {
    
    inline def setBufferAllAsync(value: () => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "bufferAllAsync", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setHeaders(value: HttpContentHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setReadAsBufferAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]): Self = StObject.set(x, "readAsBufferAsync", js.Any.fromFunction0(value))
    
    inline def setReadAsInputStreamAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]): Self = StObject.set(x, "readAsInputStreamAsync", js.Any.fromFunction0(value))
    
    inline def setReadAsStringAsync(value: () => IPromiseWithIAsyncOperationWithProgress[String, Double]): Self = StObject.set(x, "readAsStringAsync", js.Any.fromFunction0(value))
    
    inline def setTryComputeLength(value: () => Length): Self = StObject.set(x, "tryComputeLength", js.Any.fromFunction0(value))
    
    inline def setWriteToStreamAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeToStreamAsync", js.Any.fromFunction1(value))
  }
}
