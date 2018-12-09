package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", JSImport.Namespace)
@js.native
object vexdbModMembers extends js.Object {
  def cache(endpoint: Endpoint, params: RequestObject, value: js.Array[ResponseObject]): js.Promise[CacheEntry[ResponseObject]] = js.native
  @JSName("cache")
  def cache_awards(
    endpoint: vexdbLib.vexdbLibStrings.awards,
    params: AwardsRequestObject,
    value: js.Array[AwardsResponseObject]
  ): js.Promise[CacheEntry[AwardsResponseObject]] = js.native
  @JSName("cache")
  def cache_events(
    endpoint: vexdbLib.vexdbLibStrings.events,
    params: EventsRequestObject,
    value: js.Array[EventsResponseObject]
  ): js.Promise[CacheEntry[EventsResponseObject]] = js.native
  @JSName("cache")
  def cache_matches(
    endpoint: vexdbLib.vexdbLibStrings.matches,
    params: MatchesRequestObject,
    value: js.Array[MatchesResponseObject]
  ): js.Promise[CacheEntry[MatchesResponseObject]] = js.native
  @JSName("cache")
  def cache_rankings(
    endpoint: vexdbLib.vexdbLibStrings.rankings,
    params: RankingsRequestObject,
    value: js.Array[RankingsResponseObject]
  ): js.Promise[CacheEntry[RankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: SeasonRankingsRequestObject,
    value: js.Array[SeasonRankingsResponseObject]
  ): js.Promise[CacheEntry[SeasonRankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_skills(
    endpoint: vexdbLib.vexdbLibStrings.skills,
    params: SkillsRequestObject,
    value: js.Array[SkillsResponseObject]
  ): js.Promise[CacheEntry[SkillsResponseObject]] = js.native
  @JSName("cache")
  def cache_teams(
    endpoint: vexdbLib.vexdbLibStrings.teams,
    params: TeamsRequestObject,
    value: js.Array[TeamsResponseObject]
  ): js.Promise[CacheEntry[TeamsResponseObject]] = js.native
  @JSName("get")
  def get_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: vexdbLib.vexdbLibStrings.events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSName("get")
  def get_season_rankings(endpoint: vexdbLib.vexdbLibStrings.season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
  def live(endpoint: Endpoint, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("live")
  def live_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: LiveRequestObject[AwardsRequestObject]): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: vexdbLib.vexdbLibStrings.events, params: LiveRequestObject[EventsRequestObject]): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: LiveRequestObject[MatchesRequestObject]): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: LiveRequestObject[RankingsRequestObject]): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: LiveRequestObject[SeasonRankingsRequestObject]
  ): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: LiveRequestObject[SkillsRequestObject]): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: LiveRequestObject[TeamsRequestObject]): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  @JSName("size")
  def size_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: AwardsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_events(endpoint: vexdbLib.vexdbLibStrings.events, params: EventsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: MatchesRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: RankingsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_season_rankings(endpoint: vexdbLib.vexdbLibStrings.season_rankings, params: SeasonRankingsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: SkillsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: TeamsRequestObject): js.Promise[scala.Double] = js.native
}

