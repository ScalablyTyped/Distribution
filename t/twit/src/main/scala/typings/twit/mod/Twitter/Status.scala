package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.twit.anon.Id
import typings.twit.twitStrings.low
import typings.twit.twitStrings.medium
import typings.twit.twitStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var annotations: js.UndefOr[js.Object] = js.undefined
  var contributors: js.UndefOr[js.Array[Contributors]] = js.undefined
  var coordinates: js.UndefOr[Point] = js.undefined
  var created_at: String
  var current_user_retweet: js.UndefOr[Id] = js.undefined
  var display_text_range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var entities: Entities
  var favorite_count: js.UndefOr[Double] = js.undefined
  var favorited: js.UndefOr[Boolean] = js.undefined
  var filter_level: none | low | medium
  var full_text: js.UndefOr[String] = js.undefined
  var geo: js.UndefOr[js.Object] = js.undefined
  var id: Double
  var id_str: String
  var in_reply_to_screen_name: js.UndefOr[String] = js.undefined
  var in_reply_to_status_id: js.UndefOr[Double] = js.undefined
  var in_reply_to_status_id_str: js.UndefOr[String] = js.undefined
  var in_reply_to_user_id: js.UndefOr[Double] = js.undefined
  var in_reply_to_user_id_str: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var place: js.UndefOr[Place] = js.undefined
  var possibly_sensitive: js.UndefOr[Boolean] = js.undefined
  var quoted_status: js.UndefOr[Status] = js.undefined
  var quoted_status_id: js.UndefOr[Double] = js.undefined
  var quoted_status_id_str: js.UndefOr[String] = js.undefined
  var retweet_count: Double
  var retweeted: Boolean
  var retweeted_status: js.UndefOr[Status] = js.undefined
  var scopes: js.UndefOr[js.Object] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var truncated: Boolean
  var user: User
  var withheld_copyright: js.UndefOr[Boolean] = js.undefined
  var withheld_in_countries: js.UndefOr[js.Array[String]] = js.undefined
  var withheld_scope: js.UndefOr[String] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    created_at: String,
    entities: Entities,
    filter_level: none | low | medium,
    id: Double,
    id_str: String,
    retweet_count: Double,
    retweeted: Boolean,
    truncated: Boolean,
    user: User,
    annotations: js.Object = null,
    contributors: js.Array[Contributors] = null,
    coordinates: Point = null,
    current_user_retweet: Id = null,
    display_text_range: js.Tuple2[Double, Double] = null,
    favorite_count: js.UndefOr[Double] = js.undefined,
    favorited: js.UndefOr[Boolean] = js.undefined,
    full_text: String = null,
    geo: js.Object = null,
    in_reply_to_screen_name: String = null,
    in_reply_to_status_id: js.UndefOr[Double] = js.undefined,
    in_reply_to_status_id_str: String = null,
    in_reply_to_user_id: js.UndefOr[Double] = js.undefined,
    in_reply_to_user_id_str: String = null,
    lang: String = null,
    place: Place = null,
    possibly_sensitive: js.UndefOr[Boolean] = js.undefined,
    quoted_status: Status = null,
    quoted_status_id: js.UndefOr[Double] = js.undefined,
    quoted_status_id_str: String = null,
    retweeted_status: Status = null,
    scopes: js.Object = null,
    source: String = null,
    text: String = null,
    withheld_copyright: js.UndefOr[Boolean] = js.undefined,
    withheld_in_countries: js.Array[String] = null,
    withheld_scope: String = null
  ): Status = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], filter_level = filter_level.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], retweet_count = retweet_count.asInstanceOf[js.Any], retweeted = retweeted.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (current_user_retweet != null) __obj.updateDynamic("current_user_retweet")(current_user_retweet.asInstanceOf[js.Any])
    if (display_text_range != null) __obj.updateDynamic("display_text_range")(display_text_range.asInstanceOf[js.Any])
    if (!js.isUndefined(favorite_count)) __obj.updateDynamic("favorite_count")(favorite_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(favorited)) __obj.updateDynamic("favorited")(favorited.get.asInstanceOf[js.Any])
    if (full_text != null) __obj.updateDynamic("full_text")(full_text.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (in_reply_to_screen_name != null) __obj.updateDynamic("in_reply_to_screen_name")(in_reply_to_screen_name.asInstanceOf[js.Any])
    if (!js.isUndefined(in_reply_to_status_id)) __obj.updateDynamic("in_reply_to_status_id")(in_reply_to_status_id.get.asInstanceOf[js.Any])
    if (in_reply_to_status_id_str != null) __obj.updateDynamic("in_reply_to_status_id_str")(in_reply_to_status_id_str.asInstanceOf[js.Any])
    if (!js.isUndefined(in_reply_to_user_id)) __obj.updateDynamic("in_reply_to_user_id")(in_reply_to_user_id.get.asInstanceOf[js.Any])
    if (in_reply_to_user_id_str != null) __obj.updateDynamic("in_reply_to_user_id_str")(in_reply_to_user_id_str.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (!js.isUndefined(possibly_sensitive)) __obj.updateDynamic("possibly_sensitive")(possibly_sensitive.get.asInstanceOf[js.Any])
    if (quoted_status != null) __obj.updateDynamic("quoted_status")(quoted_status.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted_status_id)) __obj.updateDynamic("quoted_status_id")(quoted_status_id.get.asInstanceOf[js.Any])
    if (quoted_status_id_str != null) __obj.updateDynamic("quoted_status_id_str")(quoted_status_id_str.asInstanceOf[js.Any])
    if (retweeted_status != null) __obj.updateDynamic("retweeted_status")(retweeted_status.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(withheld_copyright)) __obj.updateDynamic("withheld_copyright")(withheld_copyright.get.asInstanceOf[js.Any])
    if (withheld_in_countries != null) __obj.updateDynamic("withheld_in_countries")(withheld_in_countries.asInstanceOf[js.Any])
    if (withheld_scope != null) __obj.updateDynamic("withheld_scope")(withheld_scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

