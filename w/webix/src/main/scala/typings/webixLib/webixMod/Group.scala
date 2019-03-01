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
  def apply(
    group: js.Function2[js.Any, scala.Boolean, scala.Unit],
    ungroup: js.Function1[scala.Boolean, scala.Unit]
  ): Group = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("ungroup")(ungroup)
    __obj.asInstanceOf[Group]
  }
}

