package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

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
  def this(content: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer) = this()
  /**
    * Initializes a new instance of the HttpBufferContent class with an offset and count of bytes from the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    * @param offset The offset in bytes from the beginning of the content buffer to initialize the HttpBufferContent .
    * @param count The count of bytes in the content buffer to initialize the HttpBufferContent .
    */
  def this(content: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, offset: scala.Double, count: scala.Double) = this()
  /** Get a collection of content headers set on the HttpBufferContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpBufferContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /** Closes the HttpBufferContent instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
    * Serialize the HttpBufferContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
    * Serialize the HttpBufferContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double] = js.native
  /**
    * Serialize the HttpBufferContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double] = js.native
  /**
    * Computes the HttpBufferContent length in bytes.
    */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length = js.native
  /**
    * Write the HttpBufferContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

