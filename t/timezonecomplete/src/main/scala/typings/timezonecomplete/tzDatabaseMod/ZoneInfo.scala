package typings.timezonecomplete.tzDatabaseMod

import typings.timezonecomplete.durationMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/tz-database", "ZoneInfo")
@js.native
class ZoneInfo protected () extends js.Object {
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
