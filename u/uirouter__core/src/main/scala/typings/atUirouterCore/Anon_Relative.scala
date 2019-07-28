package typings.atUirouterCore

import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Relative extends js.Object {
  var relative: js.UndefOr[StateOrName] = js.undefined
}

object Anon_Relative {
  @scala.inline
  def apply(relative: StateOrName = null): Anon_Relative = {
    val __obj = js.Dynamic.literal()
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Relative]
  }
}

