package typings
package twitterDashForDashWebLib

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
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * medium or large
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TwitterButtonWidgetOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    count: java.lang.String = null,
    counturl: java.lang.String = null,
    dnt: js.UndefOr[scala.Boolean] = js.undefined,
    hashtags: java.lang.String = null,
    lang: java.lang.String = null,
    related: java.lang.String = null,
    size: java.lang.String = null,
    text: java.lang.String = null,
    via: java.lang.String = null
  ): TwitterButtonWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (count != null) __obj.updateDynamic("count")(count)
    if (counturl != null) __obj.updateDynamic("counturl")(counturl)
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt)
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (related != null) __obj.updateDynamic("related")(related)
    if (size != null) __obj.updateDynamic("size")(size)
    if (text != null) __obj.updateDynamic("text")(text)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[TwitterButtonWidgetOptions]
  }
}

