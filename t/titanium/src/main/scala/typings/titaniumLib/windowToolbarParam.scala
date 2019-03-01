package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.setToolbar> method.
  */
trait windowToolbarParam extends js.Object {
  /**
  	 * Defines if the toolbar appearance is animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Background color for the toolbar, as a color name or hex triplet.
  	 */
  var barColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The tintColor to apply to the tool bar.
  	 */
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Defines if the toolbar is translucent.
  	 */
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object windowToolbarParam {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    barColor: java.lang.String = null,
    tintColor: java.lang.String = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): windowToolbarParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (barColor != null) __obj.updateDynamic("barColor")(barColor)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[windowToolbarParam]
  }
}

