package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.twit.anon.Id
import typings.twit.twitStrings.low
import typings.twit.twitStrings.medium
import typings.twit.twitStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
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
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities(value: Entities): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_level(value: none | low | medium): Self = this.set("filter_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = this.set("id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_quote_status(value: String): Self = this.set("is_quote_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetweet_count(value: Double): Self = this.set("retweet_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetweeted(value: Boolean): Self = this.set("retweeted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotations(value: js.Object): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: Contributors*): Self = this.set("contributors", js.Array(value :_*))
    
    @scala.inline
    def setContributors(value: js.Array[Contributors]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    
    @scala.inline
    def setCoordinates(value: Point): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setCurrent_user_retweet(value: Id): Self = this.set("current_user_retweet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent_user_retweet: Self = this.set("current_user_retweet", js.undefined)
    
    @scala.inline
    def setDisplay_text_range(value: js.Tuple2[Double, Double]): Self = this.set("display_text_range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_text_range: Self = this.set("display_text_range", js.undefined)
    
    @scala.inline
    def setFavorite_count(value: Double): Self = this.set("favorite_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavorite_count: Self = this.set("favorite_count", js.undefined)
    
    @scala.inline
    def setFavorited(value: Boolean): Self = this.set("favorited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavorited: Self = this.set("favorited", js.undefined)
    
    @scala.inline
    def setFull_text(value: String): Self = this.set("full_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_text: Self = this.set("full_text", js.undefined)
    
    @scala.inline
    def setIn_reply_to_screen_name(value: String): Self = this.set("in_reply_to_screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_reply_to_screen_name: Self = this.set("in_reply_to_screen_name", js.undefined)
    
    @scala.inline
    def setIn_reply_to_status_id(value: Double): Self = this.set("in_reply_to_status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_reply_to_status_id: Self = this.set("in_reply_to_status_id", js.undefined)
    
    @scala.inline
    def setIn_reply_to_status_id_str(value: String): Self = this.set("in_reply_to_status_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_reply_to_status_id_str: Self = this.set("in_reply_to_status_id_str", js.undefined)
    
    @scala.inline
    def setIn_reply_to_user_id(value: Double): Self = this.set("in_reply_to_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_reply_to_user_id: Self = this.set("in_reply_to_user_id", js.undefined)
    
    @scala.inline
    def setIn_reply_to_user_id_str(value: String): Self = this.set("in_reply_to_user_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_reply_to_user_id_str: Self = this.set("in_reply_to_user_id_str", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMatching_rulesVarargs(value: MatchingRules*): Self = this.set("matching_rules", js.Array(value :_*))
    
    @scala.inline
    def setMatching_rules(value: js.Array[MatchingRules]): Self = this.set("matching_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_rules: Self = this.set("matching_rules", js.undefined)
    
    @scala.inline
    def setPlace(value: Place): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
    
    @scala.inline
    def setPossibly_sensitive(value: Boolean): Self = this.set("possibly_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossibly_sensitive: Self = this.set("possibly_sensitive", js.undefined)
    
    @scala.inline
    def setQuoted_status(value: Status): Self = this.set("quoted_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_status: Self = this.set("quoted_status", js.undefined)
    
    @scala.inline
    def setQuoted_status_id(value: Double): Self = this.set("quoted_status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_status_id: Self = this.set("quoted_status_id", js.undefined)
    
    @scala.inline
    def setQuoted_status_id_str(value: String): Self = this.set("quoted_status_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_status_id_str: Self = this.set("quoted_status_id_str", js.undefined)
    
    @scala.inline
    def setRetweeted_status(value: Status): Self = this.set("retweeted_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetweeted_status: Self = this.set("retweeted_status", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Object): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWithheld_copyright(value: Boolean): Self = this.set("withheld_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithheld_copyright: Self = this.set("withheld_copyright", js.undefined)
    
    @scala.inline
    def setWithheld_in_countriesVarargs(value: String*): Self = this.set("withheld_in_countries", js.Array(value :_*))
    
    @scala.inline
    def setWithheld_in_countries(value: js.Array[String]): Self = this.set("withheld_in_countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithheld_in_countries: Self = this.set("withheld_in_countries", js.undefined)
    
    @scala.inline
    def setWithheld_scope(value: String): Self = this.set("withheld_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithheld_scope: Self = this.set("withheld_scope", js.undefined)
  }
}
