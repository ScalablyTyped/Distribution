package typings.wordpressComponents.colorPaletteMod.ColorPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * Machine-readable color value.
    */
  var color: String
  /**
    * Human-readable color name.
    */
  var name: String
}

object Color {
  @scala.inline
  def apply(color: String, name: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

