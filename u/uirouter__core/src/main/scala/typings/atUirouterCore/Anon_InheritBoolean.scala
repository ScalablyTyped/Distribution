package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InheritBoolean extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object Anon_InheritBoolean {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined): Anon_InheritBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InheritBoolean]
  }
}

