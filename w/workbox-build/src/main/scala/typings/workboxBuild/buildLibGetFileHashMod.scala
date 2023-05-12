package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetFileHashMod {
  
  @JSImport("workbox-build/build/lib/get-file-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileHash(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileHash")(file.asInstanceOf[js.Any]).asInstanceOf[String]
}
