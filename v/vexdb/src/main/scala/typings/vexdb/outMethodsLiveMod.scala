package typings.vexdb

import typings.node.eventsMod.EventEmitter
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
import typings.vexdb.outMethodsLiveMod.LiveEventEmitter
import typings.vexdb.outMethodsLiveMod.LiveRequestObject
import typings.vexdb.vexdbStrings.awards
import typings.vexdb.vexdbStrings.events
import typings.vexdb.vexdbStrings.fetch
import typings.vexdb.vexdbStrings.item
import typings.vexdb.vexdbStrings.matches
import typings.vexdb.vexdbStrings.prefetch
import typings.vexdb.vexdbStrings.rankings
import typings.vexdb.vexdbStrings.season_rankings
import typings.vexdb.vexdbStrings.skills
import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/live", JSImport.Namespace)
@js.native
object outMethodsLiveMod extends js.Object {
  @js.native
  trait LiveEventEmitter[Q, R] extends EventEmitter {
    def close(): Unit = js.native
    def current(): js.Array[R] = js.native
    def fetch(): js.Promise[Boolean] = js.native
    @JSName("on")
    def on_fetch(event: fetch, callback: js.Function1[/* newItems */ js.Array[R], Unit]): this.type = js.native
    @JSName("on")
    def on_item(event: item, callback: js.Function1[/* item */ R, Unit]): this.type = js.native
    @JSName("on")
    def on_prefetch(event: prefetch, callback: js.Function1[/* results */ js.Array[R], Unit]): this.type = js.native
    def params(updateParameters: Q): Q = js.native
  }
  
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
  type LiveRequestObject[T] = T with Anon_Prefetch
}

