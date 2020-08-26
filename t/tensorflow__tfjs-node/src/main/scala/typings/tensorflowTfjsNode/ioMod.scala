package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io", JSImport.Namespace)
@js.native
object ioMod extends js.Object {
  def fileSystem(path: String): NodeFileSystem = js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: js.UndefOr[scala.Nothing], weightPathPrefix: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
}

