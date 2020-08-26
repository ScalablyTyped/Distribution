package typings.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for all widgets.
  */
@js.native
trait TwitterWidgetOptions extends js.Object {
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.native
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.native
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.native
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.native
}

object TwitterWidgetOptions {
  @scala.inline
  def apply(): TwitterWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterWidgetOptions]
  }
  @scala.inline
  implicit class TwitterWidgetOptionsOps[Self <: TwitterWidgetOptions] (val x: Self) extends AnyVal {
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
    def setDnt(value: Boolean): Self = this.set("dnt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnt: Self = this.set("dnt", js.undefined)
    @scala.inline
    def setHashtags(value: String): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtags: Self = this.set("hashtags", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setRelated(value: String): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setVia(value: String): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
  }
  
}

