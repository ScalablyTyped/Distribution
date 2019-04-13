package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var alt_text: js.UndefOr[twitLib.Anon_Text] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var cursor: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var exclude_replies: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var geocode: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var include_email: js.UndefOr[scala.Boolean] = js.undefined
  var include_entities: js.UndefOr[scala.Boolean] = js.undefined
  var include_rts: js.UndefOr[scala.Boolean] = js.undefined
  var include_user_entities: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var lat: js.UndefOr[scala.Double] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var long: js.UndefOr[scala.Double] = js.undefined
  var max_id: js.UndefOr[java.lang.String] = js.undefined
  var media_data: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var media_id: js.UndefOr[java.lang.String] = js.undefined
  var media_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owner_screen_name: js.UndefOr[java.lang.String] = js.undefined
  // search/tweets
  var q: js.UndefOr[java.lang.String] = js.undefined
  var result_type: js.UndefOr[twitLib.twitMod.TwitterNs.ResultType] = js.undefined
  var results_per_page: js.UndefOr[scala.Double] = js.undefined
  var screen_name: js.UndefOr[java.lang.String] = js.undefined
  var since_id: js.UndefOr[java.lang.String] = js.undefined
  var skip_status: js.UndefOr[scala.Boolean] = js.undefined
  var slug: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var stringify_ids: js.UndefOr[scala.Boolean] = js.undefined
  // Other params from various endpoints
  var track: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var trim_user: js.UndefOr[scala.Boolean] = js.undefined
  var tweet_mode: js.UndefOr[java.lang.String] = js.undefined
  var until: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var user_id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    alt_text: twitLib.Anon_Text = null,
    count: scala.Int | scala.Double = null,
    cursor: scala.Double | java.lang.String = null,
    exclude_replies: js.UndefOr[scala.Boolean] = js.undefined,
    follow: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    geocode: java.lang.String = null,
    id: java.lang.String = null,
    include_email: js.UndefOr[scala.Boolean] = js.undefined,
    include_entities: js.UndefOr[scala.Boolean] = js.undefined,
    include_rts: js.UndefOr[scala.Boolean] = js.undefined,
    include_user_entities: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    lat: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    long: scala.Int | scala.Double = null,
    max_id: java.lang.String = null,
    media_data: nodeLib.Buffer | java.lang.String = null,
    media_id: java.lang.String = null,
    media_ids: js.Array[java.lang.String] = null,
    owner_screen_name: java.lang.String = null,
    q: java.lang.String = null,
    result_type: twitLib.twitMod.TwitterNs.ResultType = null,
    results_per_page: scala.Int | scala.Double = null,
    screen_name: java.lang.String = null,
    since_id: java.lang.String = null,
    skip_status: js.UndefOr[scala.Boolean] = js.undefined,
    slug: java.lang.String = null,
    status: java.lang.String = null,
    stringify_ids: js.UndefOr[scala.Boolean] = js.undefined,
    track: java.lang.String | js.Array[java.lang.String] = null,
    trim_user: js.UndefOr[scala.Boolean] = js.undefined,
    tweet_mode: java.lang.String = null,
    until: java.lang.String = null,
    url: java.lang.String = null,
    user_id: scala.Double | java.lang.String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (alt_text != null) __obj.updateDynamic("alt_text")(alt_text)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_replies)) __obj.updateDynamic("exclude_replies")(exclude_replies)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (geocode != null) __obj.updateDynamic("geocode")(geocode)
    if (id != null) __obj.updateDynamic("id")(id)
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

