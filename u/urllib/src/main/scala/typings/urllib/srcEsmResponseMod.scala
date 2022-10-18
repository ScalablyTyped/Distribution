package typings.urllib

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmResponseMod {
  
  trait BaseResponseMeta extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var socket: SocketInfo
    
    var status: Double
    
    var statusCode: Double
    
    var timing: Timing
  }
  object BaseResponseMeta {
    
    inline def apply(
      headers: IncomingHttpHeaders,
      socket: SocketInfo,
      status: Double,
      statusCode: Double,
      timing: Timing
    ): BaseResponseMeta = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResponseMeta]
    }
    
    extension [Self <: BaseResponseMeta](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: SocketInfo): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpClientResponse extends StObject {
    
    var data: Any
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var redirected: Boolean
    
    var requestUrls: js.Array[String]
    
    var res: ReadableWithMeta | HttpClientResponseMeta
    
    var status: Double
    
    var statusCode: Double
    
    var url: String
  }
  object HttpClientResponse {
    
    inline def apply(
      data: Any,
      headers: IncomingHttpHeaders,
      opaque: Any,
      redirected: Boolean,
      requestUrls: js.Array[String],
      res: ReadableWithMeta | HttpClientResponseMeta,
      status: Double,
      statusCode: Double,
      url: String
    ): HttpClientResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], requestUrls = requestUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpClientResponse]
    }
    
    extension [Self <: HttpClientResponse](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setRequestUrls(value: js.Array[String]): Self = StObject.set(x, "requestUrls", value.asInstanceOf[js.Any])
      
      inline def setRequestUrlsVarargs(value: String*): Self = StObject.set(x, "requestUrls", js.Array(value*))
      
      inline def setRes(value: ReadableWithMeta | HttpClientResponseMeta): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpClientResponseMeta
    extends StObject
       with BaseResponseMeta {
    
    var aborted: Boolean
    
    var keepAliveSocket: Boolean
    
    var requestUrls: js.Array[String]
    
    var rt: Double
    
    var size: Double
  }
  object HttpClientResponseMeta {
    
    inline def apply(
      aborted: Boolean,
      headers: IncomingHttpHeaders,
      keepAliveSocket: Boolean,
      requestUrls: js.Array[String],
      rt: Double,
      size: Double,
      socket: SocketInfo,
      status: Double,
      statusCode: Double,
      timing: Timing
    ): HttpClientResponseMeta = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], keepAliveSocket = keepAliveSocket.asInstanceOf[js.Any], requestUrls = requestUrls.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpClientResponseMeta]
    }
    
    extension [Self <: HttpClientResponseMeta](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveSocket(value: Boolean): Self = StObject.set(x, "keepAliveSocket", value.asInstanceOf[js.Any])
      
      inline def setRequestUrls(value: js.Array[String]): Self = StObject.set(x, "requestUrls", value.asInstanceOf[js.Any])
      
      inline def setRequestUrlsVarargs(value: String*): Self = StObject.set(x, "requestUrls", js.Array(value*))
      
      inline def setRt(value: Double): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadableWithMeta
    extends Readable
       with BaseResponseMeta
  
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
    
    extension [Self <: SocketInfo](x: Self) {
      
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
    
    extension [Self <: Timing](x: Self) {
      
      inline def setConnected(value: Double): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setContentDownload(value: Double): Self = StObject.set(x, "contentDownload", value.asInstanceOf[js.Any])
      
      inline def setQueuing(value: Double): Self = StObject.set(x, "queuing", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersSent(value: Double): Self = StObject.set(x, "requestHeadersSent", value.asInstanceOf[js.Any])
      
      inline def setRequestSent(value: Double): Self = StObject.set(x, "requestSent", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
}
