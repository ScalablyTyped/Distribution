package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", JSImport.Namespace)
@js.native
object vexdbModMembers extends js.Object {
  def cache(endpoint: Endpoint, params: RequestObject, value: js.Array[ResponseObject]): stdLib.Promise[CacheEntry[ResponseObject]] = js.native
  @JSName("cache")
  def cache_awards(
    endpoint: vexdbLib.vexdbLibStrings.awards,
    params: AwardsRequestObject,
    value: js.Array[AwardsResponseObject]
  ): stdLib.Promise[CacheEntry[AwardsResponseObject]] = js.native
  @JSName("cache")
  def cache_events(
    endpoint: vexdbLib.vexdbLibStrings.events,
    params: EventsRequestObject,
    value: js.Array[EventsResponseObject]
  ): stdLib.Promise[CacheEntry[EventsResponseObject]] = js.native
  @JSName("cache")
  def cache_matches(
    endpoint: vexdbLib.vexdbLibStrings.matches,
    params: MatchesRequestObject,
    value: js.Array[MatchesResponseObject]
  ): stdLib.Promise[CacheEntry[MatchesResponseObject]] = js.native
  @JSName("cache")
  def cache_rankings(
    endpoint: vexdbLib.vexdbLibStrings.rankings,
    params: RankingsRequestObject,
    value: js.Array[RankingsResponseObject]
  ): stdLib.Promise[CacheEntry[RankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: SeasonRankingsRequestObject,
    value: js.Array[SeasonRankingsResponseObject]
  ): stdLib.Promise[CacheEntry[SeasonRankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_skills(
    endpoint: vexdbLib.vexdbLibStrings.skills,
    params: SkillsRequestObject,
    value: js.Array[SkillsResponseObject]
  ): stdLib.Promise[CacheEntry[SkillsResponseObject]] = js.native
  @JSName("cache")
  def cache_teams(
    endpoint: vexdbLib.vexdbLibStrings.teams,
    params: TeamsRequestObject,
    value: js.Array[TeamsResponseObject]
  ): stdLib.Promise[CacheEntry[TeamsResponseObject]] = js.native
  @JSName("get")
  def get_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: AwardsRequestObject): stdLib.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: vexdbLib.vexdbLibStrings.events, params: EventsRequestObject): stdLib.Promise[js.Array[EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: MatchesRequestObject): stdLib.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: RankingsRequestObject): stdLib.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSName("get")
  def get_season_rankings(endpoint: vexdbLib.vexdbLibStrings.season_rankings, params: SeasonRankingsRequestObject): stdLib.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: SkillsRequestObject): stdLib.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: TeamsRequestObject): stdLib.Promise[js.Array[TeamsResponseObject]] = js.native
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
  def size_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: AwardsRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_events(endpoint: vexdbLib.vexdbLibStrings.events, params: EventsRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: MatchesRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: RankingsRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_season_rankings(endpoint: vexdbLib.vexdbLibStrings.season_rankings, params: SeasonRankingsRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: SkillsRequestObject): stdLib.Promise[scala.Double] = js.native
  @JSName("size")
  def size_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: TeamsRequestObject): stdLib.Promise[scala.Double] = js.native
}

