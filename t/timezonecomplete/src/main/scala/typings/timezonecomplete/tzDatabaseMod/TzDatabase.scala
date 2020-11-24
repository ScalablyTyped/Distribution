package typings.timezonecomplete.tzDatabaseMod

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.basicsMod.WeekDay
import typings.timezonecomplete.durationMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
@js.native
/**
  * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
  * @throws AlreadyCreated if an instance already exists
  * @throws timezonecomplete.InvalidTimeZoneData if `data` is empty or invalid
  */
class TzDatabase protected () extends js.Object {
  
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
@JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
@js.native
object TzDatabase extends js.Object {
  
  /**
    * Single instance member
    */
  var _instance: js.Any = js.native
  
  /**
    * (re-) initialize timezonecomplete with time zone data
    *
    * @param data TZ data as JSON object (from one of the tzdata NPM modules).
    *             If not given, Timezonecomplete will search for installed modules.
    * @throws timezonecomplete.InvalidTimeZoneData if `data` or the global time zone data is invalid
    */
  def init(): Unit = js.native
  def init(data: js.Any): Unit = js.native
  def init(data: js.Array[_]): Unit = js.native
  
  /**
    * Single instance of this database
    * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
    */
  def instance(): TzDatabase = js.native
}
