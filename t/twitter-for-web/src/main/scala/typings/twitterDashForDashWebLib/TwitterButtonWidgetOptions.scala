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

