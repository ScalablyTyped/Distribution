package typings.vexdb

import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.responseObjectsMod.TeamsResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import typings.vexdb.vexdbStrings.`type`
import typings.vexdb.vexdbStrings.ap
import typings.vexdb.vexdbStrings.attempts
import typings.vexdb.vexdbStrings.blue1
import typings.vexdb.vexdbStrings.blue2
import typings.vexdb.vexdbStrings.blue3
import typings.vexdb.vexdbStrings.bluescore
import typings.vexdb.vexdbStrings.bluesit
import typings.vexdb.vexdbStrings.ccwm
import typings.vexdb.vexdbStrings.city
import typings.vexdb.vexdbStrings.country
import typings.vexdb.vexdbStrings.division
import typings.vexdb.vexdbStrings.dpr
import typings.vexdb.vexdbStrings.end
import typings.vexdb.vexdbStrings.field
import typings.vexdb.vexdbStrings.instance
import typings.vexdb.vexdbStrings.key
import typings.vexdb.vexdbStrings.loc_address1
import typings.vexdb.vexdbStrings.loc_address2
import typings.vexdb.vexdbStrings.loc_city
import typings.vexdb.vexdbStrings.loc_country
import typings.vexdb.vexdbStrings.loc_postcode
import typings.vexdb.vexdbStrings.loc_region
import typings.vexdb.vexdbStrings.loc_venue
import typings.vexdb.vexdbStrings.losses
import typings.vexdb.vexdbStrings.matchnum
import typings.vexdb.vexdbStrings.max_score
import typings.vexdb.vexdbStrings.name
import typings.vexdb.vexdbStrings.number
import typings.vexdb.vexdbStrings.opr
import typings.vexdb.vexdbStrings.order
import typings.vexdb.vexdbStrings.organisation
import typings.vexdb.vexdbStrings.program
import typings.vexdb.vexdbStrings.rank
import typings.vexdb.vexdbStrings.red1
import typings.vexdb.vexdbStrings.red2
import typings.vexdb.vexdbStrings.red3
import typings.vexdb.vexdbStrings.redscore
import typings.vexdb.vexdbStrings.redsit
import typings.vexdb.vexdbStrings.region
import typings.vexdb.vexdbStrings.robot_name
import typings.vexdb.vexdbStrings.scheduled
import typings.vexdb.vexdbStrings.score
import typings.vexdb.vexdbStrings.season
import typings.vexdb.vexdbStrings.sku
import typings.vexdb.vexdbStrings.sp
import typings.vexdb.vexdbStrings.start
import typings.vexdb.vexdbStrings.team
import typings.vexdb.vexdbStrings.team_name
import typings.vexdb.vexdbStrings.ties
import typings.vexdb.vexdbStrings.trsp
import typings.vexdb.vexdbStrings.vrating
import typings.vexdb.vexdbStrings.vrating_rank
import typings.vexdb.vexdbStrings.wins
import typings.vexdb.vexdbStrings.wp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestObjectsMod {
  
  @js.native
  sealed trait SkillsType extends StObject
  @JSImport("vexdb/out/constants/RequestObjects", "SkillsType")
  @js.native
  object SkillsType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SkillsType with Double] = js.native
    
    @js.native
    sealed trait Driver extends SkillsType
    /* 0 */ val Driver: typings.vexdb.requestObjectsMod.SkillsType.Driver with Double = js.native
    
    @js.native
    sealed trait Programming extends SkillsType
    /* 1 */ val Programming: typings.vexdb.requestObjectsMod.SkillsType.Programming with Double = js.native
    
    @js.native
    sealed trait Robot extends SkillsType
    /* 2 */ val Robot: typings.vexdb.requestObjectsMod.SkillsType.Robot with Double = js.native
  }
  
  @JSImport("vexdb/out/constants/RequestObjects", "endpoints")
  @js.native
  val endpoints: js.Array[Endpoint] = js.native
  
  object passableParams {
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.awards")
    @js.native
    def awards: js.Array[String] = js.native
    @scala.inline
    def awards_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("awards")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.events")
    @js.native
    def events: js.Array[String] = js.native
    @scala.inline
    def events_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.matches")
    @js.native
    def matches: js.Array[String] = js.native
    @scala.inline
    def matches_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matches")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.rankings")
    @js.native
    def rankings: js.Array[String] = js.native
    @scala.inline
    def rankings_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rankings")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.season_rankings")
    @js.native
    def seasonRankings: js.Array[String] = js.native
    
    @scala.inline
    def seasonRankings_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("season_rankings")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.skills")
    @js.native
    def skills: js.Array[String] = js.native
    @scala.inline
    def skills_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skills")(x.asInstanceOf[js.Any])
    
    @JSImport("vexdb/out/constants/RequestObjects", "passableParams.teams")
    @js.native
    def teams: js.Array[String] = js.native
    @scala.inline
    def teams_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teams")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AwardsRequestObject extends RequestObject {
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.name, String]] = js.native
    
    var order: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.order, Double]] = js.native
    
    var season: js.UndefOr[Seasons] = js.native
    
    var sku: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
    
    var team: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
  }
  object AwardsRequestObject {
    
    @scala.inline
    def apply(): AwardsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwardsRequestObject]
    }
    
    @scala.inline
    implicit class AwardsRequestObjectMutableBuilder[Self <: AwardsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setName(value: Filter[AwardsResponseObject, name, String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "name", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrder(value: Filter[AwardsResponseObject, order, Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setSku(value: Filter[AwardsResponseObject, sku, String]): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "sku", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setTeam(value: Filter[AwardsResponseObject, team, String]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "team", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.vexdbStrings.events
    - typings.vexdb.vexdbStrings.teams
    - typings.vexdb.vexdbStrings.matches
    - typings.vexdb.vexdbStrings.rankings
    - typings.vexdb.vexdbStrings.season_rankings
    - typings.vexdb.vexdbStrings.awards
    - typings.vexdb.vexdbStrings.skills
  */
  trait Endpoint extends StObject
  object Endpoint {
    
    @scala.inline
    def awards: typings.vexdb.vexdbStrings.awards = "awards".asInstanceOf[typings.vexdb.vexdbStrings.awards]
    
    @scala.inline
    def events: typings.vexdb.vexdbStrings.events = "events".asInstanceOf[typings.vexdb.vexdbStrings.events]
    
    @scala.inline
    def matches: typings.vexdb.vexdbStrings.matches = "matches".asInstanceOf[typings.vexdb.vexdbStrings.matches]
    
    @scala.inline
    def rankings: typings.vexdb.vexdbStrings.rankings = "rankings".asInstanceOf[typings.vexdb.vexdbStrings.rankings]
    
    @scala.inline
    def season_rankings: typings.vexdb.vexdbStrings.season_rankings = "season_rankings".asInstanceOf[typings.vexdb.vexdbStrings.season_rankings]
    
    @scala.inline
    def skills: typings.vexdb.vexdbStrings.skills = "skills".asInstanceOf[typings.vexdb.vexdbStrings.skills]
    
    @scala.inline
    def teams: typings.vexdb.vexdbStrings.teams = "teams".asInstanceOf[typings.vexdb.vexdbStrings.teams]
  }
  
  @js.native
  trait EventsRequestObject extends RequestObject {
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var date: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.end, String]] = js.native
    
    var key: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.key, String]] = js.native
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var loc_address1: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_address1, String]] = js.native
    
    var loc_address2: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_address2, String]] = js.native
    
    var loc_city: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_city, String]] = js.native
    
    var loc_country: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_country, String]] = js.native
    
    var loc_postcode: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_postcode, String]] = js.native
    
    var loc_region: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_region, String]] = js.native
    
    var loc_venue: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_venue, String]] = js.native
    
    var name: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.name, String]] = js.native
    
    var program: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var season: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.season, Seasons]] = js.native
    
    var sku: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.start, String]] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var team: js.UndefOr[String] = js.native
  }
  object EventsRequestObject {
    
    @scala.inline
    def apply(): EventsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventsRequestObject]
    }
    
    @scala.inline
    implicit class EventsRequestObjectMutableBuilder[Self <: EventsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setEnd(value: Filter[EventsResponseObject, end, String]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setKey(value: Filter[EventsResponseObject, key, String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "key", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setLoc_address1(value: Filter[EventsResponseObject, loc_address1, String]): Self = StObject.set(x, "loc_address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_address1Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_address1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_address1Undefined: Self = StObject.set(x, "loc_address1", js.undefined)
      
      @scala.inline
      def setLoc_address2(value: Filter[EventsResponseObject, loc_address2, String]): Self = StObject.set(x, "loc_address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_address2Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_address2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_address2Undefined: Self = StObject.set(x, "loc_address2", js.undefined)
      
      @scala.inline
      def setLoc_city(value: Filter[EventsResponseObject, loc_city, String]): Self = StObject.set(x, "loc_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_cityFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_city", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_cityUndefined: Self = StObject.set(x, "loc_city", js.undefined)
      
      @scala.inline
      def setLoc_country(value: Filter[EventsResponseObject, loc_country, String]): Self = StObject.set(x, "loc_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_countryFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_country", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_countryUndefined: Self = StObject.set(x, "loc_country", js.undefined)
      
      @scala.inline
      def setLoc_postcode(value: Filter[EventsResponseObject, loc_postcode, String]): Self = StObject.set(x, "loc_postcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_postcodeFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_postcode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_postcodeUndefined: Self = StObject.set(x, "loc_postcode", js.undefined)
      
      @scala.inline
      def setLoc_region(value: Filter[EventsResponseObject, loc_region, String]): Self = StObject.set(x, "loc_region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_regionFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_region", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_regionUndefined: Self = StObject.set(x, "loc_region", js.undefined)
      
      @scala.inline
      def setLoc_venue(value: Filter[EventsResponseObject, loc_venue, String]): Self = StObject.set(x, "loc_venue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc_venueFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "loc_venue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoc_venueUndefined: Self = StObject.set(x, "loc_venue", js.undefined)
      
      @scala.inline
      def setName(value: Filter[EventsResponseObject, name, String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "name", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProgram(value: Filter[EventsResponseObject, program, Programs]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "program", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSeason(value: Filter[EventsResponseObject, season, Seasons]): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "season", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setStart(value: Filter[EventsResponseObject, start, String]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  type Filter[ResponseObject, Key /* <: /* keyof ResponseObject */ String */, Direct /* <: /* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ js.Any */] = (js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, 
    /* full */ ResponseObject, 
    js.Promise[Boolean] | Boolean
  ]) | Direct
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.vexdbStrings.`Middle School`
    - typings.vexdb.vexdbStrings.`High School`
    - typings.vexdb.vexdbStrings.Collge
  */
  trait Grades extends StObject
  object Grades {
    
    @scala.inline
    def Collge: typings.vexdb.vexdbStrings.Collge = "Collge".asInstanceOf[typings.vexdb.vexdbStrings.Collge]
    
    @scala.inline
    def `High School`: typings.vexdb.vexdbStrings.`High School` = ("High School").asInstanceOf[typings.vexdb.vexdbStrings.`High School`]
    
    @scala.inline
    def `Middle School`: typings.vexdb.vexdbStrings.`Middle School` = ("Middle School").asInstanceOf[typings.vexdb.vexdbStrings.`Middle School`]
  }
  
  @js.native
  trait MatchesRequestObject extends RequestObject {
    
    var blue1: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue1, String]] = js.native
    
    var blue2: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue2, String]] = js.native
    
    var blue3: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue3, String]] = js.native
    
    var bluescore: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.bluescore, Double]] = js.native
    
    var bluesit: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.bluesit, String]] = js.native
    
    var division: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.division, String]] = js.native
    
    var field: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.field, String]] = js.native
    
    var instance: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.instance, Double]] = js.native
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var matchnum: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.matchnum, Double]] = js.native
    
    var red1: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red1, String]] = js.native
    
    var red2: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red2, String]] = js.native
    
    var red3: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red3, String]] = js.native
    
    var redscore: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.redscore, Double]] = js.native
    
    var redsit: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.redsit, String]] = js.native
    
    var round: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `16`] = js.native
    
    var scheduled: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.scheduled, String]] = js.native
    
    var scored: js.UndefOr[`0` | `1`] = js.native
    
    var season: js.UndefOr[Seasons] = js.native
    
    var sku: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
    
    var team: js.UndefOr[String] = js.native
  }
  object MatchesRequestObject {
    
    @scala.inline
    def apply(): MatchesRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchesRequestObject]
    }
    
    @scala.inline
    implicit class MatchesRequestObjectMutableBuilder[Self <: MatchesRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue1(value: Filter[MatchesResponseObject, blue1, String]): Self = StObject.set(x, "blue1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue1Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "blue1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlue1Undefined: Self = StObject.set(x, "blue1", js.undefined)
      
      @scala.inline
      def setBlue2(value: Filter[MatchesResponseObject, blue2, String]): Self = StObject.set(x, "blue2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue2Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "blue2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlue2Undefined: Self = StObject.set(x, "blue2", js.undefined)
      
      @scala.inline
      def setBlue3(value: Filter[MatchesResponseObject, blue3, String]): Self = StObject.set(x, "blue3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue3Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "blue3", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlue3Undefined: Self = StObject.set(x, "blue3", js.undefined)
      
      @scala.inline
      def setBluescore(value: Filter[MatchesResponseObject, bluescore, Double]): Self = StObject.set(x, "bluescore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBluescoreFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "bluescore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBluescoreUndefined: Self = StObject.set(x, "bluescore", js.undefined)
      
      @scala.inline
      def setBluesit(value: Filter[MatchesResponseObject, bluesit, String]): Self = StObject.set(x, "bluesit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBluesitFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "bluesit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBluesitUndefined: Self = StObject.set(x, "bluesit", js.undefined)
      
      @scala.inline
      def setDivision(value: Filter[MatchesResponseObject, division, String]): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisionFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "division", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
      
      @scala.inline
      def setField(value: Filter[MatchesResponseObject, field, String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "field", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setInstance(value: Filter[MatchesResponseObject, instance, Double]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "instance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setMatchnum(value: Filter[MatchesResponseObject, matchnum, Double]): Self = StObject.set(x, "matchnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchnumFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "matchnum", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatchnumUndefined: Self = StObject.set(x, "matchnum", js.undefined)
      
      @scala.inline
      def setRed1(value: Filter[MatchesResponseObject, red1, String]): Self = StObject.set(x, "red1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed1Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "red1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRed1Undefined: Self = StObject.set(x, "red1", js.undefined)
      
      @scala.inline
      def setRed2(value: Filter[MatchesResponseObject, red2, String]): Self = StObject.set(x, "red2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed2Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "red2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRed2Undefined: Self = StObject.set(x, "red2", js.undefined)
      
      @scala.inline
      def setRed3(value: Filter[MatchesResponseObject, red3, String]): Self = StObject.set(x, "red3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed3Function2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "red3", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRed3Undefined: Self = StObject.set(x, "red3", js.undefined)
      
      @scala.inline
      def setRedscore(value: Filter[MatchesResponseObject, redscore, Double]): Self = StObject.set(x, "redscore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedscoreFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "redscore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedscoreUndefined: Self = StObject.set(x, "redscore", js.undefined)
      
      @scala.inline
      def setRedsit(value: Filter[MatchesResponseObject, redsit, String]): Self = StObject.set(x, "redsit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedsitFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "redsit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedsitUndefined: Self = StObject.set(x, "redsit", js.undefined)
      
      @scala.inline
      def setRound(value: `1` | `2` | `3` | `4` | `5` | `16`): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setScheduled(value: Filter[MatchesResponseObject, scheduled, String]): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduledFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "scheduled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScheduledUndefined: Self = StObject.set(x, "scheduled", js.undefined)
      
      @scala.inline
      def setScored(value: `0` | `1`): Self = StObject.set(x, "scored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoredUndefined: Self = StObject.set(x, "scored", js.undefined)
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setSku(value: Filter[MatchesResponseObject, sku, String]): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "sku", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.vexdbStrings.VEXU
    - typings.vexdb.vexdbStrings.VRC
  */
  trait Programs extends StObject
  object Programs {
    
    @scala.inline
    def VEXU: typings.vexdb.vexdbStrings.VEXU = "VEXU".asInstanceOf[typings.vexdb.vexdbStrings.VEXU]
    
    @scala.inline
    def VRC: typings.vexdb.vexdbStrings.VRC = "VRC".asInstanceOf[typings.vexdb.vexdbStrings.VRC]
  }
  
  @js.native
  trait RankingsRequestObject extends RequestObject {
    
    var ap: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ap, Double]] = js.native
    
    var ccwm: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ccwm, Double]] = js.native
    
    var division: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.division, String]] = js.native
    
    var dpr: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.dpr, Double]] = js.native
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var losses: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.losses, Double]] = js.native
    
    var max_score: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.max_score, Double]] = js.native
    
    var opr: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.opr, Double]] = js.native
    
    var rank: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.rank, Double]] = js.native
    
    var season: js.UndefOr[Seasons] = js.native
    
    var sku: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
    
    var sp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.sp, Double]] = js.native
    
    var team: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
    
    var ties: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ties, Double]] = js.native
    
    var trsp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.trsp, Double]] = js.native
    
    var wins: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.wins, Double]] = js.native
    
    var wp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.wp, Double]] = js.native
  }
  object RankingsRequestObject {
    
    @scala.inline
    def apply(): RankingsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RankingsRequestObject]
    }
    
    @scala.inline
    implicit class RankingsRequestObjectMutableBuilder[Self <: RankingsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAp(value: Filter[RankingsResponseObject, ap, Double]): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApUndefined: Self = StObject.set(x, "ap", js.undefined)
      
      @scala.inline
      def setCcwm(value: Filter[RankingsResponseObject, ccwm, Double]): Self = StObject.set(x, "ccwm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcwmFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "ccwm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCcwmUndefined: Self = StObject.set(x, "ccwm", js.undefined)
      
      @scala.inline
      def setDivision(value: Filter[RankingsResponseObject, division, String]): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisionFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "division", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
      
      @scala.inline
      def setDpr(value: Filter[RankingsResponseObject, dpr, Double]): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDprFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "dpr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDprUndefined: Self = StObject.set(x, "dpr", js.undefined)
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setLosses(value: Filter[RankingsResponseObject, losses, Double]): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLossesFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "losses", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLossesUndefined: Self = StObject.set(x, "losses", js.undefined)
      
      @scala.inline
      def setMax_score(value: Filter[RankingsResponseObject, max_score, Double]): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_scoreFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "max_score", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMax_scoreUndefined: Self = StObject.set(x, "max_score", js.undefined)
      
      @scala.inline
      def setOpr(value: Filter[RankingsResponseObject, opr, Double]): Self = StObject.set(x, "opr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOprFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "opr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOprUndefined: Self = StObject.set(x, "opr", js.undefined)
      
      @scala.inline
      def setRank(value: Filter[RankingsResponseObject, rank, Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "rank", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setSku(value: Filter[RankingsResponseObject, sku, String]): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "sku", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setSp(value: Filter[RankingsResponseObject, sp, Double]): Self = StObject.set(x, "sp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "sp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSpUndefined: Self = StObject.set(x, "sp", js.undefined)
      
      @scala.inline
      def setTeam(value: Filter[RankingsResponseObject, team, String]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "team", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setTies(value: Filter[RankingsResponseObject, ties, Double]): Self = StObject.set(x, "ties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiesFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "ties", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTiesUndefined: Self = StObject.set(x, "ties", js.undefined)
      
      @scala.inline
      def setTrsp(value: Filter[RankingsResponseObject, trsp, Double]): Self = StObject.set(x, "trsp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrspFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "trsp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrspUndefined: Self = StObject.set(x, "trsp", js.undefined)
      
      @scala.inline
      def setWins(value: Filter[RankingsResponseObject, wins, Double]): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWinsFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "wins", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWinsUndefined: Self = StObject.set(x, "wins", js.undefined)
      
      @scala.inline
      def setWp(value: Filter[RankingsResponseObject, wp, Double]): Self = StObject.set(x, "wp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWpFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "wp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWpUndefined: Self = StObject.set(x, "wp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.requestObjectsMod.TeamsRequestObject
    - typings.vexdb.requestObjectsMod.EventsRequestObject
    - typings.vexdb.requestObjectsMod.MatchesRequestObject
    - typings.vexdb.requestObjectsMod.RankingsRequestObject
    - typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
    - typings.vexdb.requestObjectsMod.AwardsRequestObject
    - typings.vexdb.requestObjectsMod.SkillsRequestObject
  */
  trait RequestObject extends StObject
  object RequestObject {
    
    @scala.inline
    def AwardsRequestObject(): typings.vexdb.requestObjectsMod.AwardsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.AwardsRequestObject]
    }
    
    @scala.inline
    def EventsRequestObject(): typings.vexdb.requestObjectsMod.EventsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.EventsRequestObject]
    }
    
    @scala.inline
    def MatchesRequestObject(): typings.vexdb.requestObjectsMod.MatchesRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.MatchesRequestObject]
    }
    
    @scala.inline
    def RankingsRequestObject(): typings.vexdb.requestObjectsMod.RankingsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.RankingsRequestObject]
    }
    
    @scala.inline
    def SeasonRankingsRequestObject(): typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject]
    }
    
    @scala.inline
    def SkillsRequestObject(): typings.vexdb.requestObjectsMod.SkillsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.SkillsRequestObject]
    }
    
    @scala.inline
    def TeamsRequestObject(): typings.vexdb.requestObjectsMod.TeamsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vexdb.requestObjectsMod.TeamsRequestObject]
    }
  }
  
  @js.native
  trait SeasonRankingsRequestObject extends RequestObject {
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var program: js.UndefOr[
        Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.program, Programs]
      ] = js.native
    
    var season: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.season, Seasons]] = js.native
    
    var team: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
    
    var vrating: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.vrating, Double]] = js.native
    
    var vrating_rank: js.UndefOr[
        Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.vrating_rank, Double]
      ] = js.native
  }
  object SeasonRankingsRequestObject {
    
    @scala.inline
    def apply(): SeasonRankingsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeasonRankingsRequestObject]
    }
    
    @scala.inline
    implicit class SeasonRankingsRequestObjectMutableBuilder[Self <: SeasonRankingsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setProgram(value: Filter[SeasonRankingsResponseObject, program, Programs]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "program", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setSeason(value: Filter[SeasonRankingsResponseObject, season, Seasons]): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "season", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setTeam(value: Filter[SeasonRankingsResponseObject, team, String]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "team", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setVrating(value: Filter[SeasonRankingsResponseObject, vrating, Double]): Self = StObject.set(x, "vrating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVratingFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "vrating", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVratingUndefined: Self = StObject.set(x, "vrating", js.undefined)
      
      @scala.inline
      def setVrating_rank(value: Filter[SeasonRankingsResponseObject, vrating_rank, Double]): Self = StObject.set(x, "vrating_rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrating_rankFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "vrating_rank", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVrating_rankUndefined: Self = StObject.set(x, "vrating_rank", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vexdb.vexdbStrings.`Change Up`
    - typings.vexdb.vexdbStrings.`Tower Takeover`
    - typings.vexdb.vexdbStrings.`Turning Point`
    - typings.vexdb.vexdbStrings.`In The Zone`
    - typings.vexdb.vexdbStrings.StarStruck
    - typings.vexdb.vexdbStrings.`Nothing But Net`
    - typings.vexdb.vexdbStrings.Skyrise
    - typings.vexdb.vexdbStrings.`Toss Up`
    - typings.vexdb.vexdbStrings.`Sack Attack`
    - typings.vexdb.vexdbStrings.Gateway
    - typings.vexdb.vexdbStrings.`Round Up`
    - typings.vexdb.vexdbStrings.`Clean Sweep`
    - typings.vexdb.vexdbStrings.Elevation
    - typings.vexdb.vexdbStrings.`Bridge Battle`
    - typings.vexdb.vexdbStrings.current
  */
  trait Seasons extends StObject
  object Seasons {
    
    @scala.inline
    def `Bridge Battle`: typings.vexdb.vexdbStrings.`Bridge Battle` = ("Bridge Battle").asInstanceOf[typings.vexdb.vexdbStrings.`Bridge Battle`]
    
    @scala.inline
    def `Change Up`: typings.vexdb.vexdbStrings.`Change Up` = ("Change Up").asInstanceOf[typings.vexdb.vexdbStrings.`Change Up`]
    
    @scala.inline
    def `Clean Sweep`: typings.vexdb.vexdbStrings.`Clean Sweep` = ("Clean Sweep").asInstanceOf[typings.vexdb.vexdbStrings.`Clean Sweep`]
    
    @scala.inline
    def Elevation: typings.vexdb.vexdbStrings.Elevation = "Elevation".asInstanceOf[typings.vexdb.vexdbStrings.Elevation]
    
    @scala.inline
    def Gateway: typings.vexdb.vexdbStrings.Gateway = "Gateway".asInstanceOf[typings.vexdb.vexdbStrings.Gateway]
    
    @scala.inline
    def `In The Zone`: typings.vexdb.vexdbStrings.`In The Zone` = ("In The Zone").asInstanceOf[typings.vexdb.vexdbStrings.`In The Zone`]
    
    @scala.inline
    def `Nothing But Net`: typings.vexdb.vexdbStrings.`Nothing But Net` = ("Nothing But Net").asInstanceOf[typings.vexdb.vexdbStrings.`Nothing But Net`]
    
    @scala.inline
    def `Round Up`: typings.vexdb.vexdbStrings.`Round Up` = ("Round Up").asInstanceOf[typings.vexdb.vexdbStrings.`Round Up`]
    
    @scala.inline
    def `Sack Attack`: typings.vexdb.vexdbStrings.`Sack Attack` = ("Sack Attack").asInstanceOf[typings.vexdb.vexdbStrings.`Sack Attack`]
    
    @scala.inline
    def Skyrise: typings.vexdb.vexdbStrings.Skyrise = "Skyrise".asInstanceOf[typings.vexdb.vexdbStrings.Skyrise]
    
    @scala.inline
    def StarStruck: typings.vexdb.vexdbStrings.StarStruck = "StarStruck".asInstanceOf[typings.vexdb.vexdbStrings.StarStruck]
    
    @scala.inline
    def `Toss Up`: typings.vexdb.vexdbStrings.`Toss Up` = ("Toss Up").asInstanceOf[typings.vexdb.vexdbStrings.`Toss Up`]
    
    @scala.inline
    def `Tower Takeover`: typings.vexdb.vexdbStrings.`Tower Takeover` = ("Tower Takeover").asInstanceOf[typings.vexdb.vexdbStrings.`Tower Takeover`]
    
    @scala.inline
    def `Turning Point`: typings.vexdb.vexdbStrings.`Turning Point` = ("Turning Point").asInstanceOf[typings.vexdb.vexdbStrings.`Turning Point`]
    
    @scala.inline
    def current: typings.vexdb.vexdbStrings.current = "current".asInstanceOf[typings.vexdb.vexdbStrings.current]
  }
  
  @js.native
  trait SkillsRequestObject extends RequestObject {
    
    var attempts: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.attempts, Double]] = js.native
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var program: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
    
    var rank: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.rank, Double]] = js.native
    
    var score: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.score, Double]] = js.native
    
    var season: js.UndefOr[Seasons] = js.native
    
    var season_rank: js.UndefOr[Double] = js.native
    
    var sku: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
    
    var team: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
    
    var `type`: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.`type`, SkillsType]] = js.native
  }
  object SkillsRequestObject {
    
    @scala.inline
    def apply(): SkillsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkillsRequestObject]
    }
    
    @scala.inline
    implicit class SkillsRequestObjectMutableBuilder[Self <: SkillsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Filter[SkillsResponseObject, attempts, Double]): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "attempts", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setProgram(value: Filter[SkillsResponseObject, program, Programs]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "program", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setRank(value: Filter[SkillsResponseObject, rank, Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "rank", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      @scala.inline
      def setScore(value: Filter[SkillsResponseObject, score, Double]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "score", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      @scala.inline
      def setSeason(value: Seasons): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      @scala.inline
      def setSeason_rank(value: Double): Self = StObject.set(x, "season_rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeason_rankUndefined: Self = StObject.set(x, "season_rank", js.undefined)
      
      @scala.inline
      def setSku(value: Filter[SkillsResponseObject, sku, String]): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "sku", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setTeam(value: Filter[SkillsResponseObject, team, String]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "team", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setType(value: Filter[SkillsResponseObject, `type`, SkillsType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TeamsRequestObject extends RequestObject {
    
    var city: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.city, String]] = js.native
    
    var country: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.country, String]] = js.native
    
    var grade: js.UndefOr[Filter[TeamsResponseObject, country, Grades]] = js.native
    
    var is_registered: js.UndefOr[`0` | `1`] = js.native
    
    var limit_number: js.UndefOr[Double] = js.native
    
    var limit_start: js.UndefOr[Double] = js.native
    
    var number: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.number, String]] = js.native
    
    var organisation: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.organisation, String]] = js.native
    
    var program: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
    
    var region: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.region, String]] = js.native
    
    var robot_name: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.robot_name, String]] = js.native
    
    var sku: js.UndefOr[String] = js.native
    
    var team: js.UndefOr[String] = js.native
    
    var team_name: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.team_name, String]] = js.native
  }
  object TeamsRequestObject {
    
    @scala.inline
    def apply(): TeamsRequestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TeamsRequestObject]
    }
    
    @scala.inline
    implicit class TeamsRequestObjectMutableBuilder[Self <: TeamsRequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: Filter[TeamsResponseObject, city, String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "city", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: Filter[TeamsResponseObject, country, String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "country", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setGrade(value: Filter[TeamsResponseObject, country, Grades]): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradeFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "grade", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
      
      @scala.inline
      def setIs_registered(value: `0` | `1`): Self = StObject.set(x, "is_registered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_registeredUndefined: Self = StObject.set(x, "is_registered", js.undefined)
      
      @scala.inline
      def setLimit_number(value: Double): Self = StObject.set(x, "limit_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_numberUndefined: Self = StObject.set(x, "limit_number", js.undefined)
      
      @scala.inline
      def setLimit_start(value: Double): Self = StObject.set(x, "limit_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit_startUndefined: Self = StObject.set(x, "limit_start", js.undefined)
      
      @scala.inline
      def setNumber(value: Filter[TeamsResponseObject, number, String]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOrganisation(value: Filter[TeamsResponseObject, organisation, String]): Self = StObject.set(x, "organisation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganisationFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "organisation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOrganisationUndefined: Self = StObject.set(x, "organisation", js.undefined)
      
      @scala.inline
      def setProgram(value: Filter[TeamsResponseObject, program, Programs]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "program", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setRegion(value: Filter[TeamsResponseObject, region, String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "region", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRobot_name(value: Filter[TeamsResponseObject, robot_name, String]): Self = StObject.set(x, "robot_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRobot_nameFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "robot_name", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRobot_nameUndefined: Self = StObject.set(x, "robot_name", js.undefined)
      
      @scala.inline
      def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setTeam_name(value: Filter[TeamsResponseObject, team_name, String]): Self = StObject.set(x, "team_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam_nameFunction2(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
      ): Self = StObject.set(x, "team_name", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTeam_nameUndefined: Self = StObject.set(x, "team_name", js.undefined)
    }
  }
}
