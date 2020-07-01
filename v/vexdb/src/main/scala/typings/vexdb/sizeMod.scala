package typings.vexdb

import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.requestObjectsMod.TeamsRequestObject
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

@JSImport("vexdb/out/methods/size", JSImport.Namespace)
@js.native
object sizeMod extends js.Object {
  @JSName("default")
  def default_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
}

