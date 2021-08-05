package typings.vexdb

import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.requestObjectsMod.TeamsRequestObject
import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.responseObjectsMod.TeamsResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbStrings.awards
import typings.vexdb.vexdbStrings.events
import typings.vexdb.vexdbStrings.matches
import typings.vexdb.vexdbStrings.rankings
import typings.vexdb.vexdbStrings.season_rankings
import typings.vexdb.vexdbStrings.skills
import typings.vexdb.vexdbStrings.teams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("vexdb/out/methods/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[AwardsRequestObject]]]
  
  inline def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[EventsRequestObject]]]
  
  inline def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[MatchesRequestObject]]]
  
  inline def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[RankingsRequestObject]]]
  
  inline def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[SeasonRankingsRequestObject]]]
  
  inline def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[SkillsRequestObject]]]
  
  inline def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[TeamsRequestObject]]]
  
  inline def store_awards(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_events(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_matches(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_rankings(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_seasonrankings(
    endpoint: season_rankings,
    params: SeasonRankingsRequestObject,
    data: APIResponse[SeasonRankingsResponseObject]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_skills(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def store_teams(endpoint: teams, params: TeamsRequestObject, data: APIResponse[TeamsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait APIFailure[T]
    extends StObject
       with APIResponse[T] {
    
    var error_code: Double
    
    var error_text: String
    
    var status: `0`
  }
  object APIFailure {
    
    inline def apply[T](error_code: Double, error_text: String): APIFailure[T] = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = 0)
      __obj.asInstanceOf[APIFailure[T]]
    }
    
    extension [Self <: APIFailure[?], T](x: Self & APIFailure[T]) {
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_text(value: String): Self = StObject.set(x, "error_text", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.cacheMod.APISuccess[T]
    - typings.vexdb.cacheMod.APIFailure[T]
  */
  trait APIResponse[T] extends StObject
  object APIResponse {
    
    inline def APIFailure[T](error_code: Double, error_text: String): typings.vexdb.cacheMod.APIFailure[T] = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = 0)
      __obj.asInstanceOf[typings.vexdb.cacheMod.APIFailure[T]]
    }
    
    inline def APISuccess[T](result: js.Array[T], size: Double): typings.vexdb.cacheMod.APISuccess[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = 1)
      __obj.asInstanceOf[typings.vexdb.cacheMod.APISuccess[T]]
    }
  }
  
  trait APISuccess[T]
    extends StObject
       with APIResponse[T] {
    
    var result: js.Array[T]
    
    var size: Double
    
    var status: `1`
  }
  object APISuccess {
    
    inline def apply[T](result: js.Array[T], size: Double): APISuccess[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = 1)
      __obj.asInstanceOf[APISuccess[T]]
    }
    
    extension [Self <: APISuccess[?], T](x: Self & APISuccess[T]) {
      
      inline def setResult(value: js.Array[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: T*): Self = StObject.set(x, "result", js.Array(value :_*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheEntry[T] extends StObject {
    
    var expires: Double
    
    var value: APIResponse[T]
  }
  object CacheEntry {
    
    inline def apply[T](expires: Double, value: APIResponse[T]): CacheEntry[T] = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry[T]]
    }
    
    extension [Self <: CacheEntry[?], T](x: Self & CacheEntry[T]) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setValue(value: APIResponse[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
