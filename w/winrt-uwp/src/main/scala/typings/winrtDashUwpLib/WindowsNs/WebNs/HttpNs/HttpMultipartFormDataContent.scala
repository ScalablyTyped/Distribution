package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses the multipart/form-data MIME type. */
@JSGlobal("Windows.Web.Http.HttpMultipartFormDataContent")
@js.native
class HttpMultipartFormDataContent () extends js.Object {
  /**
                   * Initializes a new instance of the HttpMultipartFormDataContent class with the specified boundary string.
                   * @param boundary The boundary string for the multipart content.
                   */
  def this(boundary: java.lang.String) = this()
  /** Get a collection of content headers set on the HttpMultipartFormDataContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection = js.native
  /**
                   * Add HTTP content to the HttpMultipartFormDataContent instance.
                   * @param content The HTTP content to add to HttpMultipartFormDataContent .
                   */
  def add(content: IHttpContent): scala.Unit = js.native
  /**
                   * Add HTTP content with a specified name to the HttpMultipartFormDataContent instance.
                   * @param content The HTTP content to add to HttpMultipartFormDataContent .
                   * @param name The name for the HTTP content to add to HttpMultipartFormDataContent .
                   */
  def add(content: IHttpContent, name: java.lang.String): scala.Unit = js.native
  /**
                   * Add HTTP content with a specified name from a file to the HttpMultipartFormDataContent instance.
                   * @param content The HTTP content to add to HttpMultipartFormDataContent .
                   * @param name The name for the HTTP content to add to HttpMultipartFormDataContent .
                   * @param fileName The file name for the HTTP content to add to HttpMultipartFormDataContent .
                   */
  def add(content: IHttpContent, name: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  /**
                   * Serialize the HttpMultipartFormDataContent into memory as an asynchronous operation.
                   * @return The object that represents the asynchronous operation.
                   */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /** Closes the HttpMultipartFormDataContent instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
                   * Gets an object that can be used to enumerate the contents in the HttpMultipartFormDataContent object.
                   * @return An object that can be used to enumerate the contents in the HttpMultipartFormDataContent object.
                   */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[IHttpContent] = js.native
  /**
                   * Serialize the HttpMultipartFormDataContent to a buffer as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
                   * Serialize the HttpMultipartFormDataContent and return an input stream that represents the content as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double] = js.native
  /**
                   * Serialize the HttpMultipartFormDataContent to a String as an asynchronous operation.
                   * @return The object representing the asynchronous operation.
                   */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double] = js.native
  /**
                   * Determines whether the HttpMultipartFormDataContent has a valid length in bytes.
                   */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length = js.native
  /**
                   * Write the HttpMultipartFormDataContent to an output stream as an asynchronous operation.
                   * @param outputStream The output stream to write to.
                   * @return The object that represents the asynchronous operation.
                   */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

