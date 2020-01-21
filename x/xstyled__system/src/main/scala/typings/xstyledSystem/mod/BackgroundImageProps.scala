package typings.xstyledSystem.mod

import typings.csstype.mod.BackgroundImageProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundImageProps extends js.Object {
  val backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImageProperty]] = js.undefined
}

object BackgroundImageProps {
  @scala.inline
  def apply(backgroundImage: ResponsiveValue[BackgroundImageProperty] = null): BackgroundImageProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageProps]
  }
}

