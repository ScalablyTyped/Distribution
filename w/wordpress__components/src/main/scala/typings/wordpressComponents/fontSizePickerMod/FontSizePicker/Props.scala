package typings.wordpressComponents.fontSizePickerMod.FontSizePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * If `true`, it will not be possible to choose a custom fontSize. The
    * user will be forced to pick one of the pre-defined sizes passed in
    * fontSizes.
    */
  var disableCustomFontSizes: js.UndefOr[Boolean] = js.native
  /**
    * If no value exists, this prop defines the starting position for the
    * font size picker slider. Only relevant if `withSlider` is `true`.
    */
  var fallbackFontSize: js.UndefOr[Double] = js.native
  /**
    * An array of font size objects.
    */
  var fontSizes: js.UndefOr[js.Array[FontSize]] = js.native
  /**
    * The current font size value.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * If `true`, the UI will contain a slider, instead of a numeric text
    * input field.
    */
  var withSlider: js.UndefOr[Boolean] = js.native
  /**
    * A function that receives the new font size value. If `size` is
    * undefined, it should reset the value, attending to what reset means
    * in that context, e.g., set the font size to undefined or set the font
    * size to a starting value.
    */
  def onChange(): Unit = js.native
  def onChange(size: Double): Unit = js.native
}

