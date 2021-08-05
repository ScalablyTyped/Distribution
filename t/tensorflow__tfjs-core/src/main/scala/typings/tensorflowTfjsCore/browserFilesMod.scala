package typings.tensorflowTfjsCore

import typings.std.File
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserFilesMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads")
  @js.native
  class BrowserDownloads_ ()
    extends StObject
       with IOHandler {
    def this(fileNamePrefix: String) = this()
    
    /* private */ val jsonAnchor: js.Any = js.native
    
    /* private */ val modelTopologyFileName: js.Any = js.native
    
    @JSName("save")
    def save_MBrowserDownloads_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
    
    /* private */ val weightDataAnchor: js.Any = js.native
    
    /* private */ val weightDataFileName: js.Any = js.native
  }
  /* static members */
  object BrowserDownloads_ {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "BrowserDownloads.URL_SCHEME")
    @js.native
    val URL_SCHEME: /* "downloads://" */ String = js.native
  }
  
  inline def browserDownloads(): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserDownloads")().asInstanceOf[IOHandler]
  inline def browserDownloads(fileNamePrefix: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserDownloads")(fileNamePrefix.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-core/dist/io/browser_files", "browserDownloadsRouter")
  @js.native
  val browserDownloadsRouter: IORouter = js.native
  
  inline def browserFiles(files: js.Array[File]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserFiles")(files.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
}
