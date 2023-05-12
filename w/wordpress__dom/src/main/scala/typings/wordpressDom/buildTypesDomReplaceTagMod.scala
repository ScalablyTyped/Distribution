package typings.wordpressDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomReplaceTagMod {
  
  @JSImport("@wordpress/dom/build-types/dom/replace-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Element, tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
}
