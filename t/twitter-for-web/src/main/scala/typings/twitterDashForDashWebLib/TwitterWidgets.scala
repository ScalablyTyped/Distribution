package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for Twitter for Websites widgets.
  */
@js.native
trait TwitterWidgets extends js.Object {
  /**
    * Create a follow button for a user.
    *
    * @param screen_name The screen_name of a user to be followed.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createFollowButton(screen_name: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createFollowButton(screen_name: java.lang.String, target: stdLib.HTMLElement, options: TwitterButtonWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Create a hashtag button for a hashtag.
    *
    * @param hashtag Hashtag to be Tweeted and displayed on the button.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createHashtagButton(hashtag: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createHashtagButton(hashtag: java.lang.String, target: stdLib.HTMLElement, options: TwitterButtonWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Create a mention button for a user.
    *
    * @param screen_name The screen_name of a user to be mentioned.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createMentionButton(screen_name: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createMentionButton(screen_name: java.lang.String, target: stdLib.HTMLElement, options: TwitterButtonWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Create a share button for a URL.
    *
    * @param url The URL to be shared.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createShareButton(url: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createShareButton(url: java.lang.String, target: stdLib.HTMLElement, options: TwitterButtonWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Create a timeline widget.
    *
    * @param widgetId The ID of a timeline widget to be rendered.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createTimeline(widgetId: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createTimeline(widgetId: java.lang.String, target: stdLib.HTMLElement, options: TwitterTimelineWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Create an embedded Tweet for a Tweet.
    *
    * @param tweetId The ID of a Tweet to be rendered.
    * @param target The element in which to render the widget.
    * @param options An object hash of additional options to configure the widget.
    */
  def createTweet(tweetId: java.lang.String, target: stdLib.HTMLElement): js.Promise[stdLib.HTMLElement] = js.native
  def createTweet(tweetId: java.lang.String, target: stdLib.HTMLElement, options: TwitterTweetWidgetOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Initialize Twitter for Websites widgets contained within a page.
    */
  def load(): scala.Unit = js.native
  /**
    * Initialize Twitter for Websites widgets contained within children of the elements.
    */
  def load(elements: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  /**
    * Initialize Twitter for Websites widgets contained within children of the element.
    */
  def load(element: stdLib.HTMLElement): scala.Unit = js.native
}

