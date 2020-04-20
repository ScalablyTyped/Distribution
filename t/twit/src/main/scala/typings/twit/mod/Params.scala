package typings.twit.mod

import typings.node.Buffer
import typings.twit.AnonText
import typings.twit.mod.Twitter.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var alt_text: js.UndefOr[AnonText] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var cursor: js.UndefOr[Double | String] = js.undefined
  var exclude_replies: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  var geocode: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var in_reply_to_status_id: js.UndefOr[Double | String] = js.undefined
  var include_email: js.UndefOr[Boolean] = js.undefined
  var include_entities: js.UndefOr[Boolean] = js.undefined
  var include_rts: js.UndefOr[Boolean] = js.undefined
  var include_user_entities: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lat: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var long: js.UndefOr[Double] = js.undefined
  var max_id: js.UndefOr[String] = js.undefined
  var media_data: js.UndefOr[Buffer | String] = js.undefined
  var media_id: js.UndefOr[String] = js.undefined
  var media_ids: js.UndefOr[js.Array[String]] = js.undefined
  var owner_screen_name: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  // search/tweets
  var q: js.UndefOr[String] = js.undefined
  var result_type: js.UndefOr[ResultType] = js.undefined
  var results_per_page: js.UndefOr[Double] = js.undefined
  var screen_name: js.UndefOr[String] = js.undefined
  var since_id: js.UndefOr[String] = js.undefined
  var skip_status: js.UndefOr[Boolean] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var source_id: js.UndefOr[Double] = js.undefined
  var source_screen_name: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var stringify_ids: js.UndefOr[Boolean] = js.undefined
  var target_id: js.UndefOr[Double] = js.undefined
  var target_screen_name: js.UndefOr[String] = js.undefined
  // Other params from various endpoints
  var track: js.UndefOr[String | js.Array[String]] = js.undefined
  var trim_user: js.UndefOr[Boolean] = js.undefined
  var tweet_mode: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[Double | String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    alt_text: AnonText = null,
    count: Int | Double = null,
    cursor: Double | String = null,
    exclude_replies: js.UndefOr[Boolean] = js.undefined,
    follow: Boolean | String | js.Array[String] = null,
    geocode: String = null,
    id: String = null,
    in_reply_to_status_id: Double | String = null,
    include_email: js.UndefOr[Boolean] = js.undefined,
    include_entities: js.UndefOr[Boolean] = js.undefined,
    include_rts: js.UndefOr[Boolean] = js.undefined,
    include_user_entities: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    lat: Int | Double = null,
    locale: String = null,
    long: Int | Double = null,
    max_id: String = null,
    media_data: Buffer | String = null,
    media_id: String = null,
    media_ids: js.Array[String] = null,
    owner_screen_name: String = null,
    page: Int | Double = null,
    q: String = null,
    result_type: ResultType = null,
    results_per_page: Int | Double = null,
    screen_name: String = null,
    since_id: String = null,
    skip_status: js.UndefOr[Boolean] = js.undefined,
    slug: String = null,
    source_id: Int | Double = null,
    source_screen_name: String = null,
    status: String = null,
    stringify_ids: js.UndefOr[Boolean] = js.undefined,
    target_id: Int | Double = null,
    target_screen_name: String = null,
    track: String | js.Array[String] = null,
    trim_user: js.UndefOr[Boolean] = js.undefined,
    tweet_mode: String = null,
    until: String = null,
    url: String = null,
    user_id: Double | String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (alt_text != null) __obj.updateDynamic("alt_text")(alt_text.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_replies)) __obj.updateDynamic("exclude_replies")(exclude_replies.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (geocode != null) __obj.updateDynamic("geocode")(geocode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (in_reply_to_status_id != null) __obj.updateDynamic("in_reply_to_status_id")(in_reply_to_status_id.asInstanceOf[js.Any])
    if (!js.isUndefined(include_email)) __obj.updateDynamic("include_email")(include_email.asInstanceOf[js.Any])
    if (!js.isUndefined(include_entities)) __obj.updateDynamic("include_entities")(include_entities.asInstanceOf[js.Any])
    if (!js.isUndefined(include_rts)) __obj.updateDynamic("include_rts")(include_rts.asInstanceOf[js.Any])
    if (!js.isUndefined(include_user_entities)) __obj.updateDynamic("include_user_entities")(include_user_entities.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    if (max_id != null) __obj.updateDynamic("max_id")(max_id.asInstanceOf[js.Any])
    if (media_data != null) __obj.updateDynamic("media_data")(media_data.asInstanceOf[js.Any])
    if (media_id != null) __obj.updateDynamic("media_id")(media_id.asInstanceOf[js.Any])
    if (media_ids != null) __obj.updateDynamic("media_ids")(media_ids.asInstanceOf[js.Any])
    if (owner_screen_name != null) __obj.updateDynamic("owner_screen_name")(owner_screen_name.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (result_type != null) __obj.updateDynamic("result_type")(result_type.asInstanceOf[js.Any])
    if (results_per_page != null) __obj.updateDynamic("results_per_page")(results_per_page.asInstanceOf[js.Any])
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_status)) __obj.updateDynamic("skip_status")(skip_status.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (source_id != null) __obj.updateDynamic("source_id")(source_id.asInstanceOf[js.Any])
    if (source_screen_name != null) __obj.updateDynamic("source_screen_name")(source_screen_name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify_ids)) __obj.updateDynamic("stringify_ids")(stringify_ids.asInstanceOf[js.Any])
    if (target_id != null) __obj.updateDynamic("target_id")(target_id.asInstanceOf[js.Any])
    if (target_screen_name != null) __obj.updateDynamic("target_screen_name")(target_screen_name.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (!js.isUndefined(trim_user)) __obj.updateDynamic("trim_user")(trim_user.asInstanceOf[js.Any])
    if (tweet_mode != null) __obj.updateDynamic("tweet_mode")(tweet_mode.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

