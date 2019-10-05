package typings.winrtDashUwp.Windows.Web.Http

import typings.winrtDashUwp.Anon_Length
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.Storage.Streams.UnicodeEncoding
import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses a string. */
@JSGlobal("Windows.Web.Http.HttpStringContent")
@js.native
class HttpStringContent protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content.
    * @param content The content used to initialize the HttpStringContent .
    */
  def this(content: String) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content and encoding.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    */
  def this(content: String, encoding: UnicodeEncoding) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content, encoding, and media type.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    * @param mediaType The media type to use for the content.
    */
  def this(content: String, encoding: UnicodeEncoding, mediaType: String) = this()
  /** Get a collection of content headers set on the HttpStringContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpStringContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpStringContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Serialize the HttpStringContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpStringContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpStringContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Compute the HttpStringContent length in bytes.
    */
  def tryComputeLength(): Anon_Length = js.native
  /**
    * Write the HttpStringContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

