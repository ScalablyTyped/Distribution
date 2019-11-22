package typings.vexdb

import org.scalablytyped.runtime.StringDictionary
import typings.vexdb.outConstantsRequestObjectsMod.AwardsRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.Endpoint
import typings.vexdb.outConstantsRequestObjectsMod.EventsRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.MatchesRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.RankingsRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.RequestObject
import typings.vexdb.outConstantsRequestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.SkillsRequestObject
import typings.vexdb.outConstantsRequestObjectsMod.TeamsRequestObject
import typings.vexdb.outConstantsResponseObjectsMod.AwardsResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.EventsResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.MatchesResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.RankingsResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.ResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.SkillsResponseObject
import typings.vexdb.outConstantsResponseObjectsMod.TeamsResponseObject
import typings.vexdb.outMethodsCacheMod.CacheEntry
import typings.vexdb.outMethodsLiveMod.LiveEventEmitter
import typings.vexdb.outMethodsLiveMod.LiveRequestObject
import typings.vexdb.vexdbStrings.awards
import typings.vexdb.vexdbStrings.events
import typings.vexdb.vexdbStrings.matches
import typings.vexdb.vexdbStrings.rankings
import typings.vexdb.vexdbStrings.season_rankings
import typings.vexdb.vexdbStrings.skills
import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", JSImport.Namespace)
@js.native
object vexdbMod extends js.Object {
  def get(endpoint: String, params: RequestObject): js.Promise[js.Array[ResponseObject]] = js.native
  @JSName("get")
  def get_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSName("get")
  def get_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("live")
  def live_awards(endpoint: awards, params: LiveRequestObject[AwardsRequestObject]): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: events, params: LiveRequestObject[EventsRequestObject]): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: matches, params: LiveRequestObject[MatchesRequestObject]): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: rankings, params: LiveRequestObject[RankingsRequestObject]): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObject[SeasonRankingsRequestObject]): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: skills, params: LiveRequestObject[SkillsRequestObject]): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: teams, params: LiveRequestObject[TeamsRequestObject]): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  def size(endpoint: String, params: RequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
  @js.native
  object cache extends js.Object {
    def apply(endpoint: awards, params: AwardsRequestObject, value: js.Array[AwardsResponseObject]): js.Promise[CacheEntry[AwardsResponseObject]] = js.native
    def apply(endpoint: events, params: EventsRequestObject, value: js.Array[EventsResponseObject]): js.Promise[CacheEntry[EventsResponseObject]] = js.native
    def apply(endpoint: matches, params: MatchesRequestObject, value: js.Array[MatchesResponseObject]): js.Promise[CacheEntry[MatchesResponseObject]] = js.native
    def apply(endpoint: rankings, params: RankingsRequestObject, value: js.Array[RankingsResponseObject]): js.Promise[CacheEntry[RankingsResponseObject]] = js.native
    def apply(
      endpoint: season_rankings,
      params: SeasonRankingsRequestObject,
      value: js.Array[SeasonRankingsResponseObject]
    ): js.Promise[CacheEntry[SeasonRankingsResponseObject]] = js.native
    def apply(endpoint: skills, params: SkillsRequestObject, value: js.Array[SkillsResponseObject]): js.Promise[CacheEntry[SkillsResponseObject]] = js.native
    def apply(endpoint: teams, params: TeamsRequestObject, value: js.Array[TeamsResponseObject]): js.Promise[CacheEntry[TeamsResponseObject]] = js.native
    def clear(): js.Promise[Unit] = js.native
    @JSName("has")
    def has_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_events(endpoint: events, params: EventsRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Boolean] = js.native
    @JSName("has")
    def has_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Boolean] = js.native
    @JSName("resolve")
    def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[CacheEntry[AwardsResponseObject]] = js.native
    @JSName("resolve")
    def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[CacheEntry[EventsResponseObject]] = js.native
    @JSName("resolve")
    def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[CacheEntry[MatchesResponseObject]] = js.native
    @JSName("resolve")
    def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[CacheEntry[RankingsResponseObject]] = js.native
    @JSName("resolve")
    def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[CacheEntry[SeasonRankingsResponseObject]] = js.native
    @JSName("resolve")
    def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[CacheEntry[SkillsResponseObject]] = js.native
    @JSName("resolve")
    def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[CacheEntry[TeamsResponseObject]] = js.native
    def sanitize(endpoint: js.Any, params: js.Any): String = js.native
    def serialize(url: js.Any, params: js.Any): String = js.native
  }
  
  @js.native
  object constant extends js.Object {
    var endpoints: js.Array[Endpoint] = js.native
    var isBrowser: js.Function = js.native
    var settings: typings.vexdb.outConstantsSettingsMod.settings = js.native
    var validParams: Anon_Awards = js.native
    def header(headers: StringDictionary[String]): Unit = js.native
    def param(params: RequestObject): Unit = js.native
  }
  
}

