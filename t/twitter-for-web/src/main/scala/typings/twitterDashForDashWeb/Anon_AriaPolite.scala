package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.assertive
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.polite
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.rude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaPolite extends js.Object {
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[polite | assertive | rude] = js.undefined
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[String] = js.undefined
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[Boolean] = js.undefined
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[Double] = js.undefined
}

object Anon_AriaPolite {
  @scala.inline
  def apply(
    ariaPolite: polite | assertive | rude = null,
    borderColor: String = null,
    chrome: String = null,
    height: Int | Double = null,
    showReplies: js.UndefOr[Boolean] = js.undefined,
    tweetLimit: Int | Double = null
  ): Anon_AriaPolite = {
    val __obj = js.Dynamic.literal()
    if (ariaPolite != null) __obj.updateDynamic("ariaPolite")(ariaPolite.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(showReplies)) __obj.updateDynamic("showReplies")(showReplies.asInstanceOf[js.Any])
    if (tweetLimit != null) __obj.updateDynamic("tweetLimit")(tweetLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AriaPolite]
  }
}

