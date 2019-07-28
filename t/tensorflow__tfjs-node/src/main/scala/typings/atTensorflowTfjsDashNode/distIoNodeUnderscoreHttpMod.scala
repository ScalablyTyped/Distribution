package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io/node_http", JSImport.Namespace)
@js.native
object distIoNodeUnderscoreHttpMod extends js.Object {
  def nodeHTTPRequest(path: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  def nodeHTTPRequestRouter(url: String): IOHandler = js.native
}

