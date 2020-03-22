package typings.vegaTooltip.defaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/src/defaults", "DEFAULT_OPTIONS")
@js.native
object DEFAULT_OPTIONS extends js.Object {
  /**
    * Do not use the default styles provided by Vega Tooltip. If you enable this option, you need to use your own styles. It is not necessary to disable the default style when using a custom theme.
    */
  var disableDefaultStyle: Boolean = js.native
  /**
    * ID of the tooltip element.
    */
  var id: String = js.native
  /**
    * The maximum recursion depth when printing objects in the tooltip.
    */
  var maxDepth: Double = js.native
  /**
    * X offset.
    */
  var offsetX: Double = js.native
  /**
    * Y offset.
    */
  var offsetY: Double = js.native
  /**
    * HTML sanitizer function that removes dangerous HTML to prevent XSS.
    *
    * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
    */
  @JSName("sanitize")
  var sanitize_Original: js.Function1[/* value */ js.Any, String] = js.native
  /**
    * ID of the tooltip CSS style.
    */
  var styleId: String = js.native
  /**
    * The name of the theme. You can use the CSS class called [THEME]-theme to style the tooltips.
    *
    * There are two predefined themes: "light" (default) and "dark".
    */
  var theme: String = js.native
  /**
    * HTML sanitizer function that removes dangerous HTML to prevent XSS.
    *
    * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
    */
  def sanitize(value: js.Any): String = js.native
}

