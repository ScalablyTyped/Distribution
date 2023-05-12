package typings.tufJs

import typings.tufJs.distUpdaterMod.UpdaterOptions
import typings.tufjsModels.distFileMod.TargetFileOptions
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("tuf-js", "BaseFetcher")
  @js.native
  open class BaseFetcher ()
    extends typings.tufJs.distFetcherMod.BaseFetcher
  
  @JSImport("tuf-js", "TargetFile")
  @js.native
  open class TargetFile protected ()
    extends typings.tufjsModels.mod.TargetFile {
    def this(opts: TargetFileOptions) = this()
  }
  /* static members */
  object TargetFile {
    
    @JSImport("tuf-js", "TargetFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(path: String, data: JSONObject): typings.tufjsModels.distFileMod.TargetFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distFileMod.TargetFile]
  }
  
  @JSImport("tuf-js", "Updater")
  @js.native
  open class Updater protected ()
    extends typings.tufJs.distUpdaterMod.Updater {
    def this(options: UpdaterOptions) = this()
  }
}
