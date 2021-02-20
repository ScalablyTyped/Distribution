package typings.vexdb

import org.scalablytyped.runtime.StringDictionary
import typings.vexdb.anon.Awards
import typings.vexdb.anon.LiveRequestObjectAwardsRe
import typings.vexdb.anon.LiveRequestObjectEventsRe
import typings.vexdb.anon.LiveRequestObjectMatchesR
import typings.vexdb.anon.LiveRequestObjectRankings
import typings.vexdb.anon.LiveRequestObjectSeasonRa
import typings.vexdb.anon.LiveRequestObjectSkillsRe
import typings.vexdb.anon.LiveRequestObjectTeamsReq
import typings.vexdb.cacheMod.APIResponse
import typings.vexdb.liveMod.LiveEventEmitter
import typings.vexdb.liveMod.LiveRequestObject
import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.requestObjectsMod.Endpoint
import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.requestObjectsMod.RequestObject
import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.requestObjectsMod.TeamsRequestObject
import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.responseObjectsMod.ResponseObject
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.responseObjectsMod.TeamsResponseObject
import typings.vexdb.settingsMod.settings
import typings.vexdb.vexdbStrings.awards
import typings.vexdb.vexdbStrings.events
import typings.vexdb.vexdbStrings.matches
import typings.vexdb.vexdbStrings.rankings
import typings.vexdb.vexdbStrings.season_rankings
import typings.vexdb.vexdbStrings.skills
import typings.vexdb.vexdbStrings.teams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object cache {
    
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = js.native
    @JSImport("vexdb", "cache.resolve")
    @js.native
    def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = js.native
    
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_awards(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_events(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_matches(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_rankings(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_seasonrankings(
      endpoint: season_rankings,
      params: SeasonRankingsRequestObject,
      data: APIResponse[SeasonRankingsResponseObject]
    ): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_skills(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = js.native
    @JSImport("vexdb", "cache.store")
    @js.native
    def store_teams(endpoint: teams, params: TeamsRequestObject, data: APIResponse[TeamsResponseObject]): js.Promise[Boolean] = js.native
  }
  
  object constant {
    
    @JSImport("vexdb", "constant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vexdb", "constant.SkillsType")
    @js.native
    def SkillsType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof req.SkillsType */ js.Any = js.native
    @scala.inline
    def SkillsType_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof req.SkillsType */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkillsType")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb", "constant.endpoints")
    @js.native
    def endpoints: js.Array[Endpoint] = js.native
    @scala.inline
    def endpoints_=(x: js.Array[Endpoint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb", "constant.header")
    @js.native
    def header(headers: StringDictionary[String]): Unit = js.native
    
    @JSImport("vexdb", "constant.isBrowser")
    @js.native
    def isBrowser: js.Function = js.native
    @scala.inline
    def isBrowser_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb", "constant.param")
    @js.native
    def param(params: RequestObject): Unit = js.native
    
    @JSImport("vexdb", "constant.passableParams")
    @js.native
    def passableParams: Awards = js.native
    @scala.inline
    def passableParams_=(x: Awards): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passableParams")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb", "constant.settings")
    @js.native
    def settings: typings.vexdb.settingsMod.settings = js.native
    @scala.inline
    def settings_=(x: settings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vexdb", "get")
  @js.native
  def get_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSImport("vexdb", "get")
  @js.native
  def get_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
  
  @JSImport("vexdb", "live")
  @js.native
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSImport("vexdb", "live")
  @js.native
  def live_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  
  @JSImport("vexdb", "request")
  @js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = js.native
  
  @JSImport("vexdb", "size")
  @js.native
  def size_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSImport("vexdb", "size")
  @js.native
  def size_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
}
