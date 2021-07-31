package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses a string. */
@JSGlobal("Windows.Web.Http.HttpStringContent")
@js.native
class HttpStringContent protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.HttpStringContent {
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
  
  /**
    * Serialize the HttpStringContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpStringContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Get a collection of content headers set on the HttpStringContent . */
  /* CompleteClass */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpStringContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpStringContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpStringContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Compute the HttpStringContent length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpStringContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
