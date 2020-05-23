package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.all
import typings.twitterForWeb.twitterForWebStrings.assertive
import typings.twitterForWeb.twitterForWebStrings.auto
import typings.twitterForWeb.twitterForWebStrings.dark
import typings.twitterForWeb.twitterForWebStrings.hidden
import typings.twitterForWeb.twitterForWebStrings.large
import typings.twitterForWeb.twitterForWebStrings.left
import typings.twitterForWeb.twitterForWebStrings.light
import typings.twitterForWeb.twitterForWebStrings.medium
import typings.twitterForWeb.twitterForWebStrings.none
import typings.twitterForWeb.twitterForWebStrings.polite
import typings.twitterForWeb.twitterForWebStrings.right
import typings.twitterForWeb.twitterForWebStrings.rude
import typings.twitterForWeb.twitterForWebStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Timelines.
  */
/* Inlined twitter-for-web.TwitterTimelineWidgetBaseOptions & {  ariaPolite ? :'polite' | 'assertive' | 'rude',   height ? :number,   borderColor ? :string,   chrome ? :string,   tweetLimit ? :number,   showReplies ? :boolean} */
trait TwitterTimelineWidgetOptions extends js.Object {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[String with (left | right)] = js.undefined
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[polite | assertive | rude] = js.undefined
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.undefined
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[String] = js.undefined
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.undefined
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.undefined
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.undefined
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.undefined
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.undefined
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.undefined
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[Boolean] = js.undefined
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.undefined
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.undefined
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[Double] = js.undefined
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.undefined
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.undefined
}

object TwitterTimelineWidgetOptions {
  @scala.inline
  def apply(
    align: String with (left | right) = null,
    ariaPolite: polite | assertive | rude = null,
    borderColor: String = null,
    cards: hidden | visible = null,
    chrome: String = null,
    conversation: none | all = null,
    count: String = null,
    counturl: String = null,
    dnt: js.UndefOr[Boolean] = js.undefined,
    hashtags: String = null,
    height: js.UndefOr[Double] = js.undefined,
    lang: String = null,
    linkColor: String = null,
    related: String = null,
    showReplies: js.UndefOr[Boolean] = js.undefined,
    size: medium | large = null,
    text: String = null,
    theme: dark | light = null,
    tweetLimit: js.UndefOr[Double] = js.undefined,
    via: String = null,
    width: Double | auto = null
  ): TwitterTimelineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (ariaPolite != null) __obj.updateDynamic("ariaPolite")(ariaPolite.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (conversation != null) __obj.updateDynamic("conversation")(conversation.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (counturl != null) __obj.updateDynamic("counturl")(counturl.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.get.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (linkColor != null) __obj.updateDynamic("linkColor")(linkColor.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (!js.isUndefined(showReplies)) __obj.updateDynamic("showReplies")(showReplies.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(tweetLimit)) __obj.updateDynamic("tweetLimit")(tweetLimit.get.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetOptions]
  }
}

