package typings.atTensorflowTfjsDashCore.distIoBrowserUnderscoreFilesMod

import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val browserDownloadsRouter: IORouter = js.native
  def browserDownloads(): IOHandler = js.native
  def browserDownloads(fileNamePrefix: String): IOHandler = js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
}

