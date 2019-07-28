package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.FontStyleProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.LetterSpacingProperty
import typings.csstype.csstypeMod.LineHeightProperty
import typings.csstype.csstypeMod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyProps
  extends FontFamilyProps
     with FontSizeProps[TLengthStyledSystem]
     with FontWeightProps
     with LineHeightProps[TLengthStyledSystem]
     with LetterSpacingProps[TLengthStyledSystem]
     with FontStyleProps
     with TextAlignProps

object TypographyProps {
  @scala.inline
  def apply(
    fontFamily: ResponsiveValue[FontFamilyProperty] = null,
    fontSize: ResponsiveValue[FontSizeProperty[TLengthStyledSystem]] = null,
    fontStyle: ResponsiveValue[FontStyleProperty] = null,
    fontWeight: ResponsiveValue[FontWeightProperty] = null,
    letterSpacing: ResponsiveValue[LetterSpacingProperty[TLengthStyledSystem]] = null,
    lineHeight: ResponsiveValue[LineHeightProperty[TLengthStyledSystem]] = null,
    textAlign: ResponsiveValue[TextAlignProperty] = null
  ): TypographyProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps]
  }
}

