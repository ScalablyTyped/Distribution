package typings
package vexdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Awards extends js.Object {
  var awards: js.Array[java.lang.String]
  var events: js.Array[java.lang.String]
  var matches: js.Array[java.lang.String]
  var rankings: js.Array[java.lang.String]
  var season_rankings: js.Array[java.lang.String]
  var skills: js.Array[java.lang.String]
  var teams: js.Array[java.lang.String]
}

object Anon_Awards {
  @scala.inline
  def apply(
    awards: js.Array[java.lang.String],
    events: js.Array[java.lang.String],
    matches: js.Array[java.lang.String],
    rankings: js.Array[java.lang.String],
    season_rankings: js.Array[java.lang.String],
    skills: js.Array[java.lang.String],
    teams: js.Array[java.lang.String]
  ): Anon_Awards = {
    val __obj = js.Dynamic.literal(awards = awards, events = events, matches = matches, rankings = rankings, season_rankings = season_rankings, skills = skills, teams = teams)
  
    __obj.asInstanceOf[Anon_Awards]
  }
}

