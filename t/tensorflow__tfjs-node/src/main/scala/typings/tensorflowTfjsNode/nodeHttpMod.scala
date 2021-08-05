package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.typesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: Unit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  inline def nodeHTTPRequestRouter(url: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequestRouter")(url.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
}
