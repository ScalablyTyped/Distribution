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

