package typings.vexdb

import typings.vexdb.outConstantsRequestObjectsMod.AwardsRequestObject
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

@JSImport("vexdb/out/methods/get", JSImport.Namespace)
@js.native
object outMethodsGetMod extends js.Object {
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
}

