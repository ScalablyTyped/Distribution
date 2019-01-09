package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var annotations: js.UndefOr[js.Object] = js.undefined
  var contributors: js.UndefOr[js.Array[Contributors]] = js.undefined
  var coordinates: js.UndefOr[geojsonLib.geojsonMod.Point] = js.undefined
  var created_at: java.lang.String
  var current_user_retweet: js.UndefOr[twitLib.Anon_Id] = js.undefined
  var display_text_range: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var entities: Entities
  var favorite_count: js.UndefOr[scala.Double] = js.undefined
  var favorited: js.UndefOr[scala.Boolean] = js.undefined
  var filter_level: twitLib.twitLibStrings.none | twitLib.twitLibStrings.low | twitLib.twitLibStrings.medium
  var full_text: js.UndefOr[java.lang.String] = js.undefined
  var geo: js.UndefOr[js.Object] = js.undefined
  var id: scala.Double
  var id_str: java.lang.String
  var in_reply_to_screen_name: js.UndefOr[java.lang.String] = js.undefined
  var in_reply_to_status_id: js.UndefOr[scala.Double] = js.undefined
  var in_reply_to_status_id_str: js.UndefOr[java.lang.String] = js.undefined
  var in_reply_to_user_id: js.UndefOr[scala.Double] = js.undefined
  var in_reply_to_user_id_str: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var place: js.UndefOr[Place] = js.undefined
  var possibly_sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var quoted_status: js.UndefOr[Status] = js.undefined
  var quoted_status_id: js.UndefOr[scala.Double] = js.undefined
  var quoted_status_id_str: js.UndefOr[java.lang.String] = js.undefined
  var retweet_count: scala.Double
  var retweeted: scala.Boolean
  var retweeted_status: js.UndefOr[Status] = js.undefined
  var scopes: js.UndefOr[js.Object] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var truncated: scala.Boolean
  var user: User
  var withheld_copyright: js.UndefOr[scala.Boolean] = js.undefined
  var withheld_in_countries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var withheld_scope: js.UndefOr[java.lang.String] = js.undefined
}

