package typings.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubsetRecord extends IIconSubset {
  var className: js.UndefOr[String] = js.undefined
  var isRegistered: js.UndefOr[Boolean] = js.undefined
}

object IIconSubsetRecord {
  @scala.inline
  def apply(
    icons: StringDictionary[String | Element],
    className: String = null,
    fontFace: IFontFace = null,
    isRegistered: js.UndefOr[Boolean] = js.undefined,
    style: IRawStyle = null
  ): IIconSubsetRecord = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace.asInstanceOf[js.Any])
    if (!js.isUndefined(isRegistered)) __obj.updateDynamic("isRegistered")(isRegistered.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubsetRecord]
  }
}

