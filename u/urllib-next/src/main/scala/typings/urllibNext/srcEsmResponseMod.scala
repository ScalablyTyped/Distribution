package typings.urllibNext

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.nodeColonstreamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmResponseMod {
  
  trait HttpClientResponse[T] extends StObject {
    
    var data: T
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var redirected: Boolean
    
    var requestUrls: js.Array[String]
    
    var res: RawResponseWithMeta
    
    var status: Double
    
    var statusCode: Double
    
    var statusText: String
    
    var url: String
  }
  object HttpClientResponse {
    
    inline def apply[T](
      data: T,
      headers: IncomingHttpHeaders,
      opaque: Any,
      redirected: Boolean,
      requestUrls: js.Array[String],
      res: RawResponseWithMeta,
      status: Double,
      statusCode: Double,
      statusText: String,
      url: String
    ): HttpClientResponse[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], requestUrls = requestUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpClientResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpClientResponse[?], T] (val x: Self & HttpClientResponse[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setRequestUrls(value: js.Array[String]): Self = StObject.set(x, "requestUrls", value.asInstanceOf[js.Any])
      
      inline def setRequestUrlsVarargs(value: String*): Self = StObject.set(x, "requestUrls", js.Array(value*))
      
      inline def setRes(value: RawResponseWithMeta): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawResponseWithMeta extends Readable {
    
    var aborted: Boolean = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var keepAliveSocket: Boolean = js.native
    
    var requestUrls: js.Array[String] = js.native
    
    var rt: Double = js.native
    
    var size: Double = js.native
    
    var socket: SocketInfo = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
    
    var statusText: String = js.native
    
    var timing: Timing = js.native
  }
  
  trait SocketInfo extends StObject {
    
    var bytesRead: Double
    
    var bytesWritten: Double
    
    var handledRequests: Double
    
    var handledResponses: Double
    
    var id: Double
    
    var localAddress: String
    
    var localPort: Double
    
    var remoteAddress: String
    
    var remoteFamily: String
    
    var remotePort: Double
  }
  object SocketInfo {
    
    inline def apply(
      bytesRead: Double,
      bytesWritten: Double,
      handledRequests: Double,
      handledResponses: Double,
      id: Double,
      localAddress: String,
      localPort: Double,
      remoteAddress: String,
      remoteFamily: String,
      remotePort: Double
    ): SocketInfo = {
      val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any], handledRequests = handledRequests.asInstanceOf[js.Any], handledResponses = handledResponses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteFamily = remoteFamily.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setHandledRequests(value: Double): Self = StObject.set(x, "handledRequests", value.asInstanceOf[js.Any])
      
      inline def setHandledResponses(value: Double): Self = StObject.set(x, "handledResponses", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteFamily(value: String): Self = StObject.set(x, "remoteFamily", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timing extends StObject {
    
    var connected: Double
    
    var contentDownload: Double
    
    var queuing: Double
    
    var requestHeadersSent: Double
    
    var requestSent: Double
    
    var waiting: Double
  }
  object Timing {
    
    inline def apply(
      connected: Double,
      contentDownload: Double,
      queuing: Double,
      requestHeadersSent: Double,
      requestSent: Double,
      waiting: Double
    ): Timing = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], contentDownload = contentDownload.asInstanceOf[js.Any], queuing = queuing.asInstanceOf[js.Any], requestHeadersSent = requestHeadersSent.asInstanceOf[js.Any], requestSent = requestSent.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: Double): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setContentDownload(value: Double): Self = StObject.set(x, "contentDownload", value.asInstanceOf[js.Any])
      
      inline def setQueuing(value: Double): Self = StObject.set(x, "queuing", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersSent(value: Double): Self = StObject.set(x, "requestHeadersSent", value.asInstanceOf[js.Any])
      
      inline def setRequestSent(value: Double): Self = StObject.set(x, "requestSent", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
}
