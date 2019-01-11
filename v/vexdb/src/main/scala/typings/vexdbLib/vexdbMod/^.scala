package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cache(
    endpoint: vexdbLib.vexdbMod.Endpoint,
    params: vexdbLib.vexdbMod.RequestObject,
    value: js.Array[vexdbLib.vexdbMod.ResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.ResponseObject]] = js.native
  @JSName("cache")
  def cache_awards(
    endpoint: vexdbLib.vexdbLibStrings.awards,
    params: vexdbLib.vexdbMod.AwardsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.AwardsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.AwardsResponseObject]] = js.native
  @JSName("cache")
  def cache_events(
    endpoint: vexdbLib.vexdbLibStrings.events,
    params: vexdbLib.vexdbMod.EventsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.EventsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.EventsResponseObject]] = js.native
  @JSName("cache")
  def cache_matches(
    endpoint: vexdbLib.vexdbLibStrings.matches,
    params: vexdbLib.vexdbMod.MatchesRequestObject,
    value: js.Array[vexdbLib.vexdbMod.MatchesResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.MatchesResponseObject]] = js.native
  @JSName("cache")
  def cache_rankings(
    endpoint: vexdbLib.vexdbLibStrings.rankings,
    params: vexdbLib.vexdbMod.RankingsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.RankingsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.RankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.SeasonRankingsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.SeasonRankingsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.SeasonRankingsResponseObject]] = js.native
  @JSName("cache")
  def cache_skills(
    endpoint: vexdbLib.vexdbLibStrings.skills,
    params: vexdbLib.vexdbMod.SkillsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.SkillsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.SkillsResponseObject]] = js.native
  @JSName("cache")
  def cache_teams(
    endpoint: vexdbLib.vexdbLibStrings.teams,
    params: vexdbLib.vexdbMod.TeamsRequestObject,
    value: js.Array[vexdbLib.vexdbMod.TeamsResponseObject]
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.TeamsResponseObject]] = js.native
  @JSName("get")
  def get_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: vexdbLib.vexdbMod.AwardsRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: vexdbLib.vexdbLibStrings.events, params: vexdbLib.vexdbMod.EventsRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: vexdbLib.vexdbMod.MatchesRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: vexdbLib.vexdbMod.RankingsRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.RankingsResponseObject]] = js.native
  @JSName("get")
  def get_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.SeasonRankingsRequestObject
  ): js.Promise[js.Array[vexdbLib.vexdbMod.SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: vexdbLib.vexdbMod.SkillsRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: vexdbLib.vexdbMod.TeamsRequestObject): js.Promise[js.Array[vexdbLib.vexdbMod.TeamsResponseObject]] = js.native
  def live(
    endpoint: vexdbLib.vexdbMod.Endpoint,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.RequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.RequestObject, vexdbLib.vexdbMod.ResponseObject] = js.native
  @JSName("live")
  def live_awards(
    endpoint: vexdbLib.vexdbLibStrings.awards,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.AwardsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.AwardsRequestObject, vexdbLib.vexdbMod.AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(
    endpoint: vexdbLib.vexdbLibStrings.events,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.EventsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.EventsRequestObject, vexdbLib.vexdbMod.EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(
    endpoint: vexdbLib.vexdbLibStrings.matches,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.MatchesRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.MatchesRequestObject, vexdbLib.vexdbMod.MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(
    endpoint: vexdbLib.vexdbLibStrings.rankings,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.RankingsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.RankingsRequestObject, vexdbLib.vexdbMod.RankingsResponseObject] = js.native
  @JSName("live")
  def live_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.SeasonRankingsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[
    vexdbLib.vexdbMod.SeasonRankingsRequestObject, 
    vexdbLib.vexdbMod.SeasonRankingsResponseObject
  ] = js.native
  @JSName("live")
  def live_skills(
    endpoint: vexdbLib.vexdbLibStrings.skills,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.SkillsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.SkillsRequestObject, vexdbLib.vexdbMod.SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(
    endpoint: vexdbLib.vexdbLibStrings.teams,
    params: vexdbLib.vexdbMod.LiveRequestObject[vexdbLib.vexdbMod.TeamsRequestObject]
  ): vexdbLib.vexdbMod.LiveEventEmitter[vexdbLib.vexdbMod.TeamsRequestObject, vexdbLib.vexdbMod.TeamsResponseObject] = js.native
  @JSName("size")
  def size_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: vexdbLib.vexdbMod.AwardsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_events(endpoint: vexdbLib.vexdbLibStrings.events, params: vexdbLib.vexdbMod.EventsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: vexdbLib.vexdbMod.MatchesRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: vexdbLib.vexdbMod.RankingsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_season_rankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.SeasonRankingsRequestObject
  ): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: vexdbLib.vexdbMod.SkillsRequestObject): js.Promise[scala.Double] = js.native
  @JSName("size")
  def size_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: vexdbLib.vexdbMod.TeamsRequestObject): js.Promise[scala.Double] = js.native
}

