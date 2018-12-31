package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

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
  def this(content: java.lang.String) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content and encoding.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    */
  def this(content: java.lang.String, encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content, encoding, and media type.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    * @param mediaType The media type to use for the content.
    */
  def this(content: java.lang.String, encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding, mediaType: java.lang.String) = this()
  /** Get a collection of content headers set on the HttpStringContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpStringContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /** Closes the HttpStringContent instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
    * Serialize the HttpStringContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
    * Serialize the HttpStringContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double] = js.native
  /**
    * Serialize the HttpStringContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double] = js.native
  /**
    * Compute the HttpStringContent length in bytes.
    */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length = js.native
  /**
    * Write the HttpStringContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

