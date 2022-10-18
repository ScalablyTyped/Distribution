package typings.treat

import typings.treat.distDeclarationsSrcTypesMod.ClassRef
import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUtilsMod {
  
  @JSImport("treat/dist/declarations/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToCssClass(ref: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToCssClass")(ref.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeThemedClassReference(themeRef: ThemeRef, classRef: ClassRef): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeThemedClassReference")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def templateThemeClassRef(classRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("templateThemeClassRef")(classRef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("treat/dist/declarations/src/utils", "themePlaceholder")
  @js.native
  val themePlaceholder: /* "$" */ String = js.native
}
