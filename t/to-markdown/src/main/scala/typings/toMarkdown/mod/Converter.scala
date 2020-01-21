package typings.toMarkdown.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  var filter: Filter
  def replacement(innerHTML: String, node: HTMLElement): String
}

object Converter {
  @scala.inline
  def apply(filter: Filter, replacement: (String, HTMLElement) => String): Converter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
  
    __obj.asInstanceOf[Converter]
  }
}

