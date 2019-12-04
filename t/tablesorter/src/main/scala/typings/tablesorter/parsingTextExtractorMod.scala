package typings.tablesorter

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Parsing/TextExtractor", JSImport.Namespace)
@js.native
object parsingTextExtractorMod extends js.Object {
  type TextExtractor[TElement] = js.Function3[/* cell */ Element, /* table */ TElement, /* index */ Double, String]
}

