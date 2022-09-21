package typings.treat

import typings.treat.typesMod.ClassRef
import typings.treat.typesMod.ThemeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveClassNameMod {
  
  @JSImport("treat/dist/declarations/src/resolveClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveClassName(themeRef: ThemeRef, classRef: ClassRef): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
}
