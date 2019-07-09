package typings
package atTensorflowTfjsDashCoreLib.distIoBrowserUnderscoreFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
@js.native
class BrowserDownloads ()
  extends atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler {
  def this(fileNamePrefix: java.lang.String) = this()
  val jsonAnchor: js.Any = js.native
  val modelTopologyFileName: js.Any = js.native
  val weightDataAnchor: js.Any = js.native
  val weightDataFileName: js.Any = js.native
  @JSName("save")
  def save_MBrowserDownloads(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
@js.native
object BrowserDownloads extends js.Object {
  val URL_SCHEME: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.`downloads://` = js.native
}

