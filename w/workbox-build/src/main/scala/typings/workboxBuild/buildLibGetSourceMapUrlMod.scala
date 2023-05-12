package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetSourceMapUrlMod {
  
  @JSImport("workbox-build/build/lib/get-source-map-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourceMapURL(srcContents: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceMapURL")(srcContents.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
