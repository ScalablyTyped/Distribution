package typings.winjs.anon

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: Promise[HTMLElement]
  var renderComplete: Promise[_]
}

object Element {
  @scala.inline
  def apply(element: Promise[HTMLElement], renderComplete: Promise[_]): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

