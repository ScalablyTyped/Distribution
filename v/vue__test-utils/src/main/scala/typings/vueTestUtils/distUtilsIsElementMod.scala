package typings.vueTestUtils

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsIsElementMod {
  
  @JSImport("@vue/test-utils/dist/utils/isElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElement(element: Node): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
}
