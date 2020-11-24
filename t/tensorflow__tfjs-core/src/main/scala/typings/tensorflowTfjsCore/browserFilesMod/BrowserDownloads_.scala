package typings.tensorflowTfjsCore.browserFilesMod

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
@js.native
class BrowserDownloads_ () extends IOHandler {
  def this(fileNamePrefix: String) = this()
  
  val jsonAnchor: js.Any = js.native
  
  val modelTopologyFileName: js.Any = js.native
  
  @JSName("save")
  def save_MBrowserDownloads_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  
  val weightDataAnchor: js.Any = js.native
  
  val weightDataFileName: js.Any = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
@js.native
object BrowserDownloads_ extends js.Object {
  
  val URL_SCHEME: /* "downloads://" */ String = js.native
}
