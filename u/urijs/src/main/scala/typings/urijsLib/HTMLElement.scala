package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Compatability with node.js
// tslint:disable-next-line:no-empty-interface
trait HTMLElement extends js.Object {
  var innerText: java.lang.String
}

object HTMLElement {
  @scala.inline
  def apply(innerText: java.lang.String): HTMLElement = {
    val __obj = js.Dynamic.literal(innerText = innerText)
  
    __obj.asInstanceOf[HTMLElement]
  }
}

