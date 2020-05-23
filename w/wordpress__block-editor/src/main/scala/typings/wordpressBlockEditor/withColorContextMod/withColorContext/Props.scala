package typings.wordpressBlockEditor.withColorContextMod.withColorContext

import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var colors: js.Array[EditorColor]
  var disableCustomColors: Boolean
  var hasColorsToChoose: Boolean
}

object Props {
  @scala.inline
  def apply(colors: js.Array[EditorColor], disableCustomColors: Boolean, hasColorsToChoose: Boolean): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], hasColorsToChoose = hasColorsToChoose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

