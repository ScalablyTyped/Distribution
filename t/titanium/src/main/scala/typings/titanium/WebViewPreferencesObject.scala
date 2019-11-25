package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the <Titanium.UI.iOS.WebViewConfiguration.preferences> method.
  */
trait WebViewPreferencesObject extends js.Object {
  /**
  	 * A Boolean value indicating whether JavaScript can open windows without user interaction.
  	 */
  var javaScriptCanOpenWindowsAutomatically: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A Boolean value indicating whether JavaScript is enabled.
  	 */
  var javaScriptEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The minimum font size in points.
  	 */
  var minimumFontSize: js.UndefOr[Double] = js.undefined
}

object WebViewPreferencesObject {
  @scala.inline
  def apply(
    javaScriptCanOpenWindowsAutomatically: js.UndefOr[Boolean] = js.undefined,
    javaScriptEnabled: js.UndefOr[Boolean] = js.undefined,
    minimumFontSize: Int | Double = null
  ): WebViewPreferencesObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(javaScriptCanOpenWindowsAutomatically)) __obj.updateDynamic("javaScriptCanOpenWindowsAutomatically")(javaScriptCanOpenWindowsAutomatically.asInstanceOf[js.Any])
    if (!js.isUndefined(javaScriptEnabled)) __obj.updateDynamic("javaScriptEnabled")(javaScriptEnabled.asInstanceOf[js.Any])
    if (minimumFontSize != null) __obj.updateDynamic("minimumFontSize")(minimumFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewPreferencesObject]
  }
}

