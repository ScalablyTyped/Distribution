package typings.styledSystem.mod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontStyleProperty
import typings.csstype.mod.TextAlignProperty
import typings.styledSystem.styledSystemStrings.fontSizes
import typings.styledSystem.styledSystemStrings.fontWeights
import typings.styledSystem.styledSystemStrings.letterSpacings
import typings.styledSystem.styledSystemStrings.lineHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends FontFamilyProps[ThemeType]
     with FontSizeProps[ThemeType, ThemeValue[fontSizes, ThemeType, js.Any]]
     with FontWeightProps[ThemeType, ThemeValue[fontWeights, ThemeType, js.Any]]
     with LineHeightProps[ThemeType, ThemeValue[lineHeights, ThemeType, js.Any]]
     with LetterSpacingProps[ThemeType, ThemeValue[letterSpacings, ThemeType, js.Any]]
     with FontStyleProps[ThemeType]
     with TextAlignProps[ThemeType]

object TypographyProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    fontFamily: js.UndefOr[Null | (ResponsiveValue[FontFamilyProperty, ThemeType])] = js.undefined,
    fontSize: js.UndefOr[Null | (ResponsiveValue[ThemeValue[fontSizes, ThemeType, js.Any], ThemeType])] = js.undefined,
    fontStyle: js.UndefOr[Null | (ResponsiveValue[FontStyleProperty, ThemeType])] = js.undefined,
    fontWeight: js.UndefOr[Null | (ResponsiveValue[ThemeValue[fontWeights, ThemeType, js.Any], ThemeType])] = js.undefined,
    letterSpacing: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[letterSpacings, ThemeType, js.Any], ThemeType])
    ] = js.undefined,
    lineHeight: js.UndefOr[Null | (ResponsiveValue[ThemeValue[lineHeights, ThemeType, js.Any], ThemeType])] = js.undefined,
    textAlign: js.UndefOr[Null | (ResponsiveValue[TextAlignProperty, ThemeType])] = js.undefined
  ): TypographyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fontFamily)) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fontStyle)) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(textAlign)) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps[ThemeType]]
  }
}

