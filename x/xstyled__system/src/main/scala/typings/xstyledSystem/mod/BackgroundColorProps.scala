package typings.xstyledSystem.mod

import typings.csstype.mod.BackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorProps[TLength] extends js.Object {
  val backgroundColor: js.UndefOr[ResponsiveValue[BackgroundProperty[TLength]]] = js.undefined
}

object BackgroundColorProps {
  @scala.inline
  def apply[TLength](backgroundColor: ResponsiveValue[BackgroundProperty[TLength]] = null): BackgroundColorProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorProps[TLength]]
  }
}

