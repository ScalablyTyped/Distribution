package typings.styledSystem.mod

import typings.csstype.mod.BackgroundImageProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundProps[TLength]
  extends BackgroundImageProps
     with BackgroundSizeProps[TLengthStyledSystem]
     with BackgroundPositionProps[TLengthStyledSystem]
     with BackgroundRepeatProps {
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[BackgroundProperty[TLength]]] = js.undefined
}

object BackgroundProps {
  @scala.inline
  def apply[TLength](
    background: ResponsiveValue[BackgroundProperty[TLength]] = null,
    backgroundImage: ResponsiveValue[BackgroundImageProperty] = null,
    backgroundPosition: ResponsiveValue[BackgroundPositionProperty[TLengthStyledSystem]] = null,
    backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty] = null,
    backgroundSize: ResponsiveValue[BackgroundSizeProperty[TLengthStyledSystem]] = null
  ): BackgroundProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps[TLength]]
  }
}

