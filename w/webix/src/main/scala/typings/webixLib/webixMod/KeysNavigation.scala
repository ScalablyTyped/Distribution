package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysNavigation extends js.Object {
  def moveSelection(direction: java.lang.String): scala.Unit
}

object KeysNavigation {
  @scala.inline
  def apply(moveSelection: js.Function1[java.lang.String, scala.Unit]): KeysNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moveSelection")(moveSelection)
    __obj.asInstanceOf[KeysNavigation]
  }
}

