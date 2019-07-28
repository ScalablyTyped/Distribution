package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

import typings.winrtDashUwp.Anon_Length
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses the multipart/ * MIME type. */
@JSGlobal("Windows.Web.Http.HttpMultipartContent")
@js.native
/** Initializes a new instance of the HttpMultipartContent class. */
class HttpMultipartContent () extends js.Object {
  /**
    * Initializes a new instance of the HttpMultipartContent class with the specified MIME subtype.
    * @param subtype The MIME subtype of the multipart content.
    */
  def this(subtype: String) = this()
  /**
    * Initializes a new instance of the HttpMultipartContent class with the specified MIME subtype and boundary string.
    * @param subtype The MIME subtype of the multipart content.
    * @param boundary The boundary string for the multipart content.
    */
  def this(subtype: String, boundary: String) = this()
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: HttpContentHeaderCollection = js.native
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
  def tryComputeLength(): Anon_Length = js.native
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

