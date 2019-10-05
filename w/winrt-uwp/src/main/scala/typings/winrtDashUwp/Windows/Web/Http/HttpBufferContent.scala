package typings.winrtDashUwp.Windows.Web.Http

import typings.winrtDashUwp.Anon_Length
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses a buffer. */
@JSGlobal("Windows.Web.Http.HttpBufferContent")
@js.native
class HttpBufferContent protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpBufferContent class with the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    */
  def this(content: IBuffer) = this()
  /**
    * Initializes a new instance of the HttpBufferContent class with an offset and count of bytes from the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    * @param offset The offset in bytes from the beginning of the content buffer to initialize the HttpBufferContent .
    * @param count The count of bytes in the content buffer to initialize the HttpBufferContent .
    */
  def this(content: IBuffer, offset: Double, count: Double) = this()
  /** Get a collection of content headers set on the HttpBufferContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpBufferContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpBufferContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Serialize the HttpBufferContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpBufferContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpBufferContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Computes the HttpBufferContent length in bytes.
    */
  def tryComputeLength(): Anon_Length = js.native
  /**
    * Write the HttpBufferContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

