package typings.vueTestUtils

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsIsElementVisibleMod {
  
  @JSImport("@vue/test-utils/dist/utils/isElementVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElementVisible[T /* <: Element */](element: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
