package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base interface for an HTTP entity body and content headers. */
trait IHttpContent
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable
     with winrtDashUwpLib.WindowsNs.FoundationNs.IStringable {
  /** Get a collection of content headers set on the IHttpContent . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection
  /**
    * Serialize the HTTP content into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
  /**
    * Serialize the HTTP content to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double]
  /**
    * Serialize the HTTP content and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double]
  /**
    * Serialize the HTTP content to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double]
  /**
    * Determines whether the HTTP content has a valid length in bytes.
    */
  def tryComputeLength(): winrtDashUwpLib.Anon_Length
  /**
    * Write the HTTP content to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object representing the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
}

object IHttpContent {
  @scala.inline
  def apply(
    bufferAllAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
    ],
    close: js.Function0[scala.Unit],
    headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection,
    readAsBufferAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double]
    ],
    readAsInputStreamAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, scala.Double]
    ],
    readAsStringAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, scala.Double]
    ],
    toString: js.Function0[java.lang.String],
    tryComputeLength: js.Function0[winrtDashUwpLib.Anon_Length],
    writeToStreamAsync: js.Function1[
      winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, 
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
    ]
  ): IHttpContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = bufferAllAsync, close = close, headers = headers, readAsBufferAsync = readAsBufferAsync, readAsInputStreamAsync = readAsInputStreamAsync, readAsStringAsync = readAsStringAsync, toString = toString, tryComputeLength = tryComputeLength, writeToStreamAsync = writeToStreamAsync)
  
    __obj.asInstanceOf[IHttpContent]
  }
}

