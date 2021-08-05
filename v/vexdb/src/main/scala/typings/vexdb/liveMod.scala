package typings.vexdb

import typings.node.eventsMod.EventEmitter
import typings.vexdb.anon.LiveRequestObjectAwardsRe
import typings.vexdb.anon.LiveRequestObjectEventsRe
import typings.vexdb.anon.LiveRequestObjectMatchesR
import typings.vexdb.anon.LiveRequestObjectRankings
import typings.vexdb.anon.LiveRequestObjectSeasonRa
import typings.vexdb.anon.LiveRequestObjectSkillsRe
import typings.vexdb.anon.LiveRequestObjectTeamsReq
import typings.vexdb.anon.Prefetch
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveMod {
  
  @JSImport("vexdb/out/methods/live", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[RequestObject, ResponseObject]]
  
  inline def default_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[AwardsRequestObject, AwardsResponseObject]]
  
  inline def default_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[EventsRequestObject, EventsResponseObject]]
  
  inline def default_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[MatchesRequestObject, MatchesResponseObject]]
  
  inline def default_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[RankingsRequestObject, RankingsResponseObject]]
  
  inline def default_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject]]
  
  inline def default_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[SkillsRequestObject, SkillsResponseObject]]
  
  inline def default_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LiveEventEmitter[TeamsRequestObject, TeamsResponseObject]]
  
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
  
  type LiveRequestObject[T] = T & Prefetch
}
