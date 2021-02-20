package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.twit.anon.Id
import typings.twit.twitStrings.low
import typings.twit.twitStrings.medium
import typings.twit.twitStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends StObject {
  
  var annotations: js.UndefOr[js.Object] = js.native
  
  var contributors: js.UndefOr[js.Array[Contributors]] = js.native
  
  var coordinates: js.UndefOr[Point] = js.native
  
  var created_at: String = js.native
  
  var current_user_retweet: js.UndefOr[Id] = js.native
  
  var display_text_range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var entities: Entities = js.native
  
  var favorite_count: js.UndefOr[Double] = js.native
  
  var favorited: js.UndefOr[Boolean] = js.native
  
  var filter_level: none | low | medium = js.native
  
  var full_text: js.UndefOr[String] = js.native
  
  var id: Double = js.native
  
  var id_str: String = js.native
  
  var in_reply_to_screen_name: js.UndefOr[String] = js.native
  
  var in_reply_to_status_id: js.UndefOr[Double] = js.native
  
  var in_reply_to_status_id_str: js.UndefOr[String] = js.native
  
  var in_reply_to_user_id: js.UndefOr[Double] = js.native
  
  var in_reply_to_user_id_str: js.UndefOr[String] = js.native
  
  var is_quote_status: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var matching_rules: js.UndefOr[js.Array[MatchingRules]] = js.native
  
  var place: js.UndefOr[Place] = js.native
  
  var possibly_sensitive: js.UndefOr[Boolean] = js.native
  
  var quoted_status: js.UndefOr[Status] = js.native
  
  var quoted_status_id: js.UndefOr[Double] = js.native
  
  var quoted_status_id_str: js.UndefOr[String] = js.native
  
  var retweet_count: Double = js.native
  
  var retweeted: Boolean = js.native
  
  var retweeted_status: js.UndefOr[Status] = js.native
  
  var scopes: js.UndefOr[js.Object] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var truncated: Boolean = js.native
  
  var user: User = js.native
  
  var withheld_copyright: js.UndefOr[Boolean] = js.native
  
  var withheld_in_countries: js.UndefOr[js.Array[String]] = js.native
  
  var withheld_scope: js.UndefOr[String] = js.native
}
object Status {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Object): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setContributors(value: js.Array[Contributors]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: Contributors*): Self = StObject.set(x, "contributors", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: Point): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_retweet(value: Id): Self = StObject.set(x, "current_user_retweet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_retweetUndefined: Self = StObject.set(x, "current_user_retweet", js.undefined)
    
    @scala.inline
    def setDisplay_text_range(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "display_text_range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_text_rangeUndefined: Self = StObject.set(x, "display_text_range", js.undefined)
    
    @scala.inline
    def setEntities(value: Entities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite_count(value: Double): Self = StObject.set(x, "favorite_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite_countUndefined: Self = StObject.set(x, "favorite_count", js.undefined)
    
    @scala.inline
    def setFavorited(value: Boolean): Self = StObject.set(x, "favorited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoritedUndefined: Self = StObject.set(x, "favorited", js.undefined)
    
    @scala.inline
    def setFilter_level(value: none | low | medium): Self = StObject.set(x, "filter_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_text(value: String): Self = StObject.set(x, "full_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_textUndefined: Self = StObject.set(x, "full_text", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_screen_name(value: String): Self = StObject.set(x, "in_reply_to_screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_screen_nameUndefined: Self = StObject.set(x, "in_reply_to_screen_name", js.undefined)
    
    @scala.inline
    def setIn_reply_to_status_id(value: Double): Self = StObject.set(x, "in_reply_to_status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_status_idUndefined: Self = StObject.set(x, "in_reply_to_status_id", js.undefined)
    
    @scala.inline
    def setIn_reply_to_status_id_str(value: String): Self = StObject.set(x, "in_reply_to_status_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_status_id_strUndefined: Self = StObject.set(x, "in_reply_to_status_id_str", js.undefined)
    
    @scala.inline
    def setIn_reply_to_user_id(value: Double): Self = StObject.set(x, "in_reply_to_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_user_idUndefined: Self = StObject.set(x, "in_reply_to_user_id", js.undefined)
    
    @scala.inline
    def setIn_reply_to_user_id_str(value: String): Self = StObject.set(x, "in_reply_to_user_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_reply_to_user_id_strUndefined: Self = StObject.set(x, "in_reply_to_user_id_str", js.undefined)
    
    @scala.inline
    def setIs_quote_status(value: String): Self = StObject.set(x, "is_quote_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMatching_rules(value: js.Array[MatchingRules]): Self = StObject.set(x, "matching_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_rulesUndefined: Self = StObject.set(x, "matching_rules", js.undefined)
    
    @scala.inline
    def setMatching_rulesVarargs(value: MatchingRules*): Self = StObject.set(x, "matching_rules", js.Array(value :_*))
    
    @scala.inline
    def setPlace(value: Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    @scala.inline
    def setPossibly_sensitive(value: Boolean): Self = StObject.set(x, "possibly_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibly_sensitiveUndefined: Self = StObject.set(x, "possibly_sensitive", js.undefined)
    
    @scala.inline
    def setQuoted_status(value: Status): Self = StObject.set(x, "quoted_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted_statusUndefined: Self = StObject.set(x, "quoted_status", js.undefined)
    
    @scala.inline
    def setQuoted_status_id(value: Double): Self = StObject.set(x, "quoted_status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted_status_idUndefined: Self = StObject.set(x, "quoted_status_id", js.undefined)
    
    @scala.inline
    def setQuoted_status_id_str(value: String): Self = StObject.set(x, "quoted_status_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted_status_id_strUndefined: Self = StObject.set(x, "quoted_status_id_str", js.undefined)
    
    @scala.inline
    def setRetweet_count(value: Double): Self = StObject.set(x, "retweet_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetweeted(value: Boolean): Self = StObject.set(x, "retweeted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetweeted_status(value: Status): Self = StObject.set(x, "retweeted_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetweeted_statusUndefined: Self = StObject.set(x, "retweeted_status", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Object): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_copyright(value: Boolean): Self = StObject.set(x, "withheld_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_copyrightUndefined: Self = StObject.set(x, "withheld_copyright", js.undefined)
    
    @scala.inline
    def setWithheld_in_countries(value: js.Array[String]): Self = StObject.set(x, "withheld_in_countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_in_countriesUndefined: Self = StObject.set(x, "withheld_in_countries", js.undefined)
    
    @scala.inline
    def setWithheld_in_countriesVarargs(value: String*): Self = StObject.set(x, "withheld_in_countries", js.Array(value :_*))
    
    @scala.inline
    def setWithheld_scope(value: String): Self = StObject.set(x, "withheld_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithheld_scopeUndefined: Self = StObject.set(x, "withheld_scope", js.undefined)
  }
}
