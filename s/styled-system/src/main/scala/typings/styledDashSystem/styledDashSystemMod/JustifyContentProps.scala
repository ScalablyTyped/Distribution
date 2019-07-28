package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.JustifyContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyContentProps extends js.Object {
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[ResponsiveValue[JustifyContentProperty]] = js.undefined
}

object JustifyContentProps {
  @scala.inline
  def apply(justifyContent: ResponsiveValue[JustifyContentProperty] = null): JustifyContentProps = {
    val __obj = js.Dynamic.literal()
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyContentProps]
  }
}

