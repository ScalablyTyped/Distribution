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
/* Inlined twitter-for-web.TwitterTimelineWidgetBaseOptions & {  ariaPolite :'polite' | 'assertive' | 'rude' | undefined,   height :number | undefined,   borderColor :string | undefined,   chrome :string | undefined,   tweetLimit :number | undefined,   showReplies :boolean | undefined} */
@js.native
trait TwitterTimelineWidgetOptions extends js.Object {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[String] with (js.UndefOr[left | right]) = js.native
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[polite | assertive | rude] = js.native
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.native
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[String] = js.native
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.native
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.native
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.native
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.native
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.native
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.native
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.native
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[Boolean] = js.native
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.native
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.native
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[Double] = js.native
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.native
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.native
}

object TwitterTimelineWidgetOptions {
  @scala.inline
  def apply(align: js.UndefOr[String] with (js.UndefOr[left | right])): TwitterTimelineWidgetOptions = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetOptions]
  }
  @scala.inline
  implicit class TwitterTimelineWidgetOptionsOps[Self <: TwitterTimelineWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: js.UndefOr[String] with (js.UndefOr[left | right])): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaPolite(value: polite | assertive | rude): Self = this.set("ariaPolite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaPolite: Self = this.set("ariaPolite", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setCards(value: hidden | visible): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    @scala.inline
    def setChrome(value: String): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setConversation(value: none | all): Self = this.set("conversation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversation: Self = this.set("conversation", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCounturl(value: String): Self = this.set("counturl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounturl: Self = this.set("counturl", js.undefined)
    @scala.inline
    def setDnt(value: Boolean): Self = this.set("dnt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnt: Self = this.set("dnt", js.undefined)
    @scala.inline
    def setHashtags(value: String): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtags: Self = this.set("hashtags", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLinkColor(value: String): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    @scala.inline
    def setRelated(value: String): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setShowReplies(value: Boolean): Self = this.set("showReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReplies: Self = this.set("showReplies", js.undefined)
    @scala.inline
    def setSize(value: medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: dark | light): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTweetLimit(value: Double): Self = this.set("tweetLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTweetLimit: Self = this.set("tweetLimit", js.undefined)
    @scala.inline
    def setVia(value: String): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
    @scala.inline
    def setWidth(value: Double | auto): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

