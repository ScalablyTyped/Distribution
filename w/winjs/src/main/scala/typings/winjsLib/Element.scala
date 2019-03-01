package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var winControl: js.Any
}

object Element {
  @scala.inline
  def apply(winControl: js.Any): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("winControl")(winControl)
    __obj.asInstanceOf[Element]
  }
}

