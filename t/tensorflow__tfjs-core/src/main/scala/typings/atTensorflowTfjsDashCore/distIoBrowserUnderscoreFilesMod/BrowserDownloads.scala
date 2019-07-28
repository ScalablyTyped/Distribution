package typings.atTensorflowTfjsDashCore.distIoBrowserUnderscoreFilesMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`downloads://`
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
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

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
@js.native
object BrowserDownloads extends js.Object {
  val URL_SCHEME: `downloads://` = js.native
}

