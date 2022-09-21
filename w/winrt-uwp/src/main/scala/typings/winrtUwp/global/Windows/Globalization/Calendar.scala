package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manipulates the representation of a date and time within a given calendar and clock. */
@JSGlobal("Windows.Globalization.Calendar")
@js.native
/** Creates a Calendar object and initializes it to the current date and time. */
open class Calendar ()
  extends StObject
     with typings.winrtUwp.Windows.Globalization.Calendar {
  /**
    * Creates a Calendar object that is initialized with a language list.
    * @param languages The list of language identifiers, in priority order, that represents the choice of languages. These are used for resolving patterns to strings. See Remarks.
    */
  def this(languages: IIterable[String]) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, and clock.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    */
  def this(languages: IIterable[String], calendar: String, clock: String) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, clock, and time zone.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    */
  def this(languages: IIterable[String], calendar: String, clock: String, timeZoneId: String) = this()
}
