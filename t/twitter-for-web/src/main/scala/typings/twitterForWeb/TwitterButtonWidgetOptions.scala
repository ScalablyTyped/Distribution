package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.large
import typings.twitterForWeb.twitterForWebStrings.left
import typings.twitterForWeb.twitterForWebStrings.medium
import typings.twitterForWeb.twitterForWebStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for button widgets.
  */
@js.native
trait TwitterButtonWidgetOptions extends TwitterWidgetOptions {
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[left | right] = js.native
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.native
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.native
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.native
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.native
}

object TwitterButtonWidgetOptions {
  @scala.inline
  def apply(): TwitterButtonWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterButtonWidgetOptions]
  }
  @scala.inline
  implicit class TwitterButtonWidgetOptionsOps[Self <: TwitterButtonWidgetOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCounturl(value: String): Self = this.set("counturl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounturl: Self = this.set("counturl", js.undefined)
    @scala.inline
    def setSize(value: medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

