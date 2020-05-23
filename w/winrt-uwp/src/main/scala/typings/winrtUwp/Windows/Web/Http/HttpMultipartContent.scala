package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses the multipart/ * MIME type. */
trait HttpMultipartContent extends js.Object {
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: HttpContentHeaderCollection
  /**
    * Add HTTP content to the HttpMultipartContent instance.
    * @param content The HTTP content to add to HttpMultipartContent .
    */
  def add(content: IHttpContent): Unit
  /**
    * Serialize the HttpMultipartContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  def close(): Unit
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
    */
  def first(): IIterator[IHttpContent]
  /**
    * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  /**
    * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  /**
    * Serialize the HttpMultipartContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  /**
    * Determines whether the HttpMultipartContent has a valid length in bytes.
    */
  def tryComputeLength(): Length
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
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
}

