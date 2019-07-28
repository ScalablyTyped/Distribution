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

@JSImport("vexdb", "cache")
@js.native
object cacheNs extends js.Object {
  val ttl: Double = js.native
  def clear(): Unit = js.native
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
  def sanitize(endpoint: Endpoint, params: js.Object): js.Object = js.native
  def serialize(url: js.Any, params: js.Object): js.Object = js.native
  def setTTL(ttl: Double): js.Object = js.native
}

