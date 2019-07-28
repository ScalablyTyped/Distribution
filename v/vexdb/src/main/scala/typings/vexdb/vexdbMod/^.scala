package typings.vexdb.vexdbMod

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
object ^ extends js.Object {
  def cache(endpoint: Endpoint, params: RequestObject, value: js.Array[ResponseObject]): js.Promise[CacheEntry[ResponseObject]] = js.native
  @JSName("cache")
  def cache_awards(endpoint: awards, params: AwardsRequestObject, value: js.Array[AwardsResponseObject]): js.Promise[CacheEntry[AwardsResponseObject]] = js.native
  @JSName("cache")
  def cache_events(endpoint: events, params: EventsRequestObject, value: js.Array[EventsResponseObject]): js.Promise[CacheEntry[EventsResponseObject]] = js.native
  @JSName("cache")
  def cache_matches(endpoint: matches, params: MatchesRequestObject, value: js.Array[MatchesResponseObject]): js.Promise[CacheEntry[MatchesResponseObject]] = js.native
  @JSName("cache")
  def cache_rankings(endpoint: rankings, params: RankingsRequestObject, value: js.Array[RankingsResponseObject]): js.Promise[CacheEntry[RankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_seasonrankings(
    endpoint: season_rankings,
    params: SeasonRankingsRequestObject,
    value: js.Array[SeasonRankingsResponseObject]
  ): js.Promise[CacheEntry[SeasonRankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_skills(endpoint: skills, params: SkillsRequestObject, value: js.Array[SkillsResponseObject]): js.Promise[CacheEntry[SkillsResponseObject]] = js.native
  @JSName("cache")
  def cache_teams(endpoint: teams, params: TeamsRequestObject, value: js.Array[TeamsResponseObject]): js.Promise[CacheEntry[TeamsResponseObject]] = js.native
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
  def live(endpoint: Endpoint, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
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
}

