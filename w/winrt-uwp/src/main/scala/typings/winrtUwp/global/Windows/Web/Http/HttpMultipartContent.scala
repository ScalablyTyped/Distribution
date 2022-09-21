package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typings.winrtUwp.Windows.Web.Http.IHttpContent
import typings.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses the multipart/ * MIME type. */
@JSGlobal("Windows.Web.Http.HttpMultipartContent")
@js.native
/** Initializes a new instance of the HttpMultipartContent class. */
open class HttpMultipartContent ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.HttpMultipartContent {
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
  
  /**
    * Add HTTP content to the HttpMultipartContent instance.
    * @param content The HTTP content to add to HttpMultipartContent .
    */
  /* CompleteClass */
  override def add(content: IHttpContent): Unit = js.native
  
  /**
    * Serialize the HttpMultipartContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
    */
  /* CompleteClass */
  override def first(): IIterator[IHttpContent] = js.native
  
  /** Get a collection of content headers set on the HttpMultipartContent . */
  /* CompleteClass */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpMultipartContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Determines whether the HttpMultipartContent has a valid length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
