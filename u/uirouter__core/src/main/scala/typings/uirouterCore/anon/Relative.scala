package typings.uirouterCore.anon

import typings.uirouterCore.stateInterfaceMod.StateOrName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relative extends js.Object {
  var relative: js.UndefOr[StateOrName] = js.undefined
}

object Relative {
  @scala.inline
  def apply(relative: StateOrName = null): Relative = {
    val __obj = js.Dynamic.literal()
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relative]
  }
}

