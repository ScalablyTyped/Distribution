package typings.atUifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/utilities/icons.IIconOptions> */
trait PartialIIconOptions extends js.Object {
  var disableWarnings: js.UndefOr[Boolean] = js.undefined
  var warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined
}

object PartialIIconOptions {
  @scala.inline
  def apply(
    disableWarnings: js.UndefOr[Boolean] = js.undefined,
    warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined
  ): PartialIIconOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableWarnings)) __obj.updateDynamic("disableWarnings")(disableWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(warnOnMissingIcons)) __obj.updateDynamic("warnOnMissingIcons")(warnOnMissingIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIIconOptions]
  }
}

