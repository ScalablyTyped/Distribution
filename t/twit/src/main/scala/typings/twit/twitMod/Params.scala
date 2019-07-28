package typings.twit.twitMod

import typings.node.Buffer
import typings.twit.Anon_Text
import typings.twit.twitMod.TwitterNs.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var alt_text: js.UndefOr[Anon_Text] = js.undefined
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
  // search/tweets
  var q: js.UndefOr[String] = js.undefined
  var result_type: js.UndefOr[ResultType] = js.undefined
  var results_per_page: js.UndefOr[Double] = js.undefined
  var screen_name: js.UndefOr[String] = js.undefined
  var since_id: js.UndefOr[String] = js.undefined
  var skip_status: js.UndefOr[Boolean] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var stringify_ids: js.UndefOr[Boolean] = js.undefined
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
    alt_text: Anon_Text = null,
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
    q: String = null,
    result_type: ResultType = null,
    results_per_page: Int | Double = null,
    screen_name: String = null,
    since_id: String = null,
    skip_status: js.UndefOr[Boolean] = js.undefined,
    slug: String = null,
    status: String = null,
    stringify_ids: js.UndefOr[Boolean] = js.undefined,
    track: String | js.Array[String] = null,
    trim_user: js.UndefOr[Boolean] = js.undefined,
    tweet_mode: String = null,
    until: String = null,
    url: String = null,
    user_id: Double | String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (alt_text != null) __obj.updateDynamic("alt_text")(alt_text)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_replies)) __obj.updateDynamic("exclude_replies")(exclude_replies)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (geocode != null) __obj.updateDynamic("geocode")(geocode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (in_reply_to_status_id != null) __obj.updateDynamic("in_reply_to_status_id")(in_reply_to_status_id.asInstanceOf[js.Any])
    if (!js.isUndefined(include_email)) __obj.updateDynamic("include_email")(include_email)
    if (!js.isUndefined(include_entities)) __obj.updateDynamic("include_entities")(include_entities)
    if (!js.isUndefined(include_rts)) __obj.updateDynamic("include_rts")(include_rts)
    if (!js.isUndefined(include_user_entities)) __obj.updateDynamic("include_user_entities")(include_user_entities)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    if (max_id != null) __obj.updateDynamic("max_id")(max_id)
    if (media_data != null) __obj.updateDynamic("media_data")(media_data.asInstanceOf[js.Any])
    if (media_id != null) __obj.updateDynamic("media_id")(media_id)
    if (media_ids != null) __obj.updateDynamic("media_ids")(media_ids)
    if (owner_screen_name != null) __obj.updateDynamic("owner_screen_name")(owner_screen_name)
    if (q != null) __obj.updateDynamic("q")(q)
    if (result_type != null) __obj.updateDynamic("result_type")(result_type)
    if (results_per_page != null) __obj.updateDynamic("results_per_page")(results_per_page.asInstanceOf[js.Any])
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name)
    if (since_id != null) __obj.updateDynamic("since_id")(since_id)
    if (!js.isUndefined(skip_status)) __obj.updateDynamic("skip_status")(skip_status)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(stringify_ids)) __obj.updateDynamic("stringify_ids")(stringify_ids)
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (!js.isUndefined(trim_user)) __obj.updateDynamic("trim_user")(trim_user)
    if (tweet_mode != null) __obj.updateDynamic("tweet_mode")(tweet_mode)
    if (until != null) __obj.updateDynamic("until")(until)
    if (url != null) __obj.updateDynamic("url")(url)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

