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

