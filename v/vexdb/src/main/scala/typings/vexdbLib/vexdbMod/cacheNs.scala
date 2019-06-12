package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "cache")
@js.native
object cacheNs extends js.Object {
  val ttl: scala.Double = js.native
  def clear(): scala.Unit = js.native
  @JSName("has")
  def has_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: vexdbLib.vexdbMod.AwardsRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_events(endpoint: vexdbLib.vexdbLibStrings.events, params: vexdbLib.vexdbMod.EventsRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: vexdbLib.vexdbMod.MatchesRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: vexdbLib.vexdbMod.RankingsRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_seasonrankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.SeasonRankingsRequestObject
  ): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: vexdbLib.vexdbMod.SkillsRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("has")
  def has_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: vexdbLib.vexdbMod.TeamsRequestObject): js.Promise[scala.Boolean] = js.native
  @JSName("resolve")
  def resolve_awards(endpoint: vexdbLib.vexdbLibStrings.awards, params: vexdbLib.vexdbMod.AwardsRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.AwardsResponseObject]] = js.native
  @JSName("resolve")
  def resolve_events(endpoint: vexdbLib.vexdbLibStrings.events, params: vexdbLib.vexdbMod.EventsRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.EventsResponseObject]] = js.native
  @JSName("resolve")
  def resolve_matches(endpoint: vexdbLib.vexdbLibStrings.matches, params: vexdbLib.vexdbMod.MatchesRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.MatchesResponseObject]] = js.native
  @JSName("resolve")
  def resolve_rankings(endpoint: vexdbLib.vexdbLibStrings.rankings, params: vexdbLib.vexdbMod.RankingsRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.RankingsResponseObject]] = js.native
  @JSName("resolve")
  def resolve_seasonrankings(
    endpoint: vexdbLib.vexdbLibStrings.season_rankings,
    params: vexdbLib.vexdbMod.SeasonRankingsRequestObject
  ): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.SeasonRankingsResponseObject]] = js.native
  @JSName("resolve")
  def resolve_skills(endpoint: vexdbLib.vexdbLibStrings.skills, params: vexdbLib.vexdbMod.SkillsRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.SkillsResponseObject]] = js.native
  @JSName("resolve")
  def resolve_teams(endpoint: vexdbLib.vexdbLibStrings.teams, params: vexdbLib.vexdbMod.TeamsRequestObject): js.Promise[vexdbLib.vexdbMod.CacheEntry[vexdbLib.vexdbMod.TeamsResponseObject]] = js.native
  def sanitize(endpoint: vexdbLib.vexdbMod.Endpoint, params: js.Object): js.Object = js.native
  def serialize(url: js.Any, params: js.Object): js.Object = js.native
  def setTTL(ttl: scala.Double): js.Object = js.native
}

