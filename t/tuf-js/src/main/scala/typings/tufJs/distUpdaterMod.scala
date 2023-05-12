package typings.tufJs

import typings.tufJs.anon.PartialConfig
import typings.tufJs.distFetcherMod.Fetcher
import typings.tufjsModels.mod.TargetFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUpdaterMod {
  
  @JSImport("tuf-js/dist/updater", "Updater")
  @js.native
  open class Updater protected () extends StObject {
    def this(options: UpdaterOptions) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ var dir: Any = js.native
    
    def downloadTarget(targetInfo: TargetFile): js.Promise[String] = js.native
    def downloadTarget(targetInfo: TargetFile, filePath: String): js.Promise[String] = js.native
    def downloadTarget(targetInfo: TargetFile, filePath: String, targetBaseUrl: String): js.Promise[String] = js.native
    def downloadTarget(targetInfo: TargetFile, filePath: Unit, targetBaseUrl: String): js.Promise[String] = js.native
    
    /* private */ var fetcher: Any = js.native
    
    def findCachedTarget(targetInfo: TargetFile): js.Promise[js.UndefOr[String]] = js.native
    def findCachedTarget(targetInfo: TargetFile, filePath: String): js.Promise[js.UndefOr[String]] = js.native
    
    /* private */ var generateTargetPath: Any = js.native
    
    def getTargetInfo(targetPath: String): js.Promise[js.UndefOr[TargetFile]] = js.native
    
    /* private */ var loadLocalMetadata: Any = js.native
    
    /* private */ var loadRoot: Any = js.native
    
    /* private */ var loadSnapshot: Any = js.native
    
    /* private */ var loadTargets: Any = js.native
    
    /* private */ var loadTimestamp: Any = js.native
    
    /* private */ var metadataBaseUrl: Any = js.native
    
    /* private */ var persistMetadata: Any = js.native
    
    /* private */ var preorderDepthFirstWalk: Any = js.native
    
    def refresh(): js.Promise[Unit] = js.native
    
    /* private */ var targetBaseUrl: Any = js.native
    
    /* private */ var targetDir: Any = js.native
    
    /* private */ var trustedSet: Any = js.native
  }
  
  trait UpdaterOptions extends StObject {
    
    var config: js.UndefOr[PartialConfig] = js.undefined
    
    var fetcher: js.UndefOr[Fetcher] = js.undefined
    
    var metadataBaseUrl: String
    
    var metadataDir: String
    
    var targetBaseUrl: js.UndefOr[String] = js.undefined
    
    var targetDir: js.UndefOr[String] = js.undefined
  }
  object UpdaterOptions {
    
    inline def apply(metadataBaseUrl: String, metadataDir: String): UpdaterOptions = {
      val __obj = js.Dynamic.literal(metadataBaseUrl = metadataBaseUrl.asInstanceOf[js.Any], metadataDir = metadataDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdaterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdaterOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFetcher(value: Fetcher): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
      
      inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
      
      inline def setMetadataBaseUrl(value: String): Self = StObject.set(x, "metadataBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setMetadataDir(value: String): Self = StObject.set(x, "metadataDir", value.asInstanceOf[js.Any])
      
      inline def setTargetBaseUrl(value: String): Self = StObject.set(x, "targetBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setTargetBaseUrlUndefined: Self = StObject.set(x, "targetBaseUrl", js.undefined)
      
      inline def setTargetDir(value: String): Self = StObject.set(x, "targetDir", value.asInstanceOf[js.Any])
      
      inline def setTargetDirUndefined: Self = StObject.set(x, "targetDir", js.undefined)
    }
  }
}
