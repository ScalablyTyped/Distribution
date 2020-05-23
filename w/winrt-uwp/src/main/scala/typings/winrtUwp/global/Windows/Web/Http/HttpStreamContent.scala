package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses a stream. */
@JSGlobal("Windows.Web.Http.HttpStreamContent")
@js.native
class HttpStreamContent protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpStreamContent {
  /**
    * Initializes a new instance of the HttpStreamContent class with the specified content.
    * @param content The content used to initialize the HttpStreamContent .
    */
  def this(content: IInputStream) = this()
  /** Get a collection of content headers set on the HttpStreamContent . */
  /* CompleteClass */
  override var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpStreamContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpStreamContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Serialize the HttpStreamContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpStreamContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpStreamContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Determines whether the HttpStreamContent has a valid length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  /**
    * Write the HttpStreamContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

