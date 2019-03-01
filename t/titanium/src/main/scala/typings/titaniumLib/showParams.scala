package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.show> method.
  */
trait showParams extends js.Object {
  /**
  	 * Determines whether to animate the dialog as it is shown.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var buttonNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * String to be used as a message for the dialog.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * Positions the arrow of the option dialog relative to the attached view's dimensions.
  	 */
  var rect: js.UndefOr[Dimension] = js.undefined
  /**
  	 * String to be used as title for the dialog.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * View to which to attach the dialog.
  	 */
  var view: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
}

object showParams {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    buttonNames: js.Array[java.lang.String] = null,
    message: java.lang.String = null,
    options: js.Array[java.lang.String] = null,
    rect: Dimension = null,
    title: java.lang.String = null,
    view: titaniumLib.TitaniumNs.UINs.View = null
  ): showParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (buttonNames != null) __obj.updateDynamic("buttonNames")(buttonNames)
    if (message != null) __obj.updateDynamic("message")(message)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rect != null) __obj.updateDynamic("rect")(rect)
    if (title != null) __obj.updateDynamic("title")(title)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[showParams]
  }
}

