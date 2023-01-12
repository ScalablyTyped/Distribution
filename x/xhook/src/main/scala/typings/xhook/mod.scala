package typings.xhook

import typings.std.Blob
import typings.std.Document
import typings.std.Record
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xhook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def after(handler: AfterHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def after(handler: AfterHandler, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(handler.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def before(handler: BeforeHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def before(handler: BeforeHandler, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(handler.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  type AfterHandler = js.Function3[
    /* request */ Request, 
    /* response */ Response, 
    /* callback */ js.Function0[Unit], 
    Unit
  ]
  
  type BeforeHandler = js.Function2[
    /* request */ Request, 
    /* callback */ js.Function1[/* response */ js.UndefOr[Response], Unit], 
    Response | Unit
  ]
  
  trait Request extends StObject {
    
    var body: String
    
    var headers: Record[String, String]
    
    var method: String
    
    var timeout: Double
    
    var `type`: String
    
    var url: String
    
    var withCredentials: Boolean
  }
  object Request {
    
    inline def apply(
      body: String,
      headers: Record[String, String],
      method: String,
      timeout: Double,
      `type`: String,
      url: String,
      withCredentials: Boolean
    ): Request = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var data: ResponseType
    
    var headers: Record[String, String]
    
    var status: Double
    
    var statusText: String
    
    var text: String
    
    var xml: XMLDocument
  }
  object Response {
    
    inline def apply(
      data: ResponseType,
      headers: Record[String, String],
      status: Double,
      statusText: String,
      text: String,
      xml: XMLDocument
    ): Response = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setData(value: ResponseType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setXml(value: XMLDocument): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    }
  }
  
  type ResponseType = js.typedarray.ArrayBuffer | Document | Blob | js.Object | String
}
