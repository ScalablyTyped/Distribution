package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fileSystem(path: String): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  @scala.inline
  def fileSystem(path: js.Array[String]): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  
  @scala.inline
  def nodeHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  @scala.inline
  def nodeHTTPRequest(path: String, requestInit: Unit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
}
