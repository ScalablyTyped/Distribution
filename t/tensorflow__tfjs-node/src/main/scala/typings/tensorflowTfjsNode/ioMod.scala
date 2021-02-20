package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io", "fileSystem")
  @js.native
  def fileSystem(path: String): NodeFileSystem = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io", "fileSystem")
  @js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: js.UndefOr[scala.Nothing], weightPathPrefix: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
}
