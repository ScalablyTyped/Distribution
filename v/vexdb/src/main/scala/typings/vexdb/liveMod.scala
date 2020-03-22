package typings.vexdb

import typings.node.eventsMod.EventEmitter
import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.requestObjectsMod.RequestObject
import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.requestObjectsMod.TeamsRequestObject
import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.responseObjectsMod.ResponseObject
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.responseObjectsMod.TeamsResponseObject
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
object liveMod extends js.Object {
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
  def live_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  type LiveRequestObject[T] = T with AnonPrefetch
}

