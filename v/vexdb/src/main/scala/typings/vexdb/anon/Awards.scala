package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Awards extends js.Object {
  
  var awards: js.Array[String] = js.native
  
  var events: js.Array[String] = js.native
  
  var matches: js.Array[String] = js.native
  
  var rankings: js.Array[String] = js.native
  
  var season_rankings: js.Array[String] = js.native
  
  var skills: js.Array[String] = js.native
  
  var teams: js.Array[String] = js.native
}
object Awards {
  
  @scala.inline
  def apply(
    awards: js.Array[String],
    events: js.Array[String],
    matches: js.Array[String],
    rankings: js.Array[String],
    season_rankings: js.Array[String],
    skills: js.Array[String],
    teams: js.Array[String]
  ): Awards = {
    val __obj = js.Dynamic.literal(awards = awards.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any], season_rankings = season_rankings.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Awards]
  }
  
  @scala.inline
  implicit class AwardsOps[Self <: Awards] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwardsVarargs(value: String*): Self = this.set("awards", js.Array(value :_*))
    
    @scala.inline
    def setAwards(value: js.Array[String]): Self = this.set("awards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingsVarargs(value: String*): Self = this.set("rankings", js.Array(value :_*))
    
    @scala.inline
    def setRankings(value: js.Array[String]): Self = this.set("rankings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason_rankingsVarargs(value: String*): Self = this.set("season_rankings", js.Array(value :_*))
    
    @scala.inline
    def setSeason_rankings(value: js.Array[String]): Self = this.set("season_rankings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsVarargs(value: String*): Self = this.set("skills", js.Array(value :_*))
    
    @scala.inline
    def setSkills(value: js.Array[String]): Self = this.set("skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = this.set("teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = this.set("teams", value.asInstanceOf[js.Any])
  }
}
