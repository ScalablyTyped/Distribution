package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetFileSizeMod {
  
  @JSImport("workbox-build/build/lib/get-file-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileSize(file: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSize")(file.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
}
