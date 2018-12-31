package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a data relevants to the Web Intent just actioned.
  */
trait TwitterIntentEventData extends js.Object {
  /**
    * The screen_name of a user;
    */
  var screen_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a source Tweet.
    */
  var source_tweet_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a Tweet.
    */
  var tweet_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a user.
    */
  var user_id: js.UndefOr[java.lang.String] = js.undefined
}

