package typings.atStyledDashSystemCss

import typings.csstype.csstypeMod.ColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: ColorProperty
  var bg: ColorProperty
  var borderColor: ColorProperty
  var color: ColorProperty
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: ColorProperty,
    bg: ColorProperty,
    borderColor: ColorProperty,
    color: ColorProperty
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bg = bg.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

