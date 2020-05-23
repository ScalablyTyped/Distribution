package typings.uifabricStyling.anon

import typings.uifabricMergeStyles.istyleMod.IRawStyle
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
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (mediumPlus != null) __obj.updateDynamic("mediumPlus")(mediumPlus.asInstanceOf[js.Any])
    if (mega != null) __obj.updateDynamic("mega")(mega.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (smallPlus != null) __obj.updateDynamic("smallPlus")(smallPlus.asInstanceOf[js.Any])
    if (superLarge != null) __obj.updateDynamic("superLarge")(superLarge.asInstanceOf[js.Any])
    if (tiny != null) __obj.updateDynamic("tiny")(tiny.asInstanceOf[js.Any])
    if (xLarge != null) __obj.updateDynamic("xLarge")(xLarge.asInstanceOf[js.Any])
    if (xLargePlus != null) __obj.updateDynamic("xLargePlus")(xLargePlus.asInstanceOf[js.Any])
    if (xSmall != null) __obj.updateDynamic("xSmall")(xSmall.asInstanceOf[js.Any])
    if (xxLarge != null) __obj.updateDynamic("xxLarge")(xxLarge.asInstanceOf[js.Any])
    if (xxLargePlus != null) __obj.updateDynamic("xxLargePlus")(xxLargePlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIFontStyles]
  }
}

