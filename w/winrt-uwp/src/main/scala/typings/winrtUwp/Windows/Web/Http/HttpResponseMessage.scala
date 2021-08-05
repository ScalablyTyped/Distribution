package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an HTTP response message including headers, the status code, and data. */
trait HttpResponseMessage extends StObject {
  
  /** Closes the HttpResponseMessage instance and releases allocated resources. */
  def close(): Unit
  
  /** Gets or sets the content of the HTTP response message on the HttpResponseMessage object. */
  var content: IHttpContent
  
  /**
    * Throws an exception if the IsSuccessStatusCode property for the HTTP response is false.
    * @return The HTTP response if the request was successful.
    */
  def ensureSuccessStatusCode(): HttpResponseMessage
  
  /** Gets the collection of HTTP response headers associated with the HttpResponseMessage that were sent by the server. */
  var headers: HttpResponseHeaderCollection
  
  /** Gets a value that indicates whether the HTTP response was successful. */
  var isSuccessStatusCode: Boolean
  
  /** Gets or sets the reason phrase which typically is sent by servers together with the status code. */
  var reasonPhrase: String
  
  /** Gets or sets the request message which led to this response message. */
  var requestMessage: HttpRequestMessage
  
  /** Gets the source of the data received in the HttpResponseMessage . */
  var source: HttpResponseMessageSource
  
  /** Gets or sets the status code of the HTTP response. */
  var statusCode: HttpStatusCode
  
  /** Gets or sets the HTTP protocol version used on the HttpResponseMessage object. */
  var version: HttpVersion
}
object HttpResponseMessage {
  
  inline def apply(
    close: () => Unit,
    content: IHttpContent,
    ensureSuccessStatusCode: () => HttpResponseMessage,
    headers: HttpResponseHeaderCollection,
    isSuccessStatusCode: Boolean,
    reasonPhrase: String,
    requestMessage: HttpRequestMessage,
    source: HttpResponseMessageSource,
    statusCode: HttpStatusCode,
    version: HttpVersion
  ): HttpResponseMessage = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], ensureSuccessStatusCode = js.Any.fromFunction0(ensureSuccessStatusCode), headers = headers.asInstanceOf[js.Any], isSuccessStatusCode = isSuccessStatusCode.asInstanceOf[js.Any], reasonPhrase = reasonPhrase.asInstanceOf[js.Any], requestMessage = requestMessage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseMessage]
  }
  
  extension [Self <: HttpResponseMessage](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setContent(value: IHttpContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEnsureSuccessStatusCode(value: () => HttpResponseMessage): Self = StObject.set(x, "ensureSuccessStatusCode", js.Any.fromFunction0(value))
    
    inline def setHeaders(value: HttpResponseHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIsSuccessStatusCode(value: Boolean): Self = StObject.set(x, "isSuccessStatusCode", value.asInstanceOf[js.Any])
    
    inline def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
    
    inline def setRequestMessage(value: HttpRequestMessage): Self = StObject.set(x, "requestMessage", value.asInstanceOf[js.Any])
    
    inline def setSource(value: HttpResponseMessageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: HttpStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: HttpVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
