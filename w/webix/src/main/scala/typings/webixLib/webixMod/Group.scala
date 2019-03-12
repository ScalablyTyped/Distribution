package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  def group(config: js.Any, mode: scala.Boolean): scala.Unit
  def ungroup(mode: scala.Boolean): scala.Unit
}

object Group {
  @scala.inline
  def apply(group: (js.Any, scala.Boolean) => scala.Unit, ungroup: scala.Boolean => scala.Unit): Group = {
    val __obj = js.Dynamic.literal(group = js.Any.fromFunction2(group), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[Group]
  }
}

