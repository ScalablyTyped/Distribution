package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.all
import typings.twitterForWeb.twitterForWebStrings.auto
import typings.twitterForWeb.twitterForWebStrings.dark
import typings.twitterForWeb.twitterForWebStrings.hidden
import typings.twitterForWeb.twitterForWebStrings.light
import typings.twitterForWeb.twitterForWebStrings.none
import typings.twitterForWeb.twitterForWebStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Tweets.
  */
trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  var align: js.UndefOr[String] = js.undefined
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.undefined
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.undefined
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.undefined
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.undefined
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.undefined
}

object TwitterTweetWidgetOptions {
  @scala.inline
  def apply(
    align: String = null,
    cards: hidden | visible = null,
    conversation: none | all = null,
    dnt: js.UndefOr[Boolean] = js.undefined,
    hashtags: String = null,
    lang: String = null,
    linkColor: String = null,
    related: String = null,
    theme: dark | light = null,
    via: String = null,
    width: Double | auto = null
  ): TwitterTweetWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (conversation != null) __obj.updateDynamic("conversation")(conversation.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.get.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (linkColor != null) __obj.updateDynamic("linkColor")(linkColor.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTweetWidgetOptions]
  }
}

