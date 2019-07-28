package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

import typings.winrtDashUwp.Anon_Length
import typings.winrtDashUwp.WindowsNs.FoundationNs.IClosable
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.FoundationNs.IStringable
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base interface for an HTTP entity body and content headers. */
trait IHttpContent
  extends IClosable
     with IStringable {
  /** Get a collection of content headers set on the IHttpContent . */
  var headers: HttpContentHeaderCollection
  /**
    * Serialize the HTTP content into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  /**
    * Serialize the HTTP content to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  /**
    * Serialize the HTTP content and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  /**
    * Serialize the HTTP content to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  /**
    * Determines whether the HTTP content has a valid length in bytes.
    */
  def tryComputeLength(): Anon_Length
  /**
    * Write the HTTP content to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object representing the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object IHttpContent {
  @scala.inline
  def apply(
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    toString: () => String,
    tryComputeLength: () => Anon_Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): IHttpContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), headers = headers, readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), toString = js.Any.fromFunction0(toString), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
  
    __obj.asInstanceOf[IHttpContent]
  }
}

