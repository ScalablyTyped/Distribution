package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptsOptions extends js.Object {
  /**
    * text to display in the native prompt body asking user whether to remember their choice.
    * Defaults to "Use the same app for navigating next time?" if not specified.
    */
  var bodyText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a function to pass the user's decision whether to remember their choice of app.
    * This will be passed a single boolean value indicating the user's decision.
    * @param rememberChoice
    */
  var callback: js.UndefOr[js.Function1[/* rememberChoice */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * text to display in the native prompt header asking user whether to remember their choice.
    * Defaults to "Remember your choice?" if not specified.
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * text to display for the No button.
    * Defaults to "No" if not specified.
    */
  var noButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * text to display for the Yes button.
    * Defaults to "Yes" if not specified.
    */
  var yesButtonText: js.UndefOr[java.lang.String] = js.undefined
}

object PromptsOptions {
  @scala.inline
  def apply(
    bodyText: java.lang.String = null,
    callback: js.Function1[/* rememberChoice */ scala.Boolean, scala.Unit] = null,
    headerText: java.lang.String = null,
    noButtonText: java.lang.String = null,
    yesButtonText: java.lang.String = null
  ): PromptsOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyText != null) __obj.updateDynamic("bodyText")(bodyText)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (noButtonText != null) __obj.updateDynamic("noButtonText")(noButtonText)
    if (yesButtonText != null) __obj.updateDynamic("yesButtonText")(yesButtonText)
    __obj.asInstanceOf[PromptsOptions]
  }
}

