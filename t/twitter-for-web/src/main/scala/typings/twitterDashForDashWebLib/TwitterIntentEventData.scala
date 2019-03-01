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

object TwitterIntentEventData {
  @scala.inline
  def apply(
    screen_name: java.lang.String = null,
    source_tweet_id: java.lang.String = null,
    tweet_id: java.lang.String = null,
    user_id: java.lang.String = null
  ): TwitterIntentEventData = {
    val __obj = js.Dynamic.literal()
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name)
    if (source_tweet_id != null) __obj.updateDynamic("source_tweet_id")(source_tweet_id)
    if (tweet_id != null) __obj.updateDynamic("tweet_id")(tweet_id)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[TwitterIntentEventData]
  }
}

