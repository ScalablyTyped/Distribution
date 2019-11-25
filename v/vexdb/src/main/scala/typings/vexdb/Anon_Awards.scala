package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Awards extends js.Object {
  var awards: js.Array[String]
  var events: js.Array[String]
  var matches: js.Array[String]
  var rankings: js.Array[String]
  var season_rankings: js.Array[String]
  var skills: js.Array[String]
  var teams: js.Array[String]
}

object Anon_Awards {
  @scala.inline
  def apply(
    awards: js.Array[String],
    events: js.Array[String],
    matches: js.Array[String],
    rankings: js.Array[String],
    season_rankings: js.Array[String],
    skills: js.Array[String],
    teams: js.Array[String]
  ): Anon_Awards = {
    val __obj = js.Dynamic.literal(awards = awards.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any], season_rankings = season_rankings.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Awards]
  }
}

