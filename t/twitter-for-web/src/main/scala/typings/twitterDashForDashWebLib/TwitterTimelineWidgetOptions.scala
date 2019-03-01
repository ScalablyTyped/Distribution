package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Timelines.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twitterDashForDashWebLib.TwitterTweetWidgetOptions because var conflicts: align, dnt, hashtags, lang, related, via. Inlined conversation, cards, width, linkColor, theme */ trait TwitterTimelineWidgetOptions extends TwitterButtonWidgetOptions {
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with favourite Tweets from this user.
    */
  var favoritesScreenName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with favourite Tweets from this user.
    */
  var favoritesUserId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with Tweets from this list. Must be used in combination with listOwnerId or listOwnerScreenName.
    */
  var listId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with Tweets from a list owned by this user. Must be used in combination with listId or listSlug.
    */
  var listOwnerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with Tweets from a list owned by this user. Must be used in combination with listId or listSlug.
    */
  var listOwnerScreenName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with Tweets from this list. Must be used in combination with listOwnerId or listOwnerScreenName.
    */
  var listSlug: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the timeline source with this user’s Tweets.
    */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When overriding a user timeline, include Tweets that are in reply to to other users.
    */
  var showReplies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Override the timeline source with this user’s Tweets.
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object TwitterTimelineWidgetOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    ariaPolite: java.lang.String = null,
    borderColor: java.lang.String = null,
    cards: java.lang.String = null,
    chrome: java.lang.String = null,
    conversation: java.lang.String = null,
    count: java.lang.String = null,
    counturl: java.lang.String = null,
    dnt: js.UndefOr[scala.Boolean] = js.undefined,
    favoritesScreenName: java.lang.String = null,
    favoritesUserId: java.lang.String = null,
    hashtags: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    lang: java.lang.String = null,
    linkColor: java.lang.String = null,
    listId: java.lang.String = null,
    listOwnerId: java.lang.String = null,
    listOwnerScreenName: java.lang.String = null,
    listSlug: java.lang.String = null,
    related: java.lang.String = null,
    screenName: java.lang.String = null,
    showReplies: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    text: java.lang.String = null,
    theme: java.lang.String = null,
    tweetLimit: scala.Int | scala.Double = null,
    userId: java.lang.String = null,
    via: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): TwitterTimelineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (ariaPolite != null) __obj.updateDynamic("ariaPolite")(ariaPolite)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (cards != null) __obj.updateDynamic("cards")(cards)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (conversation != null) __obj.updateDynamic("conversation")(conversation)
    if (count != null) __obj.updateDynamic("count")(count)
    if (counturl != null) __obj.updateDynamic("counturl")(counturl)
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt)
    if (favoritesScreenName != null) __obj.updateDynamic("favoritesScreenName")(favoritesScreenName)
    if (favoritesUserId != null) __obj.updateDynamic("favoritesUserId")(favoritesUserId)
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (linkColor != null) __obj.updateDynamic("linkColor")(linkColor)
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (listOwnerId != null) __obj.updateDynamic("listOwnerId")(listOwnerId)
    if (listOwnerScreenName != null) __obj.updateDynamic("listOwnerScreenName")(listOwnerScreenName)
    if (listSlug != null) __obj.updateDynamic("listSlug")(listSlug)
    if (related != null) __obj.updateDynamic("related")(related)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (!js.isUndefined(showReplies)) __obj.updateDynamic("showReplies")(showReplies)
    if (size != null) __obj.updateDynamic("size")(size)
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tweetLimit != null) __obj.updateDynamic("tweetLimit")(tweetLimit.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (via != null) __obj.updateDynamic("via")(via)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetOptions]
  }
}

