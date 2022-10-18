package typings.wordpressMediaUtils

import typings.wordpressMediaUtils.utilsUploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/media-utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadMedia")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
