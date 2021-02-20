package typings.tensorflowTfjsCore

import typings.std.File
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserFilesMod {
  
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
  object BrowserDownloads_ {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads.URL_SCHEME")
    @js.native
    val URL_SCHEME: /* "downloads://" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "browserDownloads")
  @js.native
  def browserDownloads(): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "browserDownloads")
  @js.native
  def browserDownloads(fileNamePrefix: String): IOHandler = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "browserDownloadsRouter")
  @js.native
  val browserDownloadsRouter: IORouter = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "browserFiles")
  @js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
}
