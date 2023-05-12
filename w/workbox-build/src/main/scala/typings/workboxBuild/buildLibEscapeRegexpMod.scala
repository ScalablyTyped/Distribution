package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibEscapeRegexpMod {
  
  @JSImport("workbox-build/build/lib/escape-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeRegExp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
