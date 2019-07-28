package typings.atTensorflowTfjsDashCore.distIoHttpMod

import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val httpRouter: IORouter = js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def http(path: String): IOHandler = js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def isHTTPScheme(url: String): Boolean = js.native
  def parseUrl(url: String): js.Tuple2[String, String] = js.native
}

