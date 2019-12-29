package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.downloadsColonSlashSlash
import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.SaveResult
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", JSImport.Namespace)
@js.native
object distIoBrowserUnderscoreFilesMod extends js.Object {
  @js.native
  class BrowserDownloads () extends IOHandler {
    def this(fileNamePrefix: String) = this()
    val jsonAnchor: js.Any = js.native
    val modelTopologyFileName: js.Any = js.native
    val weightDataAnchor: js.Any = js.native
    val weightDataFileName: js.Any = js.native
    @JSName("save")
    def save_MBrowserDownloads(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  
  val browserDownloadsRouter: IORouter = js.native
  def browserDownloads(): IOHandler = js.native
  def browserDownloads(fileNamePrefix: String): IOHandler = js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
  /* static members */
  @js.native
  object BrowserDownloads extends js.Object {
    val URL_SCHEME: downloadsColonSlashSlash = js.native
  }
  
}

