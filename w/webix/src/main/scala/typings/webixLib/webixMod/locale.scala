package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locale extends js.Object {
  var pager: js.Any
}

object locale {
  @scala.inline
  def apply(pager: js.Any): locale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pager")(pager)
    __obj.asInstanceOf[locale]
  }
}

