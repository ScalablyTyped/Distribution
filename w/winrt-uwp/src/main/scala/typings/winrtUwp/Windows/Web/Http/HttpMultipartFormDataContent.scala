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

/** Provides HTTP content that uses the multipart/form-data MIME type. */
@js.native
trait HttpMultipartFormDataContent extends StObject {
  
  /**
    * Add HTTP content to the HttpMultipartFormDataContent instance.
    * @param content The HTTP content to add to HttpMultipartFormDataContent .
    */
  def add(content: IHttpContent): Unit = js.native
  /**
    * Add HTTP content with a specified name to the HttpMultipartFormDataContent instance.
    * @param content The HTTP content to add to HttpMultipartFormDataContent .
    * @param name The name for the HTTP content to add to HttpMultipartFormDataContent .
    */
  def add(content: IHttpContent, name: String): Unit = js.native
  /**
    * Add HTTP content with a specified name from a file to the HttpMultipartFormDataContent instance.
    * @param content The HTTP content to add to HttpMultipartFormDataContent .
    * @param name The name for the HTTP content to add to HttpMultipartFormDataContent .
    * @param fileName The file name for the HTTP content to add to HttpMultipartFormDataContent .
    */
  def add(content: IHttpContent, name: String, fileName: String): Unit = js.native
  
  /**
    * Serialize the HttpMultipartFormDataContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpMultipartFormDataContent instance and releases allocated resources. */
  def close(): Unit = js.native
  
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartFormDataContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartFormDataContent object.
    */
  def first(): IIterator[IHttpContent] = js.native
  
  /** Get a collection of content headers set on the HttpMultipartFormDataContent . */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpMultipartFormDataContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpMultipartFormDataContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpMultipartFormDataContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Determines whether the HttpMultipartFormDataContent has a valid length in bytes.
    */
  def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpMultipartFormDataContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
