package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.basicsMod.WeekDay
import typings.timezonecomplete.durationMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tzDatabaseMod {
  
  @JSImport("timezonecomplete/dist/lib/tz-database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AtType extends StObject
  @JSImport("timezonecomplete/dist/lib/tz-database", "AtType")
  @js.native
  object AtType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AtType & Double] = js.native
    
    /**
      * Local time (no DST)
      */
    @js.native
    sealed trait Standard
      extends StObject
         with AtType
    /* 0 */ val Standard: typings.timezonecomplete.tzDatabaseMod.AtType.Standard & Double = js.native
    
    /**
      * Utc time
      */
    @js.native
    sealed trait Utc
      extends StObject
         with AtType
    /* 2 */ val Utc: typings.timezonecomplete.tzDatabaseMod.AtType.Utc & Double = js.native
    
    /**
      * Wall clock time (local time with DST)
      */
    @js.native
    sealed trait Wall
      extends StObject
         with AtType
    /* 1 */ val Wall: typings.timezonecomplete.tzDatabaseMod.AtType.Wall & Double = js.native
  }
  
  @js.native
  sealed trait NormalizeOption extends StObject
  @JSImport("timezonecomplete/dist/lib/tz-database", "NormalizeOption")
  @js.native
  object NormalizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NormalizeOption & Double] = js.native
    
    /**
      * Normalize non-existing times by SUBTRACTING the DST offset
      */
    @js.native
    sealed trait Down
      extends StObject
         with NormalizeOption
    /* 1 */ val Down: typings.timezonecomplete.tzDatabaseMod.NormalizeOption.Down & Double = js.native
    
    /**
      * Normalize non-existing times by ADDING the DST offset
      */
    @js.native
    sealed trait Up
      extends StObject
         with NormalizeOption
    /* 0 */ val Up: typings.timezonecomplete.tzDatabaseMod.NormalizeOption.Up & Double = js.native
  }
  
  @js.native
  sealed trait OnType extends StObject
  @JSImport("timezonecomplete/dist/lib/tz-database", "OnType")
  @js.native
  object OnType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OnType & Double] = js.native
    
    /**
      * Day-of-month number
      */
    @js.native
    sealed trait DayNum
      extends StObject
         with OnType
    /* 0 */ val DayNum: typings.timezonecomplete.tzDatabaseMod.OnType.DayNum & Double = js.native
    
    /**
      * e.g. "Sun>=8"
      */
    @js.native
    sealed trait GreqX
      extends StObject
         with OnType
    /* 2 */ val GreqX: typings.timezonecomplete.tzDatabaseMod.OnType.GreqX & Double = js.native
    
    /**
      * "lastSun" or "lastWed" etc
      */
    @js.native
    sealed trait LastX
      extends StObject
         with OnType
    /* 1 */ val LastX: typings.timezonecomplete.tzDatabaseMod.OnType.LastX & Double = js.native
    
    /**
      * e.g. "Sun<=8"
      */
    @js.native
    sealed trait LeqX
      extends StObject
         with OnType
    /* 3 */ val LeqX: typings.timezonecomplete.tzDatabaseMod.OnType.LeqX & Double = js.native
  }
  
  @JSImport("timezonecomplete/dist/lib/tz-database", "RuleInfo")
  @js.native
  class RuleInfo protected () extends StObject {
    /**
      * Constructor
      * @param from
      * @param toType
      * @param toYear
      * @param type
      * @param inMonth
      * @param onType
      * @param onDay
      * @param onWeekDay
      * @param atHour
      * @param atMinute
      * @param atSecond
      * @param atType
      * @param save
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * FROM column year number.
      * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
      */
    from: Double,
      /**
      * TO column type: Year for year numbers and "only" values, Max for "max" value.
      */
    toType: ToType,
      /**
      * If TO column is a year, the year number. If TO column is "only", the FROM year.
      */
    toYear: Double,
      /**
      * TYPE column, not used so far
      */
    `type`: String,
      /**
      * IN column month number 1-12
      */
    inMonth: Double,
      /**
      * ON column type
      */
    onType: OnType,
      /**
      * If onType is DayNum, the day number
      */
    onDay: Double,
      /**
      * If onType is not DayNum, the weekday
      */
    onWeekDay: WeekDay,
      /**
      * AT column hour
      */
    atHour: Double,
      /**
      * AT column minute
      */
    atMinute: Double,
      /**
      * AT column second
      */
    atSecond: Double,
      /**
      * AT column type
      */
    atType: AtType,
      /**
      * DST offset from local standard time (NOT from UTC!)
      */
    save: Duration,
      /**
      * Character to insert in %s for time zone abbreviation
      * Note if TZ database indicates "-" this is the empty string
      */
    letter: String
    ) = this()
    
    /**
      * Returns true iff this rule is applicable in the year
      * @throws nothing
      */
    def applicable(year: Double): Boolean = js.native
    
    /**
      * AT column hour
      */
    var atHour: Double = js.native
    
    /**
      * AT column minute
      */
    var atMinute: Double = js.native
    
    /**
      * AT column second
      */
    var atSecond: Double = js.native
    
    /**
      * AT column type
      */
    var atType: AtType = js.native
    
    /**
      * Returns the date that the rule takes effect. Note that the time
      * is NOT adjusted for wall clock time or standard time, i.e. this.atType is
      * not taken into account
      * @throws NotApplicable if this rule is not applicable in the given year
      * @throws timezonecomplete.InvalidTimeZoneData if this rule depends on a weekday and the weekday in question doesn't exist
      */
    def effectiveDate(year: Double): TimeStruct = js.native
    
    /**
      * Sort comparison
      * @return (first effective date is equal to other's first effective date)
      * @throws timezonecomplete.InvalidTimeZoneData for invalid internal structure of the database
      */
    def effectiveEqual(other: RuleInfo): Boolean = js.native
    
    /**
      * Sort comparison
      * @return (first effective date is less than other's first effective date)
      * @throws timezonecomplete.InvalidTimeZoneData if this rule depends on a weekday and the weekday in question doesn't exist
      */
    def effectiveLess(other: RuleInfo): Boolean = js.native
    
    /**
      * FROM column year number.
      * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
      */
    var from: Double = js.native
    
    /**
      * IN column month number 1-12
      */
    var inMonth: Double = js.native
    
    /**
      * Character to insert in %s for time zone abbreviation
      * Note if TZ database indicates "-" this is the empty string
      */
    var letter: String = js.native
    
    /**
      * If onType is DayNum, the day number
      */
    var onDay: Double = js.native
    
    /**
      * ON column type
      */
    var onType: OnType = js.native
    
    /**
      * If onType is not DayNum, the weekday
      */
    var onWeekDay: WeekDay = js.native
    
    /**
      * DST offset from local standard time (NOT from UTC!)
      */
    var save: Duration = js.native
    
    /**
      * TO column type: Year for year numbers and "only" values, Max for "max" value.
      */
    var toType: ToType = js.native
    
    /**
      * If TO column is a year, the year number. If TO column is "only", the FROM year.
      */
    var toYear: Double = js.native
    
    /**
      * Returns the transition moment in UTC in the given year
      *
      * @param year	The year for which to return the transition
      * @param standardOffset	The standard offset for the timezone without DST
      * @param prevRule	The previous rule
      * @throws NotApplicable if this rule is not applicable in the given year
      * @throws timezonecomplete.InvalidTimeZoneData for invalid internal structure of the database
      */
    def transitionTimeUtc(year: Double, standardOffset: Duration): Double = js.native
    def transitionTimeUtc(year: Double, standardOffset: Duration, prevRule: RuleInfo): Double = js.native
    
    /**
      * TYPE column, not used so far
      */
    var `type`: String = js.native
  }
  
  @js.native
  sealed trait RuleType extends StObject
  @JSImport("timezonecomplete/dist/lib/tz-database", "RuleType")
  @js.native
  object RuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RuleType & Double] = js.native
    
    /**
      * No rule applies
      */
    @js.native
    sealed trait None
      extends StObject
         with RuleType
    /* 0 */ val None: typings.timezonecomplete.tzDatabaseMod.RuleType.None & Double = js.native
    
    /**
      * Fixed given offset
      */
    @js.native
    sealed trait Offset
      extends StObject
         with RuleType
    /* 1 */ val Offset: typings.timezonecomplete.tzDatabaseMod.RuleType.Offset & Double = js.native
    
    /**
      * Reference to a named set of rules
      */
    @js.native
    sealed trait RuleName
      extends StObject
         with RuleType
    /* 2 */ val RuleName: typings.timezonecomplete.tzDatabaseMod.RuleType.RuleName & Double = js.native
  }
  
  @js.native
  sealed trait ToType extends StObject
  @JSImport("timezonecomplete/dist/lib/tz-database", "ToType")
  @js.native
  object ToType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ToType & Double] = js.native
    
    /**
      * "max"
      */
    @js.native
    sealed trait Max
      extends StObject
         with ToType
    /* 1 */ val Max: typings.timezonecomplete.tzDatabaseMod.ToType.Max & Double = js.native
    
    /**
      * Either a year number or "only"
      */
    @js.native
    sealed trait Year
      extends StObject
         with ToType
    /* 0 */ val Year: typings.timezonecomplete.tzDatabaseMod.ToType.Year & Double = js.native
  }
  
  @JSImport("timezonecomplete/dist/lib/tz-database", "Transition")
  @js.native
  class Transition protected () extends StObject {
    /**
      * Constructor
      * @param at
      * @param offset
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * Transition time in UTC millis
      */
    at: Double,
      /**
      * New offset (type of offset depends on the function)
      */
    offset: Duration,
      /**
      * New timzone abbreviation letter
      */
    letter: String
    ) = this()
    
    /**
      * Transition time in UTC millis
      */
    var at: Double = js.native
    
    /**
      * New timzone abbreviation letter
      */
    var letter: String = js.native
    
    /**
      * New offset (type of offset depends on the function)
      */
    var offset: Duration = js.native
  }
  
  @JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
  @js.native
  /**
    * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
    * @throws AlreadyCreated if an instance already exists
    * @throws timezonecomplete.InvalidTimeZoneData if `data` is empty or invalid
    */
  class TzDatabase protected () extends StObject {
    
    /**
      * Time zone database data
      */
    var _data: js.Any = js.native
    
    /**
      * Cached min/max DST values
      */
    var _minmax: js.Any = js.native
    
    /**
      * Performance improvement: rule info cache
      */
    var _ruleInfoCache: js.Any = js.native
    
    /**
      * Performance improvement: zone info cache
      */
    var _zoneInfoCache: js.Any = js.native
    
    /**
      * Cached zone names
      */
    var _zoneNames: js.Any = js.native
    
    def abbreviation(zoneName: String, utcTime: Double): String = js.native
    def abbreviation(zoneName: String, utcTime: Double, dstDependent: Boolean): String = js.native
    /**
      * The time zone rule abbreviation, e.g. CEST for Central European Summer Time.
      * Note this is dependent on the time, because with time different rules are in effect
      * and therefore different abbreviations. They also change with DST: e.g. CEST or CET.
      *
      * @param zoneName	IANA zone name
      * @param utcTime	Timestamp in UTC unix milliseconds
      * @param dstDependent (default true) set to false for a DST-agnostic abbreviation
      * @return	The abbreviation of the rule that is in effect
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def abbreviation(zoneName: String, utcTime: TimeStruct): String = js.native
    def abbreviation(zoneName: String, utcTime: TimeStruct, dstDependent: Boolean): String = js.native
    
    def dstOffsetForRule(ruleName: String, utcTime: Double, standardOffset: Duration): Duration = js.native
    /**
      * Returns the DST offset (WITHOUT the standard zone offset) for the given
      * ruleset and the given UTC timestamp
      *
      * @param ruleName	name of ruleset
      * @param utcTime	UTC timestamp
      * @param standardOffset	Standard offset without DST for the time zone
      * @throws timezonecomplete.NotFound.Rule if ruleName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def dstOffsetForRule(ruleName: String, utcTime: TimeStruct, standardOffset: Duration): Duration = js.native
    
    /**
      * Returns true iff the given zone name exists
      * @param zoneName
      * @throws nothing
      */
    def exists(zoneName: String): Boolean = js.native
    
    /**
      * Returns the rule set with the given rule name,
      * sorted by first effective date (uncompensated for "w" or "s" AtTime)
      *
      * @param ruleName	Name of rule set
      * @return RuleInfo array. Do not change, this is a cached value.
      * @throws timezonecomplete.NotFound.Rule if rule not found
      * @throws timezonecomplete.InvalidTimeZoneData for invalid values in the time zone database
      */
    def getRuleInfos(ruleName: String): js.Array[RuleInfo] = js.native
    
    /**
      * Return a list of all transitions in [fromYear..toYear] sorted by effective date
      *
      * @param ruleName	Name of the rule set
      * @param fromYear	first year to return transitions for
      * @param toYear	Last year to return transitions for
      * @param standardOffset	Standard offset without DST for the time zone
      *
      * @return Transitions, with DST offsets (no standard offset included)
      * @throws timezonecomplete.Argument.FromYear if fromYear > toYear
      * @throws timezonecomplete.NotFound.Rule if ruleName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def getTransitionsDstOffsets(ruleName: String, fromYear: Double, toYear: Double, standardOffset: Duration): js.Array[Transition] = js.native
    
    /**
      * Return both zone and rule changes as total (std + dst) offsets.
      * Adds an initial transition if there is no zone change within the range.
      *
      * @param zoneName	IANA zone name
      * @param fromYear	First year to include
      * @param toYear	Last year to include
      * @throws timezonecomplete.Argument.FromYear if fromYear > toYear
      * @throws timezonecomplete.NotFound.Zone if zoneName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def getTransitionsTotalOffsets(zoneName: String, fromYear: Double, toYear: Double): js.Array[Transition] = js.native
    
    def getZoneInfo(zoneName: String, utcTime: Double): ZoneInfo = js.native
    /**
      * Get the zone info for the given UTC timestamp. Throws if not found.
      * @param zoneName	IANA time zone name
      * @param utcTime	UTC time stamp as unix milliseconds or as a TimeStruct
      * @returns	ZoneInfo object. Do not change, we cache this object.
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def getZoneInfo(zoneName: String, utcTime: TimeStruct): ZoneInfo = js.native
    
    /**
      * Return the zone records for a given zone name, after
      * following any links.
      *
      * @param zoneName	IANA zone name like "Pacific/Efate"
      * @return Array of zone infos. Do not change, this is a cached value.
      * @throws timezonecomplete.NotFound.Zone if zone does not exist or a linked zone does not exit
      */
    def getZoneInfos(zoneName: String): js.Array[ZoneInfo] = js.native
    
    /**
      * Checks whether the zone has DST at all
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def hasDst(zoneName: String): Boolean = js.native
    
    def letterForRule(ruleName: String, utcTime: Double, standardOffset: Duration): String = js.native
    /**
      * Returns the time zone letter for the given
      * ruleset and the given UTC timestamp
      *
      * @param ruleName	name of ruleset
      * @param utcTime	UTC timestamp as TimeStruct or unix millis
      * @param standardOffset	Standard offset without DST for the time zone
      * @throws timezonecomplete.NotFound.Rule if ruleName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def letterForRule(ruleName: String, utcTime: TimeStruct, standardOffset: Duration): String = js.native
    
    /**
      * Maximum DST offset (which excludes standard offset) of all rules in the database.
      * Note that DST offsets need not be whole hours.
      *
      * Returns 0 if zoneName given and no DST observed.
      *
      * @param zoneName	(optional) if given, the result for the given zone is returned
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def maxDstSave(): Duration = js.native
    def maxDstSave(zoneName: String): Duration = js.native
    
    /**
      * Minimum non-zero DST offset (which excludes standard offset) of all rules in the database.
      * Note that DST offsets need not be whole hours.
      *
      * Does return zero if a zoneName is given and there is no DST at all for the zone.
      *
      * @param zoneName	(optional) if given, the result for the given zone is returned
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def minDstSave(): Duration = js.native
    def minDstSave(zoneName: String): Duration = js.native
    
    /**
      * First DST change moment AFTER the given UTC date in UTC milliseconds, within one year,
      * returns undefined if no such change
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def nextDstChange(zoneName: String, utcTime: Double): js.UndefOr[Double] = js.native
    def nextDstChange(zoneName: String, utcTime: TimeStruct): js.UndefOr[Double] = js.native
    
    /**
      * Normalizes non-existing local times by adding/subtracting a forward offset change.
      * During a forward standard offset change or DST offset change, some amount of
      * local time is skipped. Therefore, this amount of local time does not exist.
      * This function adds the amount of forward change to any non-existing time. After all,
      * this is probably what the user meant.
      *
      * @param zoneName	IANA time zone name
      * @param localTime	A local time as a unix millisecond value
      * @param opt	(optional) Round up or down? Default: up.
      *
      * @return	The normalized time, in the same format as the localTime parameter (TimeStruct or unix millis)
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def normalizeLocal(zoneName: String, localTime: Double): Double = js.native
    def normalizeLocal(zoneName: String, localTime: Double, opt: NormalizeOption): Double = js.native
    /**
      * Normalizes non-existing local times by adding/subtracting a forward offset change.
      * During a forward standard offset change or DST offset change, some amount of
      * local time is skipped. Therefore, this amount of local time does not exist.
      * This function adds the amount of forward change to any non-existing time. After all,
      * this is probably what the user meant.
      *
      * @param zoneName	IANA time zone name
      * @param localTime	A local time, as a TimeStruct
      * @param opt	(optional) Round up or down? Default: up.
      *
      * @return	The normalized time, in the same format as the localTime parameter (TimeStruct or unix millis)
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def normalizeLocal(zoneName: String, localTime: TimeStruct): TimeStruct = js.native
    def normalizeLocal(zoneName: String, localTime: TimeStruct, opt: NormalizeOption): TimeStruct = js.native
    
    /**
      * Parse the AT column of a rule info entry
      * and see what kind of entry it is.
      * @throws nothing
      */
    def parseAtType(at: js.Any): AtType = js.native
    
    /**
      * Get the day number from an ON column string, 0 if no day.
      * @throws nothing
      */
    def parseOnDay(on: String, onType: OnType): Double = js.native
    
    /**
      * Parse the ON column of a rule info entry
      * and see what kind of entry it is.
      * @throws nothing
      */
    def parseOnType(on: String): OnType = js.native
    
    /**
      * Get the day-of-week from an ON column string, Sunday if not present.
      * @throws nothing
      */
    def parseOnWeekDay(on: String): WeekDay = js.native
    
    /**
      * Parse the RULES column of a zone info entry
      * and see what kind of entry it is.
      * @throws nothing
      */
    def parseRuleType(rule: String): RuleType = js.native
    
    /**
      * Parse the TO column of a rule info entry
      * and see what kind of entry it is.
      * @throws timezonecomplete.Argument.To for invalid TO
      */
    def parseToType(to: String): ToType = js.native
    
    def standardOffset(zoneName: String, utcTime: Double): Duration = js.native
    /**
      * Returns the standard time zone offset from UTC, without DST.
      * Throws if info not found.
      * @param zoneName	IANA time zone name
      * @param utcTime	Timestamp in UTC, either as TimeStruct or as Unix millisecond value
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def standardOffset(zoneName: String, utcTime: TimeStruct): Duration = js.native
    
    def standardOffsetLocal(zoneName: String, localTime: Double): Duration = js.native
    /**
      * Returns the standard time zone offset from UTC, excluding DST, at
      * the given LOCAL timestamp, again excluding DST.
      *
      * If the local timestamp exists twice (as can occur very rarely due to zone changes)
      * then the first occurrence is returned.
      *
      * Throws if zone info not found.
      *
      * @param zoneName	IANA time zone name
      * @param localTime	Timestamp in time zone time
      * @throws timezonecomplete.NotFound.Zone if zoneName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def standardOffsetLocal(zoneName: String, localTime: TimeStruct): Duration = js.native
    
    def totalOffset(zoneName: String, utcTime: Double): Duration = js.native
    /**
      * Returns the total time zone offset from UTC, including DST, at
      * the given UTC timestamp.
      * Throws if zone info not found.
      *
      * @param zoneName	IANA time zone name
      * @param utcTime	Timestamp in UTC, either as TimeStruct or as Unix millisecond value
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def totalOffset(zoneName: String, utcTime: TimeStruct): Duration = js.native
    
    def totalOffsetLocal(zoneName: String, localTime: Double): Duration = js.native
    /**
      * Returns the total time zone offset from UTC, including DST, at
      * the given LOCAL timestamp. Non-existing local time is normalized out.
      * There can be multiple UTC times and therefore multiple offsets for a local time
      * namely during a backward DST change. This returns the FIRST such offset.
      * Throws if zone info not found.
      *
      * @param zoneName	IANA time zone name
      * @param localTime	Timestamp in time zone time
      * @throws timezonecomplete.NotFound.Zone if zoneName not found
      * @throws timezonecomplete.InvalidTimeZoneData if an error is discovered in the time zone database
      */
    def totalOffsetLocal(zoneName: String, localTime: TimeStruct): Duration = js.native
    
    /**
      * Returns true iff the given zone name eventually links to
      * "Etc/UTC", "Etc/GMT" or "Etc/UCT" in the TZ database. This is true e.g. for
      * "UTC", "GMT", "Etc/GMT" etc.
      *
      * @param zoneName	IANA time zone name.
      * @throws nothing
      */
    def zoneIsUtc(zoneName: String): Boolean = js.native
    
    /**
      * Returns a sorted list of all zone names
      * @throws nothing
      */
    def zoneNames(): js.Array[String] = js.native
  }
  /* static members */
  object TzDatabase {
    
    @JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Single instance member
      */
    @JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * (re-) initialize timezonecomplete with time zone data
      *
      * @param data TZ data as JSON object (from one of the tzdata NPM modules).
      *             If not given, Timezonecomplete will search for installed modules.
      * @throws timezonecomplete.InvalidTimeZoneData if `data` or the global time zone data is invalid
      */
    @scala.inline
    def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    @scala.inline
    def init(data: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def init(data: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Single instance of this database
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    @scala.inline
    def instance(): TzDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[TzDatabase]
  }
  
  @JSImport("timezonecomplete/dist/lib/tz-database", "ZoneInfo")
  @js.native
  class ZoneInfo protected () extends StObject {
    /**
      * Constructor
      * @param gmtoff
      * @param ruleType
      * @param ruleOffset
      * @param ruleName
      * @param format
      * @param until
      * @throws nothing
      */
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String
    ) = this()
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String,
      /**
      * Until timestamp in unix utc millis. The zone info is valid up to
      * and excluding this timestamp.
      * Note this value can be undefined (for the first rule)
      */
    until: Double
    ) = this()
    
    /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    var format: String = js.native
    
    /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    var gmtoff: Duration = js.native
    
    /**
      * If the rule column is a rule name, this is the rule name
      */
    var ruleName: String = js.native
    
    /**
      * If the rule column is an offset, this is the offset
      */
    var ruleOffset: Duration = js.native
    
    /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    var ruleType: RuleType = js.native
    
    /**
      * Until timestamp in unix utc millis. The zone info is valid up to
      * and excluding this timestamp.
      * Note this value can be undefined (for the first rule)
      */
    var until: js.UndefOr[Double] = js.native
  }
  
  @scala.inline
  def isValidOffsetString(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidOffsetString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
