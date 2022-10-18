package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsNode.distIoFileSystemMod.NodeFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileSystem(path: String): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  inline def fileSystem(path: js.Array[String]): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  
  inline def nodeHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: Unit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
}
