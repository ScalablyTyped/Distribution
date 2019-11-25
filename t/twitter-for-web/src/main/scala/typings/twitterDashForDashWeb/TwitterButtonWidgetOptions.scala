package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.large
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.left
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.medium
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for button widgets.
  */
trait TwitterButtonWidgetOptions extends TwitterWidgetOptions {
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[left | right] = js.undefined
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.undefined
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.undefined
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.undefined
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.undefined
}

object TwitterButtonWidgetOptions {
  @scala.inline
  def apply(
    align: left | right = null,
    count: String = null,
    counturl: String = null,
    dnt: js.UndefOr[Boolean] = js.undefined,
    hashtags: String = null,
    lang: String = null,
    related: String = null,
    size: medium | large = null,
    text: String = null,
    via: String = null
  ): TwitterButtonWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (counturl != null) __obj.updateDynamic("counturl")(counturl.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterButtonWidgetOptions]
  }
}

