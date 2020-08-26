package typings.twit.mod

import typings.node.Buffer
import typings.twit.anon.Text
import typings.twit.mod.Twitter.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var alt_text: js.UndefOr[Text] = js.native
  var count: js.UndefOr[Double] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var exclude_replies: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var geocode: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var in_reply_to_status_id: js.UndefOr[Double | String] = js.native
  var include_email: js.UndefOr[Boolean] = js.native
  var include_entities: js.UndefOr[Boolean] = js.native
  var include_rts: js.UndefOr[Boolean] = js.native
  var include_user_entities: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  var lat: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[String] = js.native
  var long: js.UndefOr[Double] = js.native
  var max_id: js.UndefOr[String] = js.native
  var media_data: js.UndefOr[Buffer | String] = js.native
  var media_id: js.UndefOr[String] = js.native
  var media_ids: js.UndefOr[js.Array[String]] = js.native
  var owner_screen_name: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  // search/tweets
  var q: js.UndefOr[String] = js.native
  var result_type: js.UndefOr[ResultType] = js.native
  var results_per_page: js.UndefOr[Double] = js.native
  var screen_name: js.UndefOr[String] = js.native
  var since_id: js.UndefOr[String] = js.native
  var skip_status: js.UndefOr[Boolean] = js.native
  var slug: js.UndefOr[String] = js.native
  var source_id: js.UndefOr[Double] = js.native
  var source_screen_name: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var stringify_ids: js.UndefOr[Boolean] = js.native
  var target_id: js.UndefOr[Double] = js.native
  var target_screen_name: js.UndefOr[String] = js.native
  // Other params from various endpoints
  var track: js.UndefOr[String | js.Array[String]] = js.native
  var trim_user: js.UndefOr[Boolean] = js.native
  var tweet_mode: js.UndefOr[String] = js.native
  var until: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[Double | String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlt_text(value: Text): Self = this.set("alt_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt_text: Self = this.set("alt_text", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCursor(value: Double | String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setExclude_replies(value: Boolean): Self = this.set("exclude_replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_replies: Self = this.set("exclude_replies", js.undefined)
    @scala.inline
    def setFollowVarargs(value: String*): Self = this.set("follow", js.Array(value :_*))
    @scala.inline
    def setFollow(value: Boolean | String | js.Array[String]): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setGeocode(value: String): Self = this.set("geocode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeocode: Self = this.set("geocode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIn_reply_to_status_id(value: Double | String): Self = this.set("in_reply_to_status_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn_reply_to_status_id: Self = this.set("in_reply_to_status_id", js.undefined)
    @scala.inline
    def setInclude_email(value: Boolean): Self = this.set("include_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_email: Self = this.set("include_email", js.undefined)
    @scala.inline
    def setInclude_entities(value: Boolean): Self = this.set("include_entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_entities: Self = this.set("include_entities", js.undefined)
    @scala.inline
    def setInclude_rts(value: Boolean): Self = this.set("include_rts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_rts: Self = this.set("include_rts", js.undefined)
    @scala.inline
    def setInclude_user_entities(value: Boolean): Self = this.set("include_user_entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_user_entities: Self = this.set("include_user_entities", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLong(value: Double): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    @scala.inline
    def setMax_id(value: String): Self = this.set("max_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_id: Self = this.set("max_id", js.undefined)
    @scala.inline
    def setMedia_data(value: Buffer | String): Self = this.set("media_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia_data: Self = this.set("media_data", js.undefined)
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia_id: Self = this.set("media_id", js.undefined)
    @scala.inline
    def setMedia_idsVarargs(value: String*): Self = this.set("media_ids", js.Array(value :_*))
    @scala.inline
    def setMedia_ids(value: js.Array[String]): Self = this.set("media_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia_ids: Self = this.set("media_ids", js.undefined)
    @scala.inline
    def setOwner_screen_name(value: String): Self = this.set("owner_screen_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner_screen_name: Self = this.set("owner_screen_name", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setResult_type(value: ResultType): Self = this.set("result_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult_type: Self = this.set("result_type", js.undefined)
    @scala.inline
    def setResults_per_page(value: Double): Self = this.set("results_per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults_per_page: Self = this.set("results_per_page", js.undefined)
    @scala.inline
    def setScreen_name(value: String): Self = this.set("screen_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen_name: Self = this.set("screen_name", js.undefined)
    @scala.inline
    def setSince_id(value: String): Self = this.set("since_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince_id: Self = this.set("since_id", js.undefined)
    @scala.inline
    def setSkip_status(value: Boolean): Self = this.set("skip_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_status: Self = this.set("skip_status", js.undefined)
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlug: Self = this.set("slug", js.undefined)
    @scala.inline
    def setSource_id(value: Double): Self = this.set("source_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_id: Self = this.set("source_id", js.undefined)
    @scala.inline
    def setSource_screen_name(value: String): Self = this.set("source_screen_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_screen_name: Self = this.set("source_screen_name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStringify_ids(value: Boolean): Self = this.set("stringify_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify_ids: Self = this.set("stringify_ids", js.undefined)
    @scala.inline
    def setTarget_id(value: Double): Self = this.set("target_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget_id: Self = this.set("target_id", js.undefined)
    @scala.inline
    def setTarget_screen_name(value: String): Self = this.set("target_screen_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget_screen_name: Self = this.set("target_screen_name", js.undefined)
    @scala.inline
    def setTrackVarargs(value: String*): Self = this.set("track", js.Array(value :_*))
    @scala.inline
    def setTrack(value: String | js.Array[String]): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setTrim_user(value: Boolean): Self = this.set("trim_user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim_user: Self = this.set("trim_user", js.undefined)
    @scala.inline
    def setTweet_mode(value: String): Self = this.set("tweet_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTweet_mode: Self = this.set("tweet_mode", js.undefined)
    @scala.inline
    def setUntil(value: String): Self = this.set("until", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUser_id(value: Double | String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

