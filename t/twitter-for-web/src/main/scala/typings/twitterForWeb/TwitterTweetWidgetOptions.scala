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
@js.native
trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.native
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.native
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.native
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.native
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.native
}

object TwitterTweetWidgetOptions {
  @scala.inline
  def apply(): TwitterTweetWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTweetWidgetOptions]
  }
  @scala.inline
  implicit class TwitterTweetWidgetOptionsOps[Self <: TwitterTweetWidgetOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCards(value: hidden | visible): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    @scala.inline
    def setConversation(value: none | all): Self = this.set("conversation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversation: Self = this.set("conversation", js.undefined)
    @scala.inline
    def setLinkColor(value: String): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    @scala.inline
    def setTheme(value: dark | light): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: Double | auto): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

