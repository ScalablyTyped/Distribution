package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.Http.Headers.HttpRequestHeaderCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sends HTTP requests and receives HTTP responses from a resource identified by a URI. */
@js.native
trait HttpClient extends StObject {
  
  /** Closes the HttpClient instance and releases allocated resources. */
  def close(): Unit = js.native
  
  /** Gets a collection of headers that should be sent with each request. */
  var defaultRequestHeaders: HttpRequestHeaderCollection = js.native
  
  /**
    * Send a DELETE request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def deleteAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  
  /**
    * Send a GET request to the specified Uri as an asynchronous operation.
    * @param uri The Uri to which the request is to be sent.
    * @return The object representing the asynchronous operation.
    */
  def getAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri with an HTTP completion option as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param completionOption An HTTP completion option value that indicates when the operation should be considered completed.
    * @return The object representing the asynchronous operation.
    */
  def getAsync(uri: Uri, completionOption: HttpCompletionOption): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  
  /**
    * Send a GET request to the specified Uri and return the response body as a buffer in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getBufferAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[IBuffer, HttpProgress] = js.native
  
  /**
    * Send a GET request to the specified Uri and return the response body as a stream in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getInputStreamAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[IInputStream, HttpProgress] = js.native
  
  /**
    * Send a GET request to the specified Uri and return the response body as a string in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getStringAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[String, HttpProgress] = js.native
  
  /**
    * Send a POST request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param content The HTTP request content to send to the server.
    * @return The object representing the asynchronous operation.
    */
  def postAsync(uri: Uri, content: IHttpContent): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  
  /**
    * Send a PUT request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param content The HTTP request content to send to the server.
    * @return The object representing the asynchronous operation.
    */
  def putAsync(uri: Uri, content: IHttpContent): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  
  /**
    * Send an HTTP request as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send an HTTP request with an HTTP completion option as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @param completionOption A value that indicates whether the HttpClient operation is considered completed when all of the response is read, or when just the headers are read.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage, completionOption: HttpCompletionOption): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
}
