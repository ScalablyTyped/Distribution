package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses a stream. */
@JSGlobal("Windows.Web.Http.HttpStreamContent")
@js.native
class HttpStreamContent protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpStreamContent class with the specified content.
    * @param content The content used to initialize the HttpStreamContent .
    */
  def this(content: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream) = this()
  /** Get a collection of content headers set on the HttpStreamContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpStreamContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /** Closes the HttpStreamContent instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
    * Serialize the HttpStreamContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
    * Serialize the HttpStreamContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double] = js.native
  /**
    * Serialize the HttpStreamContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double] = js.native
  /**
    * Determines whether the HttpStreamContent has a valid length in bytes.
    */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length = js.native
  /**
    * Write the HttpStreamContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

