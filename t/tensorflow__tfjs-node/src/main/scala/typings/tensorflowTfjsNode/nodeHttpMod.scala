package typings.tensorflowTfjsNode

import typings.std.RequestInit
import typings.tensorflowTfjsCore.typesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: js.UndefOr[scala.Nothing], weightPathPrefix: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", "nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/node_http", "nodeHTTPRequestRouter")
  @js.native
  def nodeHTTPRequestRouter(url: String): IOHandler = js.native
}
