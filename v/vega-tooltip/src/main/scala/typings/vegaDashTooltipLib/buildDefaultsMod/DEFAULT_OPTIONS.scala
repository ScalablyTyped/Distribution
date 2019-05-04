package typings
package vegaDashTooltipLib.buildDefaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/defaults", "DEFAULT_OPTIONS")
@js.native
object DEFAULT_OPTIONS extends js.Object {
  /**
    * Do not use the default styles provided by Vega Tooltip. If you enable this option, you need to use your own styles. It is not necessary to disable the default style when using a custom theme.
    */
  var disableDefaultStyle: scala.Boolean = js.native
  /**
    * ID of the tooltip element.
    */
  var id: java.lang.String = js.native
  /**
    * The maximum recursion depth when printing objects in the tooltip.
    */
  var maxDepth: scala.Double = js.native
  /**
    * X offset.
    */
  var offsetX: scala.Double = js.native
  /**
    * Y offset.
    */
  var offsetY: scala.Double = js.native
  /**
    * HTML sanitizer function that removes dangerous HTML to prevent XSS.
    *
    * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
    */
  @JSName("sanitize")
  var sanitize_Original: js.Function1[/* value */ js.Any, java.lang.String] = js.native
  /**
    * ID of the tooltip CSS style.
    */
  var styleId: java.lang.String = js.native
  /**
    * The name of the theme. You can use the CSS class called [THEME]-theme to style the tooltips.
    *
    * There are two predefined themes: "light" (default) and "dark".
    */
  var theme: java.lang.String = js.native
  /**
    * HTML sanitizer function that removes dangerous HTML to prevent XSS.
    *
    * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
    */
  def sanitize(value: js.Any): java.lang.String = js.native
}

