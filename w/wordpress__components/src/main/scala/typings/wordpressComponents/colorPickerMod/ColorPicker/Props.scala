package typings.wordpressComponents.colorPickerMod.ColorPicker

import typings.wordpressComponents.anon.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Machine-readable color value.
    */
  var color: String
  /**
    * Should alpha be disabled?
    */
  var disableAlpha: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to be called when color value changes.
    */
  def onChangeComplete(value: Hex): Unit
}

object Props {
  @scala.inline
  def apply(color: String, onChangeComplete: Hex => Unit, disableAlpha: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onChangeComplete = js.Any.fromFunction1(onChangeComplete))
    if (!js.isUndefined(disableAlpha)) __obj.updateDynamic("disableAlpha")(disableAlpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

