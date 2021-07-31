package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
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
@JSGlobal("Windows.Web.Http.HttpFormUrlEncodedContent")
@js.native
class HttpFormUrlEncodedContent protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.HttpFormUrlEncodedContent {
  /**
    * Initializes a new instance of the HttpFormUrlEncodedContent class with the specified content.
    * @param content The content used to initialize the HttpFormUrlEncodedContent .
    */
  def this(content: IIterable[IKeyValuePair[js.Any, js.Any]]) = this()
  
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  /* CompleteClass */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
