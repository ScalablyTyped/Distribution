package typings.xstyledSystem.mod

import typings.csstype.mod.BackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundProps extends js.Object {
  val background: js.UndefOr[ResponsiveValue[BackgroundProperty[String]]] = js.undefined
}

object BackgroundProps {
  @scala.inline
  def apply(background: ResponsiveValue[BackgroundProperty[String]] = null): BackgroundProps = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps]
  }
}

