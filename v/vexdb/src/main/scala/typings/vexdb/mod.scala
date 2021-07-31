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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vexdb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object cache {
    
    @JSImport("vexdb", "cache")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[AwardsRequestObject]]]
    
    @scala.inline
    def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[EventsRequestObject]]]
    
    @scala.inline
    def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[MatchesRequestObject]]]
    
    @scala.inline
    def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[RankingsRequestObject]]]
    
    @scala.inline
    def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[SeasonRankingsRequestObject]]]
    
    @scala.inline
    def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[SkillsRequestObject]]]
    
    @scala.inline
    def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[TeamsRequestObject]]]
    
    @scala.inline
    def store_awards(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_events(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_matches(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_rankings(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_seasonrankings(
      endpoint: season_rankings,
      params: SeasonRankingsRequestObject,
      data: APIResponse[SeasonRankingsResponseObject]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_skills(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def store_teams(endpoint: teams, params: TeamsRequestObject, data: APIResponse[TeamsResponseObject]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("store")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
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
    
    @scala.inline
    def header(headers: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("vexdb", "constant.isBrowser")
    @js.native
    def isBrowser: js.Function = js.native
    @scala.inline
    def isBrowser_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def param(params: RequestObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
  
  @scala.inline
  def get_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AwardsResponseObject]]]
  
  @scala.inline
  def get_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[EventsResponseObject]]]
  
  @scala.inline
  def get_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MatchesResponseObject]]]
  
  @scala.inline
  def get_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RankingsResponseObject]]]
  
  @scala.inline
  def get_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SeasonRankingsResponseObject]]]
  
  @scala.inline
  def get_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SkillsResponseObject]]]
  
  @scala.inline
  def get_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TeamsResponseObject]]]
  
  @scala.inline
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[RequestObject, ResponseObject]]
  
  @scala.inline
  def live_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[AwardsRequestObject, AwardsResponseObject]]
  
  @scala.inline
  def live_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[EventsRequestObject, EventsResponseObject]]
  
  @scala.inline
  def live_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[MatchesRequestObject, MatchesResponseObject]]
  
  @scala.inline
  def live_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[RankingsRequestObject, RankingsResponseObject]]
  
  @scala.inline
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject]]
  
  @scala.inline
  def live_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[SkillsRequestObject, SkillsResponseObject]]
  
  @scala.inline
  def live_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("live")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[TeamsRequestObject, TeamsResponseObject]]
  
  @scala.inline
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[T]]]
  
  @scala.inline
  def size_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def size_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
