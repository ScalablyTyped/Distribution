package typings.wordpressDom

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomHiddenCaretRangeFromPointMod {
  
  @JSImport("@wordpress/dom/build-types/dom/hidden-caret-range-from-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(doc: Document, x: Double, y: Double, container: HTMLElement): Range | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(doc.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Range | Null]
}
