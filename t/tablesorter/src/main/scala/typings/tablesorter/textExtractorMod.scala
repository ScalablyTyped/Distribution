package typings.tablesorter

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Parsing/TextExtractor", JSImport.Namespace)
@js.native
object textExtractorMod extends js.Object {
  
  type TextExtractor[TElement] = js.Function3[/* cell */ Element, /* table */ TElement, /* index */ Double, String]
}
