package typings.treat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("treat/lib/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertToCssClass(ref: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToCssClass")(ref.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def makeThemedClassReference(themeRef: String, classRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeThemedClassReference")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def templateThemeClassRef(classRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("templateThemeClassRef")(classRef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("treat/lib/types/utils", "themePlaceholder")
  @js.native
  val themePlaceholder: /* "$" */ String = js.native
}
