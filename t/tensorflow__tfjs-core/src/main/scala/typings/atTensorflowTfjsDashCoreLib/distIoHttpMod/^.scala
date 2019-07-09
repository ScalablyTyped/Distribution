package typings
package atTensorflowTfjsDashCoreLib.distIoHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val httpRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter = js.native
  def browserHTTPRequest(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def browserHTTPRequest(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def http(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def http(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def isHTTPScheme(url: java.lang.String): scala.Boolean = js.native
  def parseUrl(url: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
}

