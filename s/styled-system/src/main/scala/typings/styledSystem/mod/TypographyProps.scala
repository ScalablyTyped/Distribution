package typings.styledSystem.mod

import typings.styledSystem.styledSystemStrings.fontSizes
import typings.styledSystem.styledSystemStrings.fontWeights
import typings.styledSystem.styledSystemStrings.letterSpacings
import typings.styledSystem.styledSystemStrings.lineHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): TypographyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps[ThemeType]]
  }
}

