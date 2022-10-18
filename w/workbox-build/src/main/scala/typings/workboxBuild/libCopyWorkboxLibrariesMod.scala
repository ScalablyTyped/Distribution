package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCopyWorkboxLibrariesMod {
  
  @JSImport("workbox-build/lib/copy-workbox-libraries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyWorkboxLibraries")(destDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
