package typings.styledSystem.mod

import typings.csstype.mod.BorderLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderLeftProps[TLength] extends js.Object {
  /**
    * The border-left CSS property is a shorthand that sets the values of border-left-width,
    * border-left-style, and border-left-color. These properties describe an element's left border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left)
    */
  var borderLeft: js.UndefOr[ResponsiveValue[BorderLeftProperty[TLength]]] = js.undefined
}

object BorderLeftProps {
  @scala.inline
  def apply[TLength](borderLeft: ResponsiveValue[BorderLeftProperty[TLength]] = null): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
}

