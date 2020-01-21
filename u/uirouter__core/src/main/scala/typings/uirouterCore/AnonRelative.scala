package typings.uirouterCore

import typings.uirouterCore.stateInterfaceMod.StateOrName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelative extends js.Object {
  var relative: js.UndefOr[StateOrName] = js.undefined
}

object AnonRelative {
  @scala.inline
  def apply(relative: StateOrName = null): AnonRelative = {
    val __obj = js.Dynamic.literal()
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelative]
  }
}

