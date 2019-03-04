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

object Status {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    entities: Entities,
    filter_level: twitLib.twitLibStrings.none | twitLib.twitLibStrings.low | twitLib.twitLibStrings.medium,
    id: scala.Double,
    id_str: java.lang.String,
    retweet_count: scala.Double,
    retweeted: scala.Boolean,
    truncated: scala.Boolean,
    user: User,
    annotations: js.Object = null,
    contributors: js.Array[Contributors] = null,
    coordinates: geojsonLib.geojsonMod.Point = null,
    current_user_retweet: twitLib.Anon_Id = null,
    display_text_range: js.Tuple2[scala.Double, scala.Double] = null,
    favorite_count: scala.Int | scala.Double = null,
    favorited: js.UndefOr[scala.Boolean] = js.undefined,
    full_text: java.lang.String = null,
    geo: js.Object = null,
    in_reply_to_screen_name: java.lang.String = null,
    in_reply_to_status_id: scala.Int | scala.Double = null,
    in_reply_to_status_id_str: java.lang.String = null,
    in_reply_to_user_id: scala.Int | scala.Double = null,
    in_reply_to_user_id_str: java.lang.String = null,
    lang: java.lang.String = null,
    place: Place = null,
    possibly_sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    quoted_status: Status = null,
    quoted_status_id: scala.Int | scala.Double = null,
    quoted_status_id_str: java.lang.String = null,
    retweeted_status: Status = null,
    scopes: js.Object = null,
    source: java.lang.String = null,
    text: java.lang.String = null,
    withheld_copyright: js.UndefOr[scala.Boolean] = js.undefined,
    withheld_in_countries: js.Array[java.lang.String] = null,
    withheld_scope: java.lang.String = null
  ): Status = {
    val __obj = js.Dynamic.literal(created_at = created_at, entities = entities, filter_level = filter_level.asInstanceOf[js.Any], id = id, id_str = id_str, retweet_count = retweet_count, retweeted = retweeted, truncated = truncated, user = user)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (current_user_retweet != null) __obj.updateDynamic("current_user_retweet")(current_user_retweet)
    if (display_text_range != null) __obj.updateDynamic("display_text_range")(display_text_range)
    if (favorite_count != null) __obj.updateDynamic("favorite_count")(favorite_count.asInstanceOf[js.Any])
    if (!js.isUndefined(favorited)) __obj.updateDynamic("favorited")(favorited)
    if (full_text != null) __obj.updateDynamic("full_text")(full_text)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (in_reply_to_screen_name != null) __obj.updateDynamic("in_reply_to_screen_name")(in_reply_to_screen_name)
    if (in_reply_to_status_id != null) __obj.updateDynamic("in_reply_to_status_id")(in_reply_to_status_id.asInstanceOf[js.Any])
    if (in_reply_to_status_id_str != null) __obj.updateDynamic("in_reply_to_status_id_str")(in_reply_to_status_id_str)
    if (in_reply_to_user_id != null) __obj.updateDynamic("in_reply_to_user_id")(in_reply_to_user_id.asInstanceOf[js.Any])
    if (in_reply_to_user_id_str != null) __obj.updateDynamic("in_reply_to_user_id_str")(in_reply_to_user_id_str)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (place != null) __obj.updateDynamic("place")(place)
    if (!js.isUndefined(possibly_sensitive)) __obj.updateDynamic("possibly_sensitive")(possibly_sensitive)
    if (quoted_status != null) __obj.updateDynamic("quoted_status")(quoted_status)
    if (quoted_status_id != null) __obj.updateDynamic("quoted_status_id")(quoted_status_id.asInstanceOf[js.Any])
    if (quoted_status_id_str != null) __obj.updateDynamic("quoted_status_id_str")(quoted_status_id_str)
    if (retweeted_status != null) __obj.updateDynamic("retweeted_status")(retweeted_status)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (source != null) __obj.updateDynamic("source")(source)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(withheld_copyright)) __obj.updateDynamic("withheld_copyright")(withheld_copyright)
    if (withheld_in_countries != null) __obj.updateDynamic("withheld_in_countries")(withheld_in_countries)
    if (withheld_scope != null) __obj.updateDynamic("withheld_scope")(withheld_scope)
    __obj.asInstanceOf[Status]
  }
}

