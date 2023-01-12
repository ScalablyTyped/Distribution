package typings.webpackDevMiddleware

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCompatibleAPIMod {
  
  @JSImport("webpack-dev-middleware/types/utils/compatibleAPI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeaderFromRequest[Request_1 /* <: typings.node.httpMod.IncomingMessage */](req: Request_1, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderFromRequest")(req.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getHeaderFromResponse[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1, name: String): js.UndefOr[Double | String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderFromResponse")(res.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | String | js.Array[String]]]
  
  inline def getHeaderNames[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderNames")(res.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def send[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](req: Request_1, res: Response_1, bufferOtStream: String, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], bufferOtStream.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](req: Request_1, res: Response_1, bufferOtStream: Buffer, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], bufferOtStream.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](req: Request_1, res: Response_1, bufferOtStream: ReadStream, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], bufferOtStream.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setHeaderForResponse[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHeaderForResponse")(res.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setHeaderForResponse[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1, name: String, value: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHeaderForResponse")(res.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setHeaderForResponse[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1, name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHeaderForResponse")(res.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setStatusCode[Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](res: Response_1, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusCode")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ExpectedRequest extends StObject {
    
    def get(name: String): js.UndefOr[String]
  }
  object ExpectedRequest {
    
    inline def apply(get: String => js.UndefOr[String]): ExpectedRequest = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[ExpectedRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpectedRequest] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ExpectedResponse extends StObject {
    
    def get(name: String): js.UndefOr[String | js.Array[String]] = js.native
    
    def send(data: Any): Unit = js.native
    
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: js.Array[String]): Unit = js.native
    def set(name: String, value: Double): Unit = js.native
    
    def status(status: Double): Unit = js.native
  }
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
}
