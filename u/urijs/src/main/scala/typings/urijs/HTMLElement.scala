package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Compatability with node.js
// tslint:disable-next-line:no-empty-interface
trait HTMLElement extends js.Object {
  var innerText: String
}

object HTMLElement {
  @scala.inline
  def apply(innerText: String): HTMLElement = {
    val __obj = js.Dynamic.literal(innerText = innerText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElement]
  }
}

