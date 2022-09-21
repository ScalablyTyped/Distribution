package typings.twit.mod

import typings.node.bufferMod.global.Buffer
import typings.twit.anon.Text
import typings.twit.mod.Twitter.ResultType
import typings.twit.twitStrings.`private`
import typings.twit.twitStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var alt_text: js.UndefOr[Text] = js.undefined
  
  var attachment_url: js.UndefOr[String] = js.undefined
  
  var auto_populate_reply_metadata: js.UndefOr[Boolean] = js.undefined
  
  var card_uri: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var cursor: js.UndefOr[Double | String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var display_coordinates: js.UndefOr[Boolean] = js.undefined
  
  var enable_dmcommands: js.UndefOr[Boolean] = js.undefined
  
  var exclude_replies: js.UndefOr[Boolean] = js.undefined
  
  var exclude_reply_user_ids: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fail_dmcommands: js.UndefOr[Boolean] = js.undefined
  
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
  
  var list_id: js.UndefOr[Double | String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var long: js.UndefOr[Double] = js.undefined
  
  var max_id: js.UndefOr[String] = js.undefined
  
  var media_data: js.UndefOr[Buffer | String] = js.undefined
  
  var media_id: js.UndefOr[String] = js.undefined
  
  var media_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var mode: js.UndefOr[public | `private`] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var owner_screen_name: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var place_id: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setAlt_text(value: Text): Self = StObject.set(x, "alt_text", value.asInstanceOf[js.Any])
    
    inline def setAlt_textUndefined: Self = StObject.set(x, "alt_text", js.undefined)
    
    inline def setAttachment_url(value: String): Self = StObject.set(x, "attachment_url", value.asInstanceOf[js.Any])
    
    inline def setAttachment_urlUndefined: Self = StObject.set(x, "attachment_url", js.undefined)
    
    inline def setAuto_populate_reply_metadata(value: Boolean): Self = StObject.set(x, "auto_populate_reply_metadata", value.asInstanceOf[js.Any])
    
    inline def setAuto_populate_reply_metadataUndefined: Self = StObject.set(x, "auto_populate_reply_metadata", js.undefined)
    
    inline def setCard_uri(value: String): Self = StObject.set(x, "card_uri", value.asInstanceOf[js.Any])
    
    inline def setCard_uriUndefined: Self = StObject.set(x, "card_uri", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplay_coordinates(value: Boolean): Self = StObject.set(x, "display_coordinates", value.asInstanceOf[js.Any])
    
    inline def setDisplay_coordinatesUndefined: Self = StObject.set(x, "display_coordinates", js.undefined)
    
    inline def setEnable_dmcommands(value: Boolean): Self = StObject.set(x, "enable_dmcommands", value.asInstanceOf[js.Any])
    
    inline def setEnable_dmcommandsUndefined: Self = StObject.set(x, "enable_dmcommands", js.undefined)
    
    inline def setExclude_replies(value: Boolean): Self = StObject.set(x, "exclude_replies", value.asInstanceOf[js.Any])
    
    inline def setExclude_repliesUndefined: Self = StObject.set(x, "exclude_replies", js.undefined)
    
    inline def setExclude_reply_user_ids(value: String | js.Array[String]): Self = StObject.set(x, "exclude_reply_user_ids", value.asInstanceOf[js.Any])
    
    inline def setExclude_reply_user_idsUndefined: Self = StObject.set(x, "exclude_reply_user_ids", js.undefined)
    
    inline def setExclude_reply_user_idsVarargs(value: String*): Self = StObject.set(x, "exclude_reply_user_ids", js.Array(value*))
    
    inline def setFail_dmcommands(value: Boolean): Self = StObject.set(x, "fail_dmcommands", value.asInstanceOf[js.Any])
    
    inline def setFail_dmcommandsUndefined: Self = StObject.set(x, "fail_dmcommands", js.undefined)
    
    inline def setFollow(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setFollowVarargs(value: String*): Self = StObject.set(x, "follow", js.Array(value*))
    
    inline def setGeocode(value: String): Self = StObject.set(x, "geocode", value.asInstanceOf[js.Any])
    
    inline def setGeocodeUndefined: Self = StObject.set(x, "geocode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIn_reply_to_status_id(value: Double | String): Self = StObject.set(x, "in_reply_to_status_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_status_idUndefined: Self = StObject.set(x, "in_reply_to_status_id", js.undefined)
    
    inline def setInclude_email(value: Boolean): Self = StObject.set(x, "include_email", value.asInstanceOf[js.Any])
    
    inline def setInclude_emailUndefined: Self = StObject.set(x, "include_email", js.undefined)
    
    inline def setInclude_entities(value: Boolean): Self = StObject.set(x, "include_entities", value.asInstanceOf[js.Any])
    
    inline def setInclude_entitiesUndefined: Self = StObject.set(x, "include_entities", js.undefined)
    
    inline def setInclude_rts(value: Boolean): Self = StObject.set(x, "include_rts", value.asInstanceOf[js.Any])
    
    inline def setInclude_rtsUndefined: Self = StObject.set(x, "include_rts", js.undefined)
    
    inline def setInclude_user_entities(value: Boolean): Self = StObject.set(x, "include_user_entities", value.asInstanceOf[js.Any])
    
    inline def setInclude_user_entitiesUndefined: Self = StObject.set(x, "include_user_entities", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setList_id(value: Double | String): Self = StObject.set(x, "list_id", value.asInstanceOf[js.Any])
    
    inline def setList_idUndefined: Self = StObject.set(x, "list_id", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    inline def setMax_idUndefined: Self = StObject.set(x, "max_id", js.undefined)
    
    inline def setMedia_data(value: Buffer | String): Self = StObject.set(x, "media_data", value.asInstanceOf[js.Any])
    
    inline def setMedia_dataUndefined: Self = StObject.set(x, "media_data", js.undefined)
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    inline def setMedia_idUndefined: Self = StObject.set(x, "media_id", js.undefined)
    
    inline def setMedia_ids(value: js.Array[String]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
    
    inline def setMedia_idsUndefined: Self = StObject.set(x, "media_ids", js.undefined)
    
    inline def setMedia_idsVarargs(value: String*): Self = StObject.set(x, "media_ids", js.Array(value*))
    
    inline def setMode(value: public | `private`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner_screen_name(value: String): Self = StObject.set(x, "owner_screen_name", value.asInstanceOf[js.Any])
    
    inline def setOwner_screen_nameUndefined: Self = StObject.set(x, "owner_screen_name", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setResult_type(value: ResultType): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setResult_typeUndefined: Self = StObject.set(x, "result_type", js.undefined)
    
    inline def setResults_per_page(value: Double): Self = StObject.set(x, "results_per_page", value.asInstanceOf[js.Any])
    
    inline def setResults_per_pageUndefined: Self = StObject.set(x, "results_per_page", js.undefined)
    
    inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    inline def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
    
    inline def setSince_id(value: String): Self = StObject.set(x, "since_id", value.asInstanceOf[js.Any])
    
    inline def setSince_idUndefined: Self = StObject.set(x, "since_id", js.undefined)
    
    inline def setSkip_status(value: Boolean): Self = StObject.set(x, "skip_status", value.asInstanceOf[js.Any])
    
    inline def setSkip_statusUndefined: Self = StObject.set(x, "skip_status", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setSource_id(value: Double): Self = StObject.set(x, "source_id", value.asInstanceOf[js.Any])
    
    inline def setSource_idUndefined: Self = StObject.set(x, "source_id", js.undefined)
    
    inline def setSource_screen_name(value: String): Self = StObject.set(x, "source_screen_name", value.asInstanceOf[js.Any])
    
    inline def setSource_screen_nameUndefined: Self = StObject.set(x, "source_screen_name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStringify_ids(value: Boolean): Self = StObject.set(x, "stringify_ids", value.asInstanceOf[js.Any])
    
    inline def setStringify_idsUndefined: Self = StObject.set(x, "stringify_ids", js.undefined)
    
    inline def setTarget_id(value: Double): Self = StObject.set(x, "target_id", value.asInstanceOf[js.Any])
    
    inline def setTarget_idUndefined: Self = StObject.set(x, "target_id", js.undefined)
    
    inline def setTarget_screen_name(value: String): Self = StObject.set(x, "target_screen_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_screen_nameUndefined: Self = StObject.set(x, "target_screen_name", js.undefined)
    
    inline def setTrack(value: String | js.Array[String]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setTrackVarargs(value: String*): Self = StObject.set(x, "track", js.Array(value*))
    
    inline def setTrim_user(value: Boolean): Self = StObject.set(x, "trim_user", value.asInstanceOf[js.Any])
    
    inline def setTrim_userUndefined: Self = StObject.set(x, "trim_user", js.undefined)
    
    inline def setTweet_mode(value: String): Self = StObject.set(x, "tweet_mode", value.asInstanceOf[js.Any])
    
    inline def setTweet_modeUndefined: Self = StObject.set(x, "tweet_mode", js.undefined)
    
    inline def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser_id(value: Double | String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
