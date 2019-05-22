package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaPolite extends js.Object {
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[
    twitterDashForDashWebLib.twitterDashForDashWebLibStrings.polite | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.assertive | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.rude
  ] = js.undefined
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AriaPolite {
  @scala.inline
  def apply(
    ariaPolite: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.polite | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.assertive | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.rude = null,
    borderColor: java.lang.String = null,
    chrome: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    showReplies: js.UndefOr[scala.Boolean] = js.undefined,
    tweetLimit: scala.Int | scala.Double = null
  ): Anon_AriaPolite = {
    val __obj = js.Dynamic.literal()
    if (ariaPolite != null) __obj.updateDynamic("ariaPolite")(ariaPolite.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(showReplies)) __obj.updateDynamic("showReplies")(showReplies)
    if (tweetLimit != null) __obj.updateDynamic("tweetLimit")(tweetLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AriaPolite]
  }
}

