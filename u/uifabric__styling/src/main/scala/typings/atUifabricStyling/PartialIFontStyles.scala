package typings.atUifabricStyling

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IFontStyles.IFontStyles> */
trait PartialIFontStyles extends js.Object {
  var large: js.UndefOr[IRawStyle] = js.undefined
  var medium: js.UndefOr[IRawStyle] = js.undefined
  var mediumPlus: js.UndefOr[IRawStyle] = js.undefined
  var mega: js.UndefOr[IRawStyle] = js.undefined
  var small: js.UndefOr[IRawStyle] = js.undefined
  var smallPlus: js.UndefOr[IRawStyle] = js.undefined
  var superLarge: js.UndefOr[IRawStyle] = js.undefined
  var tiny: js.UndefOr[IRawStyle] = js.undefined
  var xLarge: js.UndefOr[IRawStyle] = js.undefined
  var xLargePlus: js.UndefOr[IRawStyle] = js.undefined
  var xSmall: js.UndefOr[IRawStyle] = js.undefined
  var xxLarge: js.UndefOr[IRawStyle] = js.undefined
  var xxLargePlus: js.UndefOr[IRawStyle] = js.undefined
}

object PartialIFontStyles {
  @scala.inline
  def apply(
    large: IRawStyle = null,
    medium: IRawStyle = null,
    mediumPlus: IRawStyle = null,
    mega: IRawStyle = null,
    small: IRawStyle = null,
    smallPlus: IRawStyle = null,
    superLarge: IRawStyle = null,
    tiny: IRawStyle = null,
    xLarge: IRawStyle = null,
    xLargePlus: IRawStyle = null,
    xSmall: IRawStyle = null,
    xxLarge: IRawStyle = null,
    xxLargePlus: IRawStyle = null
  ): PartialIFontStyles = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (mediumPlus != null) __obj.updateDynamic("mediumPlus")(mediumPlus)
    if (mega != null) __obj.updateDynamic("mega")(mega)
    if (small != null) __obj.updateDynamic("small")(small)
    if (smallPlus != null) __obj.updateDynamic("smallPlus")(smallPlus)
    if (superLarge != null) __obj.updateDynamic("superLarge")(superLarge)
    if (tiny != null) __obj.updateDynamic("tiny")(tiny)
    if (xLarge != null) __obj.updateDynamic("xLarge")(xLarge)
    if (xLargePlus != null) __obj.updateDynamic("xLargePlus")(xLargePlus)
    if (xSmall != null) __obj.updateDynamic("xSmall")(xSmall)
    if (xxLarge != null) __obj.updateDynamic("xxLarge")(xxLarge)
    if (xxLargePlus != null) __obj.updateDynamic("xxLargePlus")(xxLargePlus)
    __obj.asInstanceOf[PartialIFontStyles]
  }
}

