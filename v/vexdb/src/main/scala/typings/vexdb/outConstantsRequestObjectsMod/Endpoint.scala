package typings.vexdb.outConstantsRequestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vexdb.vexdbStrings.events
  - typings.vexdb.vexdbStrings.teams
  - typings.vexdb.vexdbStrings.matches
  - typings.vexdb.vexdbStrings.rankings
  - typings.vexdb.vexdbStrings.season_rankings
  - typings.vexdb.vexdbStrings.awards
  - typings.vexdb.vexdbStrings.skills
*/
trait Endpoint extends js.Object

object Endpoint {
  @scala.inline
  def awards: typings.vexdb.vexdbStrings.awards = this.cast("awards")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def events: typings.vexdb.vexdbStrings.events = this.cast("events")
  @scala.inline
  def matches: typings.vexdb.vexdbStrings.matches = this.cast("matches")
  @scala.inline
  def rankings: typings.vexdb.vexdbStrings.rankings = this.cast("rankings")
  @scala.inline
  def season_rankings: typings.vexdb.vexdbStrings.season_rankings = this.cast("season_rankings")
  @scala.inline
  def skills: typings.vexdb.vexdbStrings.skills = this.cast("skills")
  @scala.inline
  def teams: typings.vexdb.vexdbStrings.teams = this.cast("teams")
}

