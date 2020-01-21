package typings.xstyledSystem.mod

import typings.csstype.mod.LetterSpacingProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterSpacingProps[TLength] extends js.Object {
  val letterSpacing: js.UndefOr[ResponsiveValue[LetterSpacingProperty[TLength]]] = js.undefined
}

object LetterSpacingProps {
  @scala.inline
  def apply[TLength](letterSpacing: ResponsiveValue[LetterSpacingProperty[TLength]] = null): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
}

