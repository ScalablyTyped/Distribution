package typings.xstyledSystem.mod

import typings.csstype.mod.BackgroundImageProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundsProps
  extends BackgroundProps
     with BackgroundColorProps[StyledSystemLength]
     with BackgroundImageProps
     with BackgroundSizeProps[StyledSystemLength]
     with BackgroundPositionProps[StyledSystemLength]
     with BackgroundRepeatProps

object BackgroundsProps {
  @scala.inline
  def apply(
    background: ResponsiveValue[BackgroundProperty[String]] = null,
    backgroundColor: ResponsiveValue[BackgroundProperty[StyledSystemLength]] = null,
    backgroundImage: ResponsiveValue[BackgroundImageProperty] = null,
    backgroundPosition: ResponsiveValue[BackgroundPositionProperty[StyledSystemLength]] = null,
    backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty] = null,
    backgroundSize: ResponsiveValue[BackgroundSizeProperty[StyledSystemLength]] = null
  ): BackgroundsProps = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundsProps]
  }
}

