package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
@js.native
/**
  * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
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
  def abbreviation(zoneName: java.lang.String, utcTime: scala.Double): java.lang.String = js.native
  def abbreviation(zoneName: java.lang.String, utcTime: scala.Double, dstDependent: scala.Boolean): java.lang.String = js.native
  /**
    * The time zone rule abbreviation, e.g. CEST for Central European Summer Time.
    * Note this is dependent on the time, because with time different rules are in effect
    * and therefore different abbreviations. They also change with DST: e.g. CEST or CET.
    *
    * @param zoneName	IANA zone name
    * @param utcTime	Timestamp in UTC unix milliseconds
    * @param dstDependent (default true) set to false for a DST-agnostic abbreviation
    * @return	The abbreviation of the rule that is in effect
    */
  def abbreviation(zoneName: java.lang.String, utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): java.lang.String = js.native
  def abbreviation(
    zoneName: java.lang.String,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    dstDependent: scala.Boolean
  ): java.lang.String = js.native
  def dstOffsetForRule(
    ruleName: java.lang.String,
    utcTime: scala.Double,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration
  ): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Returns the DST offset (WITHOUT the standard zone offset) for the given
    * ruleset and the given UTC timestamp
    *
    * @param ruleName	name of ruleset
    * @param utcTime	UTC timestamp
    * @param standardOffset	Standard offset without DST for the time zone
    */
  def dstOffsetForRule(
    ruleName: java.lang.String,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration
  ): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def exists(zoneName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the rule set with the given rule name,
    * sorted by first effective date (uncompensated for "w" or "s" AtTime)
    *
    * @param ruleName	Name of rule set
    * @return RuleInfo array. Do not change, this is a cached value.
    */
  def getRuleInfos(ruleName: java.lang.String): js.Array[RuleInfo] = js.native
  /**
    * Return a list of all transitions in [fromYear..toYear] sorted by effective date
    *
    * @param ruleName	Name of the rule set
    * @param fromYear	first year to return transitions for
    * @param toYear	Last year to return transitions for
    * @param standardOffset	Standard offset without DST for the time zone
    *
    * @return Transitions, with DST offsets (no standard offset included)
    */
  def getTransitionsDstOffsets(
    ruleName: java.lang.String,
    fromYear: scala.Double,
    toYear: scala.Double,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration
  ): js.Array[Transition] = js.native
  /**
    * Return both zone and rule changes as total (std + dst) offsets.
    * Adds an initial transition if there is no zone change within the range.
    *
    * @param zoneName	IANA zone name
    * @param fromYear	First year to include
    * @param toYear	Last year to include
    */
  def getTransitionsTotalOffsets(zoneName: java.lang.String, fromYear: scala.Double, toYear: scala.Double): js.Array[Transition] = js.native
  def getZoneInfo(zoneName: java.lang.String, utcTime: scala.Double): ZoneInfo = js.native
  /**
    * Get the zone info for the given UTC timestamp. Throws if not found.
    * @param zoneName	IANA time zone name
    * @param utcTime	UTC time stamp as unix milliseconds or as a TimeStruct
    * @returns	ZoneInfo object. Do not change, we cache this object.
    */
  def getZoneInfo(zoneName: java.lang.String, utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): ZoneInfo = js.native
  /**
    * Return the zone records for a given zone name, after
    * following any links.
    *
    * @param zoneName	IANA zone name like "Pacific/Efate"
    * @return Array of zone infos. Do not change, this is a cached value.
    */
  def getZoneInfos(zoneName: java.lang.String): js.Array[ZoneInfo] = js.native
  /**
    * Checks whether the zone has DST at all
    */
  def hasDst(zoneName: java.lang.String): scala.Boolean = js.native
  def letterForRule(
    ruleName: java.lang.String,
    utcTime: scala.Double,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration
  ): java.lang.String = js.native
  /**
    * Returns the time zone letter for the given
    * ruleset and the given UTC timestamp
    *
    * @param ruleName	name of ruleset
    * @param utcTime	UTC timestamp as TimeStruct or unix millis
    * @param standardOffset	Standard offset without DST for the time zone
    */
  def letterForRule(
    ruleName: java.lang.String,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration
  ): java.lang.String = js.native
  /**
    * Maximum DST offset (which excludes standard offset) of all rules in the database.
    * Note that DST offsets need not be whole hours.
    *
    * Returns 0 if zoneName given and no DST observed.
    *
    * @param zoneName	(optional) if given, the result for the given zone is returned
    */
  def maxDstSave(): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def maxDstSave(zoneName: java.lang.String): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Minimum non-zero DST offset (which excludes standard offset) of all rules in the database.
    * Note that DST offsets need not be whole hours.
    *
    * Does return zero if a zoneName is given and there is no DST at all for the zone.
    *
    * @param zoneName	(optional) if given, the result for the given zone is returned
    */
  def minDstSave(): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def minDstSave(zoneName: java.lang.String): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * First DST change moment AFTER the given UTC date in UTC milliseconds, within one year,
    * returns undefined if no such change
    */
  def nextDstChange(zoneName: java.lang.String, utcTime: scala.Double): js.UndefOr[scala.Double] = js.native
  def nextDstChange(zoneName: java.lang.String, utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): js.UndefOr[scala.Double] = js.native
  /**
    * Normalizes non-existing local times by adding/subtracting a forward offset change.
    * During a forward standard offset change or DST offset change, some amount of
    * local time is skipped. Therefore, this amount of local time does not exist.
    * This function adds the amount of forward change to any non-existing time. After all,
    * this is probably what the user meant.
    *
    * @param zoneName	IANA time zone name
    * @param localTime	A local time, either as a TimeStruct or as a unix millisecond value
    * @param opt	(optional) Round up or down? Default: up.
    *
    * @return	The normalized time, in the same format as the localTime parameter (TimeStruct or unix millis)
    */
  def normalizeLocal(zoneName: java.lang.String, localTime: scala.Double): scala.Double = js.native
  def normalizeLocal(zoneName: java.lang.String, localTime: scala.Double, opt: NormalizeOption): scala.Double = js.native
  def normalizeLocal(zoneName: java.lang.String, localTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  def normalizeLocal(
    zoneName: java.lang.String,
    localTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    opt: NormalizeOption
  ): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  /**
    * Parse the AT column of a rule info entry
    * and see what kind of entry it is.
    */
  def parseAtType(at: js.Any): AtType = js.native
  /**
    * Get the day number from an ON column string, 0 if no day.
    */
  def parseOnDay(on: java.lang.String, onType: OnType): scala.Double = js.native
  /**
    * Parse the ON column of a rule info entry
    * and see what kind of entry it is.
    */
  def parseOnType(on: java.lang.String): OnType = js.native
  /**
    * Get the day-of-week from an ON column string, Sunday if not present.
    */
  def parseOnWeekDay(on: java.lang.String): timezonecompleteLib.distLibBasicsMod.WeekDay = js.native
  /**
    * Parse the RULES column of a zone info entry
    * and see what kind of entry it is.
    */
  def parseRuleType(rule: java.lang.String): RuleType = js.native
  /**
    * Parse the TO column of a rule info entry
    * and see what kind of entry it is.
    */
  def parseToType(to: java.lang.String): ToType = js.native
  def standardOffset(zoneName: java.lang.String, utcTime: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Returns the standard time zone offset from UTC, without DST.
    * Throws if info not found.
    * @param zoneName	IANA time zone name
    * @param utcTime	Timestamp in UTC, either as TimeStruct or as Unix millisecond value
    */
  def standardOffset(zoneName: java.lang.String, utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def standardOffsetLocal(zoneName: java.lang.String, localTime: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
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
    */
  def standardOffsetLocal(zoneName: java.lang.String, localTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def totalOffset(zoneName: java.lang.String, utcTime: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Returns the total time zone offset from UTC, including DST, at
    * the given UTC timestamp.
    * Throws if zone info not found.
    *
    * @param zoneName	IANA time zone name
    * @param utcTime	Timestamp in UTC, either as TimeStruct or as Unix millisecond value
    */
  def totalOffset(zoneName: java.lang.String, utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def totalOffsetLocal(zoneName: java.lang.String, localTime: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Returns the total time zone offset from UTC, including DST, at
    * the given LOCAL timestamp. Non-existing local time is normalized out.
    * There can be multiple UTC times and therefore multiple offsets for a local time
    * namely during a backward DST change. This returns the FIRST such offset.
    * Throws if zone info not found.
    *
    * @param zoneName	IANA time zone name
    * @param localTime	Timestamp in time zone time
    */
  def totalOffsetLocal(zoneName: java.lang.String, localTime: timezonecompleteLib.distLibBasicsMod.TimeStruct): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Returns true iff the given zone name eventually links to
    * "Etc/UTC", "Etc/GMT" or "Etc/UCT" in the TZ database. This is true e.g. for
    * "UTC", "GMT", "Etc/GMT" etc.
    *
    * @param zoneName	IANA time zone name.
    */
  def zoneIsUtc(zoneName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a sorted list of all zone names
    */
  def zoneNames(): js.Array[java.lang.String] = js.native
}

/* static members */
@JSImport("timezonecomplete/dist/lib/tz-database", "TzDatabase")
@js.native
object TzDatabase extends js.Object {
  /**
    * Single instance member
    */
  var _instance: js.UndefOr[js.Any] = js.native
  /**
    * (re-) initialize timezonecomplete with time zone data
    *
    * @param data TZ data as JSON object (from one of the tzdata NPM modules).
    *             If not given, Timezonecomplete will search for installed modules.
    */
  def init(): scala.Unit = js.native
  def init(data: js.Any): scala.Unit = js.native
  def init(data: js.Array[_]): scala.Unit = js.native
  /**
    * Single instance of this database
    */
  def instance(): timezonecompleteLib.distLibTzDashDatabaseMod.TzDatabase = js.native
}

