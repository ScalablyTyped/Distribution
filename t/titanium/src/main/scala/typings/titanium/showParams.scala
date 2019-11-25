package typings.titanium

import typings.titanium.Titanium.UI.View
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
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var buttonNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * String to be used as a message for the dialog.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var options: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * Positions the arrow of the option dialog relative to the attached view's dimensions.
  	 */
  var rect: js.UndefOr[Dimension] = js.undefined
  /**
  	 * String to be used as title for the dialog.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * View to which to attach the dialog.
  	 */
  var view: js.UndefOr[View] = js.undefined
}

object showParams {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    buttonNames: js.Array[String] = null,
    message: String = null,
    options: js.Array[String] = null,
    rect: Dimension = null,
    title: String = null,
    view: View = null
  ): showParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (buttonNames != null) __obj.updateDynamic("buttonNames")(buttonNames.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[showParams]
  }
}

