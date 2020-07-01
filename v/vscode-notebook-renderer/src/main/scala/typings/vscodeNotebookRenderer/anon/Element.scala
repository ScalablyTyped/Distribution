package typings.vscodeNotebookRenderer.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: HTMLElement
  var outputId: String
}

object Element {
  @scala.inline
  def apply(element: HTMLElement, outputId: String): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], outputId = outputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

