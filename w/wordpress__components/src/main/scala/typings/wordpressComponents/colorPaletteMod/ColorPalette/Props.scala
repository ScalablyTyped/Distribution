package typings.wordpressComponents.colorPaletteMod.ColorPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var className: js.UndefOr[String] = js.native
  /**
    * Array of `ColorPalette.Color` to use.
    */
  var colors: js.Array[Color] = js.native
  /**
    * Should custom color selection be disabled?
    */
  var disableCustomColors: js.UndefOr[Boolean] = js.native
  /**
    * Current active color value.
    */
  var value: Color = js.native
  /**
    * Function to be called when color is changed. `color` may be
    * `undefined` if the color selection is the same as the current `value`.
    */
  def onChange(): Unit = js.native
  def onChange(color: Color): Unit = js.native
}

