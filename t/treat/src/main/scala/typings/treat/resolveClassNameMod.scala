package typings.treat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveClassNameMod {
  
  @JSImport("treat/lib/types/resolveClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resolveClassName(themeRef: String, classRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
}
