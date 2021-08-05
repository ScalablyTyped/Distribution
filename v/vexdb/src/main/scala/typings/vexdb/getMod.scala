package typings.vexdb

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("vexdb/out/methods/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AwardsResponseObject]]]
  
  inline def default_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[EventsResponseObject]]]
  
  inline def default_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MatchesResponseObject]]]
  
  inline def default_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RankingsResponseObject]]]
  
  inline def default_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SeasonRankingsResponseObject]]]
  
  inline def default_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SkillsResponseObject]]]
  
  inline def default_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TeamsResponseObject]]]
}
