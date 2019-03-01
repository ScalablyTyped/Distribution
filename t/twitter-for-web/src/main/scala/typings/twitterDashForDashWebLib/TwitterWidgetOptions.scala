package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for all widgets.
  */
trait TwitterWidgetOptions extends js.Object {
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[java.lang.String] = js.undefined
}

object TwitterWidgetOptions {
  @scala.inline
  def apply(
    dnt: js.UndefOr[scala.Boolean] = js.undefined,
    hashtags: java.lang.String = null,
    lang: java.lang.String = null,
    related: java.lang.String = null,
    via: java.lang.String = null
  ): TwitterWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt)
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (related != null) __obj.updateDynamic("related")(related)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[TwitterWidgetOptions]
  }
}

