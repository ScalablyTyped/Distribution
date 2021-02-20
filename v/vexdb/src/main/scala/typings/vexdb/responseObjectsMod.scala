package typings.vexdb

import typings.vexdb.requestObjectsMod.Grades
import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.requestObjectsMod.SkillsType
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import typings.vexdb.vexdbNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseObjectsMod {
  
  @js.native
  trait AwardsResponseObject extends ResponseObject {
    
    var name: String = js.native
    
    var order: Double = js.native
    
    var qualifies: js.Array[String] = js.native
    
    var sku: String = js.native
    
    var team: String = js.native
  }
  object AwardsResponseObject {
    
    @scala.inline
    def apply(name: String, order: Double, qualifies: js.Array[String], sku: String, team: String): AwardsResponseObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], qualifies = qualifies.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwardsResponseObject]
    }
    
    @scala.inline
    implicit class AwardsResponseObjectMutableBuilder[Self <: AwardsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifies(value: js.Array[String]): Self = StObject.set(x, "qualifies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiesVarargs(value: String*): Self = StObject.set(x, "qualifies", js.Array(value :_*))
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventsResponseObject extends ResponseObject {
    
    var divisions: js.Array[String] = js.native
    
    var end: String = js.native
    
    var key: String = js.native
    
    var loc_address1: String = js.native
    
    var loc_address2: String = js.native
    
    var loc_city: String = js.native
    
    var loc_country: String = js.native
    
    var loc_postcode: String = js.native
    
    var loc_region: String = js.native
    
    var loc_venue: String = js.native
    
    var name: String = js.native
    
    var program: Programs = js.native
    
    var season: Seasons = js.native
    
    var sku: String = js.native
    
    var start: String = js.native
  }
  object EventsResponseObject {
    
    @scala.inline
    def apply(
      divisions: js.Array[String],
      end: String,
      key: String,
      loc_address1: String,
      loc_address2: String,
      loc_city: String,
      loc_country: String,
      loc_postcode: String,
      loc_region: String,
      loc_venue: String,
      name: String,
      program: Programs,
      season: Seasons,
      sku: String,
      start: String
    ): EventsResponseObject = {
      val __obj = js.Dynamic.literal(divisions = divisions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc_address1 = loc_address1.asInstanceOf[js.Any], loc_address2 = loc_address2.asInstanceOf[js.Any], loc_city = loc_city.asInstanceOf[js.Any], loc_country = loc_country.asInstanceOf[js.Any], loc_postcode = loc_postcode.asInstanceOf[js.Any], loc_region = loc_region.asInstanceOf[js.Any], loc_venue = loc_venue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventsResponseObject]
    }
    
    @scala.inline
    implicit class EventsResponseObjectMutableBuilder[Self <: EventsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivisions(value: js.Array[String]): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisionsVarargs(value: String*): Self = StObject.set(x, "divisions", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_address1(value: String): Self = StObject.set(x, "loc_address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_address2(value: String): Self = StObject.set(x, "loc_address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_city(value: String): Self = StObject.set(x, "loc_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_country(value: String): Self = StObject.set(x, "loc_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_postcode(value: String): Self = StObject.set(x, "loc_postcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_region(value: String): Self = StObject.set(x, "loc_region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_venue(value: String): Self = StObject.set(x, "loc_venue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: Programs): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatchesResponseObject extends ResponseObject {
    
    var blue1: String = js.native
    
    var blue2: String = js.native
    
    var blue3: String = js.native
    
    var bluescore: Double = js.native
    
    var bluesit: String = js.native
    
    var division: String = js.native
    
    var field: String = js.native
    
    var instance: Double = js.native
    
    var matchnum: Double = js.native
    
    var red1: String = js.native
    
    var red2: String = js.native
    
    var red3: String = js.native
    
    var redscore: Double = js.native
    
    var redsit: String = js.native
    
    var round: `1` | `2` | `3` | `4` | `5` | `6` | `16` = js.native
    
    var scheduled: String = js.native
    
    var scored: `0` | `1` = js.native
    
    var sku: String = js.native
  }
  object MatchesResponseObject {
    
    @scala.inline
    def apply(
      blue1: String,
      blue2: String,
      blue3: String,
      bluescore: Double,
      bluesit: String,
      division: String,
      field: String,
      instance: Double,
      matchnum: Double,
      red1: String,
      red2: String,
      red3: String,
      redscore: Double,
      redsit: String,
      round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
      scheduled: String,
      scored: `0` | `1`,
      sku: String
    ): MatchesResponseObject = {
      val __obj = js.Dynamic.literal(blue1 = blue1.asInstanceOf[js.Any], blue2 = blue2.asInstanceOf[js.Any], blue3 = blue3.asInstanceOf[js.Any], bluescore = bluescore.asInstanceOf[js.Any], bluesit = bluesit.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], matchnum = matchnum.asInstanceOf[js.Any], red1 = red1.asInstanceOf[js.Any], red2 = red2.asInstanceOf[js.Any], red3 = red3.asInstanceOf[js.Any], redscore = redscore.asInstanceOf[js.Any], redsit = redsit.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], scored = scored.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchesResponseObject]
    }
    
    @scala.inline
    implicit class MatchesResponseObjectMutableBuilder[Self <: MatchesResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue1(value: String): Self = StObject.set(x, "blue1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue2(value: String): Self = StObject.set(x, "blue2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue3(value: String): Self = StObject.set(x, "blue3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBluescore(value: Double): Self = StObject.set(x, "bluescore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBluesit(value: String): Self = StObject.set(x, "bluesit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: Double): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchnum(value: Double): Self = StObject.set(x, "matchnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed1(value: String): Self = StObject.set(x, "red1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed2(value: String): Self = StObject.set(x, "red2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed3(value: String): Self = StObject.set(x, "red3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedscore(value: Double): Self = StObject.set(x, "redscore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedsit(value: String): Self = StObject.set(x, "redsit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRound(value: `1` | `2` | `3` | `4` | `5` | `6` | `16`): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduled(value: String): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScored(value: `0` | `1`): Self = StObject.set(x, "scored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RankingsResponseObject extends ResponseObject {
    
    var ap: Double = js.native
    
    var ccwm: Double = js.native
    
    var division: String = js.native
    
    var dpr: Double = js.native
    
    var losses: Double = js.native
    
    var max_score: Double = js.native
    
    var opr: Double = js.native
    
    var rank: Double = js.native
    
    var sku: String = js.native
    
    var sp: Double = js.native
    
    var team: String = js.native
    
    var ties: Double = js.native
    
    var trsp: Double = js.native
    
    var wins: Double = js.native
    
    var wp: Double = js.native
  }
  object RankingsResponseObject {
    
    @scala.inline
    def apply(
      ap: Double,
      ccwm: Double,
      division: String,
      dpr: Double,
      losses: Double,
      max_score: Double,
      opr: Double,
      rank: Double,
      sku: String,
      sp: Double,
      team: String,
      ties: Double,
      trsp: Double,
      wins: Double,
      wp: Double
    ): RankingsResponseObject = {
      val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], ccwm = ccwm.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], opr = opr.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], ties = ties.asInstanceOf[js.Any], trsp = trsp.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RankingsResponseObject]
    }
    
    @scala.inline
    implicit class RankingsResponseObjectMutableBuilder[Self <: RankingsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAp(value: Double): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcwm(value: Double): Self = StObject.set(x, "ccwm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpr(value: Double): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_score(value: Double): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpr(value: Double): Self = StObject.set(x, "opr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSp(value: Double): Self = StObject.set(x, "sp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTies(value: Double): Self = StObject.set(x, "ties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrsp(value: Double): Self = StObject.set(x, "trsp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWp(value: Double): Self = StObject.set(x, "wp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.responseObjectsMod.TeamsResponseObject
    - typings.vexdb.responseObjectsMod.EventsResponseObject
    - typings.vexdb.responseObjectsMod.MatchesResponseObject
    - typings.vexdb.responseObjectsMod.RankingsResponseObject
    - typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
    - typings.vexdb.responseObjectsMod.AwardsResponseObject
    - typings.vexdb.responseObjectsMod.SkillsResponseObject
  */
  trait ResponseObject extends StObject
  object ResponseObject {
    
    @scala.inline
    def AwardsResponseObject(name: String, order: Double, qualifies: js.Array[String], sku: String, team: String): typings.vexdb.responseObjectsMod.AwardsResponseObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], qualifies = qualifies.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.AwardsResponseObject]
    }
    
    @scala.inline
    def EventsResponseObject(
      divisions: js.Array[String],
      end: String,
      key: String,
      loc_address1: String,
      loc_address2: String,
      loc_city: String,
      loc_country: String,
      loc_postcode: String,
      loc_region: String,
      loc_venue: String,
      name: String,
      program: Programs,
      season: Seasons,
      sku: String,
      start: String
    ): typings.vexdb.responseObjectsMod.EventsResponseObject = {
      val __obj = js.Dynamic.literal(divisions = divisions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc_address1 = loc_address1.asInstanceOf[js.Any], loc_address2 = loc_address2.asInstanceOf[js.Any], loc_city = loc_city.asInstanceOf[js.Any], loc_country = loc_country.asInstanceOf[js.Any], loc_postcode = loc_postcode.asInstanceOf[js.Any], loc_region = loc_region.asInstanceOf[js.Any], loc_venue = loc_venue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.EventsResponseObject]
    }
    
    @scala.inline
    def MatchesResponseObject(
      blue1: String,
      blue2: String,
      blue3: String,
      bluescore: Double,
      bluesit: String,
      division: String,
      field: String,
      instance: Double,
      matchnum: Double,
      red1: String,
      red2: String,
      red3: String,
      redscore: Double,
      redsit: String,
      round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
      scheduled: String,
      scored: `0` | `1`,
      sku: String
    ): typings.vexdb.responseObjectsMod.MatchesResponseObject = {
      val __obj = js.Dynamic.literal(blue1 = blue1.asInstanceOf[js.Any], blue2 = blue2.asInstanceOf[js.Any], blue3 = blue3.asInstanceOf[js.Any], bluescore = bluescore.asInstanceOf[js.Any], bluesit = bluesit.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], matchnum = matchnum.asInstanceOf[js.Any], red1 = red1.asInstanceOf[js.Any], red2 = red2.asInstanceOf[js.Any], red3 = red3.asInstanceOf[js.Any], redscore = redscore.asInstanceOf[js.Any], redsit = redsit.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], scored = scored.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.MatchesResponseObject]
    }
    
    @scala.inline
    def RankingsResponseObject(
      ap: Double,
      ccwm: Double,
      division: String,
      dpr: Double,
      losses: Double,
      max_score: Double,
      opr: Double,
      rank: Double,
      sku: String,
      sp: Double,
      team: String,
      ties: Double,
      trsp: Double,
      wins: Double,
      wp: Double
    ): typings.vexdb.responseObjectsMod.RankingsResponseObject = {
      val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], ccwm = ccwm.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], opr = opr.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], ties = ties.asInstanceOf[js.Any], trsp = trsp.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.RankingsResponseObject]
    }
    
    @scala.inline
    def SeasonRankingsResponseObject(program: Programs, season: Seasons, team: String, vrating: Double, vrating_rank: Double): typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject = {
      val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject]
    }
    
    @scala.inline
    def SkillsResponseObject(
      attempts: Double,
      program: Programs,
      rank: Double,
      score: Double,
      sku: String,
      team: String,
      `type`: SkillsType
    ): typings.vexdb.responseObjectsMod.SkillsResponseObject = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.SkillsResponseObject]
    }
    
    @scala.inline
    def TeamsResponseObject(
      city: String,
      country: String,
      grade: Grades,
      is_registered: `0` | `1`,
      number: String,
      organisation: String,
      program: Programs,
      region: String,
      robot_name: String,
      team_name: String
    ): typings.vexdb.responseObjectsMod.TeamsResponseObject = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], grade = grade.asInstanceOf[js.Any], is_registered = is_registered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organisation = organisation.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], robot_name = robot_name.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vexdb.responseObjectsMod.TeamsResponseObject]
    }
  }
  
  @js.native
  trait SeasonRankingsResponseObject extends ResponseObject {
    
    var program: Programs = js.native
    
    var season: Seasons = js.native
    
    var team: String = js.native
    
    var vrating: Double = js.native
    
    var vrating_rank: Double = js.native
  }
  object SeasonRankingsResponseObject {
    
    @scala.inline
    def apply(program: Programs, season: Seasons, team: String, vrating: Double, vrating_rank: Double): SeasonRankingsResponseObject = {
      val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeasonRankingsResponseObject]
    }
    
    @scala.inline
    implicit class SeasonRankingsResponseObjectMutableBuilder[Self <: SeasonRankingsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgram(value: Programs): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrating(value: Double): Self = StObject.set(x, "vrating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrating_rank(value: Double): Self = StObject.set(x, "vrating_rank", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SkillsResponseObject extends ResponseObject {
    
    var attempts: Double = js.native
    
    var program: Programs = js.native
    
    var rank: Double = js.native
    
    var score: Double = js.native
    
    var sku: String = js.native
    
    var team: String = js.native
    
    var `type`: SkillsType = js.native
  }
  object SkillsResponseObject {
    
    @scala.inline
    def apply(
      attempts: Double,
      program: Programs,
      rank: Double,
      score: Double,
      sku: String,
      team: String,
      `type`: SkillsType
    ): SkillsResponseObject = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkillsResponseObject]
    }
    
    @scala.inline
    implicit class SkillsResponseObjectMutableBuilder[Self <: SkillsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: Programs): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SkillsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TeamsResponseObject extends ResponseObject {
    
    var city: String = js.native
    
    var country: String = js.native
    
    var grade: Grades = js.native
    
    var is_registered: `0` | `1` = js.native
    
    var number: String = js.native
    
    var organisation: String = js.native
    
    var program: Programs = js.native
    
    var region: String = js.native
    
    var robot_name: String = js.native
    
    var team_name: String = js.native
  }
  object TeamsResponseObject {
    
    @scala.inline
    def apply(
      city: String,
      country: String,
      grade: Grades,
      is_registered: `0` | `1`,
      number: String,
      organisation: String,
      program: Programs,
      region: String,
      robot_name: String,
      team_name: String
    ): TeamsResponseObject = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], grade = grade.asInstanceOf[js.Any], is_registered = is_registered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organisation = organisation.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], robot_name = robot_name.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamsResponseObject]
    }
    
    @scala.inline
    implicit class TeamsResponseObjectMutableBuilder[Self <: TeamsResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrade(value: Grades): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_registered(value: `0` | `1`): Self = StObject.set(x, "is_registered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganisation(value: String): Self = StObject.set(x, "organisation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: Programs): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRobot_name(value: String): Self = StObject.set(x, "robot_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam_name(value: String): Self = StObject.set(x, "team_name", value.asInstanceOf[js.Any])
    }
  }
}
