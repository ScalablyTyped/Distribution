package typings.styledSystem.mod

import typings.styledSystem.styledSystemStrings.fontSizes
import typings.styledSystem.styledSystemStrings.fontWeights
import typings.styledSystem.styledSystemStrings.letterSpacings
import typings.styledSystem.styledSystemStrings.lineHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with FontFamilyProps[ThemeType]
     with FontSizeProps[ThemeType, ThemeValue[fontSizes, ThemeType, Any]]
     with FontWeightProps[ThemeType, ThemeValue[fontWeights, ThemeType, Any]]
     with LineHeightProps[ThemeType, ThemeValue[lineHeights, ThemeType, Any]]
     with LetterSpacingProps[ThemeType, ThemeValue[letterSpacings, ThemeType, Any]]
     with FontStyleProps[ThemeType]
     with TextAlignProps[ThemeType]
object TypographyProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TypographyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps[ThemeType]]
  }
}
