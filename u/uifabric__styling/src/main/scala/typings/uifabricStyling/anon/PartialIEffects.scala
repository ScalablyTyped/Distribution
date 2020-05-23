package typings.uifabricStyling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IEffects.IEffects> */
trait PartialIEffects extends js.Object {
  var elevation16: js.UndefOr[String] = js.undefined
  var elevation4: js.UndefOr[String] = js.undefined
  var elevation64: js.UndefOr[String] = js.undefined
  var elevation8: js.UndefOr[String] = js.undefined
  var roundedCorner2: js.UndefOr[String] = js.undefined
}

object PartialIEffects {
  @scala.inline
  def apply(
    elevation16: String = null,
    elevation4: String = null,
    elevation64: String = null,
    elevation8: String = null,
    roundedCorner2: String = null
  ): PartialIEffects = {
    val __obj = js.Dynamic.literal()
    if (elevation16 != null) __obj.updateDynamic("elevation16")(elevation16.asInstanceOf[js.Any])
    if (elevation4 != null) __obj.updateDynamic("elevation4")(elevation4.asInstanceOf[js.Any])
    if (elevation64 != null) __obj.updateDynamic("elevation64")(elevation64.asInstanceOf[js.Any])
    if (elevation8 != null) __obj.updateDynamic("elevation8")(elevation8.asInstanceOf[js.Any])
    if (roundedCorner2 != null) __obj.updateDynamic("roundedCorner2")(roundedCorner2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIEffects]
  }
}

