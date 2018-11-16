package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses the multipart/ * MIME type. */
@JSGlobal("Windows.Web.Http.HttpMultipartContent")
@js.native
class HttpMultipartContent () extends js.Object {
  /**
                   * Initializes a new instance of the HttpMultipartContent class with the specified MIME subtype.
                   * @param subtype The MIME subtype of the multipart content.
                   */
  def this(subtype: java.lang.String) = this()
  /**
                   * Initializes a new instance of the HttpMultipartContent class with the specified MIME subtype and boundary string.
                   * @param subtype The MIME subtype of the multipart content.
                   * @param boundary The boundary string for the multipart content.
                   */
  def this(subtype: java.lang.String, boundary: java.lang.String) = this()
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection = js.native
  /**
                   * Add HTTP content to the HttpMultipartContent instance.
                   * @param content The HTTP content to add to HttpMultipartContent .
                   */
  def add(content: IHttpContent): scala.Unit = js.native
  /**
                   * Serialize the HttpMultipartContent into memory as an asynchronous operation.
                   * @return The object that represents the asynchronous operation.
                   */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
                   * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
                   * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
                   */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[IHttpContent] = js.native
  /**
                   * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
                   * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double] = js.native
  /**
                   * Serialize the HttpMultipartContent to a String as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double] = js.native
  /**
                   * Determines whether the HttpMultipartContent has a valid length in bytes.
                   */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length = js.native
  /**
                   * Write the HttpMultipartContent to an output stream as an asynchronous operation.
                   * @param outputStream The output stream to write to.
                   * @return The object that represents the asynchronous operation.
                   */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

