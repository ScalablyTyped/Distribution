package typings.xstyledSystem.mod

import typings.csstype.mod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTransformProps extends js.Object {
  val textTransform: js.UndefOr[ResponsiveValue[TextTransformProperty]] = js.undefined
}

object TextTransformProps {
  @scala.inline
  def apply(textTransform: ResponsiveValue[TextTransformProperty] = null): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTransformProps]
  }
}

