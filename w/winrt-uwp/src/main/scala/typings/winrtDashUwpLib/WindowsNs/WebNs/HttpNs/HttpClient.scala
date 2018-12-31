package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sends HTTP requests and receives HTTP responses from a resource identified by a URI. */
@JSGlobal("Windows.Web.Http.HttpClient")
@js.native
/** Initializes a new instance of the HttpClient class. */
class HttpClient () extends js.Object {
  /**
    * Initializes a new instance of the HttpClient class with a specific filter for handling HTTP response messages.
    * @param filter The HTTP filter to use for handling response messages.
    */
  def this(filter: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.IHttpFilter) = this()
  /** Gets a collection of headers that should be sent with each request. */
  var defaultRequestHeaders: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpRequestHeaderCollection = js.native
  /** Closes the HttpClient instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
    * Send a DELETE request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def deleteAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri as an asynchronous operation.
    * @param uri The Uri to which the request is to be sent.
    * @return The object representing the asynchronous operation.
    */
  def getAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri with an HTTP completion option as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param completionOption An HTTP completion option value that indicates when the operation should be considered completed.
    * @return The object representing the asynchronous operation.
    */
  def getAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, completionOption: HttpCompletionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri and return the response body as a buffer in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getBufferAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri and return the response body as a stream in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getInputStreamAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, HttpProgress] = js.native
  /**
    * Send a GET request to the specified Uri and return the response body as a string in an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @return The object representing the asynchronous operation.
    */
  def getStringAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[java.lang.String, HttpProgress] = js.native
  /**
    * Send a POST request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param content The HTTP request content to send to the server.
    * @return The object representing the asynchronous operation.
    */
  def postAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, content: IHttpContent): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send a PUT request to the specified Uri as an asynchronous operation.
    * @param uri The Uri the request is sent to.
    * @param content The HTTP request content to send to the server.
    * @return The object representing the asynchronous operation.
    */
  def putAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, content: IHttpContent): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send an HTTP request as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  /**
    * Send an HTTP request with an HTTP completion option as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @param completionOption A value that indicates whether the HttpClient operation is considered completed when all of the response is read, or when just the headers are read.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage, completionOption: HttpCompletionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
}

