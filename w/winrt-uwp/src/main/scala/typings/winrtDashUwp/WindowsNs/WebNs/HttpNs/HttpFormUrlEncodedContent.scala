package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

import typings.winrtDashUwp.Anon_Length
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
@JSGlobal("Windows.Web.Http.HttpFormUrlEncodedContent")
@js.native
class HttpFormUrlEncodedContent protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpFormUrlEncodedContent class with the specified content.
    * @param content The content used to initialize the HttpFormUrlEncodedContent .
    */
  def this(content: IIterable[IKeyValuePair[_, _]]) = this()
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  def tryComputeLength(): Anon_Length = js.native
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

