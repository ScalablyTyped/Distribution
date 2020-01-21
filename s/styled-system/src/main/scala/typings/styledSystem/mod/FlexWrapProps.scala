package typings.styledSystem.mod

import typings.csstype.mod.FlexWrapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexWrapProps extends js.Object {
  /**
    * The flex-wrap CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines.
    * If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap)
    */
  var flexWrap: js.UndefOr[ResponsiveValue[FlexWrapProperty]] = js.undefined
}

object FlexWrapProps {
  @scala.inline
  def apply(flexWrap: ResponsiveValue[FlexWrapProperty] = null): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrapProps]
  }
}

