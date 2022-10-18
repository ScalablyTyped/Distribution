package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.twit.anon.Idstr
import typings.twit.anon.Media
import typings.twit.twitStrings.low
import typings.twit.twitStrings.medium
import typings.twit.twitStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var annotations: js.UndefOr[js.Object] = js.undefined
  
  var contributors: js.UndefOr[js.Array[Contributors]] = js.undefined
  
  var coordinates: js.UndefOr[Point] = js.undefined
  
  var created_at: String
  
  var current_user_retweet: js.UndefOr[Idstr] = js.undefined
  
  var display_text_range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var entities: Entities
  
  var extended_entities: js.UndefOr[Media] = js.undefined
  
  var favorite_count: js.UndefOr[Double] = js.undefined
  
  var favorited: js.UndefOr[Boolean] = js.undefined
  
  var filter_level: none | low | medium
  
  var full_text: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var id_str: String
  
  var in_reply_to_screen_name: js.UndefOr[String] = js.undefined
  
  var in_reply_to_status_id: js.UndefOr[Double] = js.undefined
  
  var in_reply_to_status_id_str: js.UndefOr[String] = js.undefined
  
  var in_reply_to_user_id: js.UndefOr[Double] = js.undefined
  
  var in_reply_to_user_id_str: js.UndefOr[String] = js.undefined
  
  var is_quote_status: String
  
  var lang: js.UndefOr[String] = js.undefined
  
  var matching_rules: js.UndefOr[js.Array[MatchingRules]] = js.undefined
  
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
  
  inline def apply(
    created_at: String,
    entities: Entities,
    filter_level: none | low | medium,
    id: Double,
    id_str: String,
    is_quote_status: String,
    retweet_count: Double,
    retweeted: Boolean,
    truncated: Boolean,
    user: User
  ): Status = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], filter_level = filter_level.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], is_quote_status = is_quote_status.asInstanceOf[js.Any], retweet_count = retweet_count.asInstanceOf[js.Any], retweeted = retweeted.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setAnnotations(value: js.Object): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setContributors(value: js.Array[Contributors]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: Contributors*): Self = StObject.set(x, "contributors", js.Array(value*))
    
    inline def setCoordinates(value: Point): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_retweet(value: Idstr): Self = StObject.set(x, "current_user_retweet", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_retweetUndefined: Self = StObject.set(x, "current_user_retweet", js.undefined)
    
    inline def setDisplay_text_range(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "display_text_range", value.asInstanceOf[js.Any])
    
    inline def setDisplay_text_rangeUndefined: Self = StObject.set(x, "display_text_range", js.undefined)
    
    inline def setEntities(value: Entities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setExtended_entities(value: Media): Self = StObject.set(x, "extended_entities", value.asInstanceOf[js.Any])
    
    inline def setExtended_entitiesUndefined: Self = StObject.set(x, "extended_entities", js.undefined)
    
    inline def setFavorite_count(value: Double): Self = StObject.set(x, "favorite_count", value.asInstanceOf[js.Any])
    
    inline def setFavorite_countUndefined: Self = StObject.set(x, "favorite_count", js.undefined)
    
    inline def setFavorited(value: Boolean): Self = StObject.set(x, "favorited", value.asInstanceOf[js.Any])
    
    inline def setFavoritedUndefined: Self = StObject.set(x, "favorited", js.undefined)
    
    inline def setFilter_level(value: none | low | medium): Self = StObject.set(x, "filter_level", value.asInstanceOf[js.Any])
    
    inline def setFull_text(value: String): Self = StObject.set(x, "full_text", value.asInstanceOf[js.Any])
    
    inline def setFull_textUndefined: Self = StObject.set(x, "full_text", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_screen_name(value: String): Self = StObject.set(x, "in_reply_to_screen_name", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_screen_nameUndefined: Self = StObject.set(x, "in_reply_to_screen_name", js.undefined)
    
    inline def setIn_reply_to_status_id(value: Double): Self = StObject.set(x, "in_reply_to_status_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_status_idUndefined: Self = StObject.set(x, "in_reply_to_status_id", js.undefined)
    
    inline def setIn_reply_to_status_id_str(value: String): Self = StObject.set(x, "in_reply_to_status_id_str", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_status_id_strUndefined: Self = StObject.set(x, "in_reply_to_status_id_str", js.undefined)
    
    inline def setIn_reply_to_user_id(value: Double): Self = StObject.set(x, "in_reply_to_user_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_user_idUndefined: Self = StObject.set(x, "in_reply_to_user_id", js.undefined)
    
    inline def setIn_reply_to_user_id_str(value: String): Self = StObject.set(x, "in_reply_to_user_id_str", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_user_id_strUndefined: Self = StObject.set(x, "in_reply_to_user_id_str", js.undefined)
    
    inline def setIs_quote_status(value: String): Self = StObject.set(x, "is_quote_status", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMatching_rules(value: js.Array[MatchingRules]): Self = StObject.set(x, "matching_rules", value.asInstanceOf[js.Any])
    
    inline def setMatching_rulesUndefined: Self = StObject.set(x, "matching_rules", js.undefined)
    
    inline def setMatching_rulesVarargs(value: MatchingRules*): Self = StObject.set(x, "matching_rules", js.Array(value*))
    
    inline def setPlace(value: Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    inline def setPossibly_sensitive(value: Boolean): Self = StObject.set(x, "possibly_sensitive", value.asInstanceOf[js.Any])
    
    inline def setPossibly_sensitiveUndefined: Self = StObject.set(x, "possibly_sensitive", js.undefined)
    
    inline def setQuoted_status(value: Status): Self = StObject.set(x, "quoted_status", value.asInstanceOf[js.Any])
    
    inline def setQuoted_statusUndefined: Self = StObject.set(x, "quoted_status", js.undefined)
    
    inline def setQuoted_status_id(value: Double): Self = StObject.set(x, "quoted_status_id", value.asInstanceOf[js.Any])
    
    inline def setQuoted_status_idUndefined: Self = StObject.set(x, "quoted_status_id", js.undefined)
    
    inline def setQuoted_status_id_str(value: String): Self = StObject.set(x, "quoted_status_id_str", value.asInstanceOf[js.Any])
    
    inline def setQuoted_status_id_strUndefined: Self = StObject.set(x, "quoted_status_id_str", js.undefined)
    
    inline def setRetweet_count(value: Double): Self = StObject.set(x, "retweet_count", value.asInstanceOf[js.Any])
    
    inline def setRetweeted(value: Boolean): Self = StObject.set(x, "retweeted", value.asInstanceOf[js.Any])
    
    inline def setRetweeted_status(value: Status): Self = StObject.set(x, "retweeted_status", value.asInstanceOf[js.Any])
    
    inline def setRetweeted_statusUndefined: Self = StObject.set(x, "retweeted_status", js.undefined)
    
    inline def setScopes(value: js.Object): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setWithheld_copyright(value: Boolean): Self = StObject.set(x, "withheld_copyright", value.asInstanceOf[js.Any])
    
    inline def setWithheld_copyrightUndefined: Self = StObject.set(x, "withheld_copyright", js.undefined)
    
    inline def setWithheld_in_countries(value: js.Array[String]): Self = StObject.set(x, "withheld_in_countries", value.asInstanceOf[js.Any])
    
    inline def setWithheld_in_countriesUndefined: Self = StObject.set(x, "withheld_in_countries", js.undefined)
    
    inline def setWithheld_in_countriesVarargs(value: String*): Self = StObject.set(x, "withheld_in_countries", js.Array(value*))
    
    inline def setWithheld_scope(value: String): Self = StObject.set(x, "withheld_scope", value.asInstanceOf[js.Any])
    
    inline def setWithheld_scopeUndefined: Self = StObject.set(x, "withheld_scope", js.undefined)
  }
}
