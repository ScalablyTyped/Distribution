package typings
package twitterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The interface for additional options for embedded Tweets.
 */

trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  /**
       * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
       */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
       */
  var cards: js.UndefOr[java.lang.String] = js.undefined
  /**
       * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
       */
  var conversation: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Adjust the color of links inside the widget.
       */
  var linkColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Toggle the default colorscheme of the widget.
       */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Fix the width of the embedded widget.
       */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

