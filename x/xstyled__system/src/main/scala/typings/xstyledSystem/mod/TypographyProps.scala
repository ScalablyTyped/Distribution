package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypographyProps
  extends FontFamilyProps
     with FontSizeProps[StyledSystemLength]
     with LineHeightProps[StyledSystemLength]
     with FontWeightProps
     with FontStyleProps
     with TextAlignProps
     with LetterSpacingProps[StyledSystemLength]
     with ColorProps
     with TextTransformProps

object TypographyProps {
  @scala.inline
  def apply(): TypographyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps]
  }
}

