package typings.vexdb.cacheMod

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

@JSImport("vexdb/out/methods/cache", "cache")
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

