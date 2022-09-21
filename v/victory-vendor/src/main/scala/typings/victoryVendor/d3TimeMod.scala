package typings.victoryVendor

import typings.d3Time.mod.CountableTimeInterval
import typings.d3Time.mod.TimeInterval_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3TimeMod {
  
  @JSImport("victory-vendor/d3-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-vendor/d3-time", "timeDay")
  @js.native
  val timeDay: CountableTimeInterval = js.native
  
  inline def timeDays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeDays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeFriday")
  @js.native
  val timeFriday: CountableTimeInterval = js.native
  
  inline def timeFridays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeFridays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeHour")
  @js.native
  val timeHour: CountableTimeInterval = js.native
  
  inline def timeHours(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeHours(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def timeInterval(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit]
  ): TimeInterval_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TimeInterval_]
  inline def timeInterval(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ js.Date, /* end */ js.Date, Double]
  ): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  inline def timeInterval(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ js.Date, /* end */ js.Date, Double],
    field: js.Function1[/* date */ js.Date, Double]
  ): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  
  @JSImport("victory-vendor/d3-time", "timeMillisecond")
  @js.native
  val timeMillisecond: CountableTimeInterval = js.native
  
  inline def timeMilliseconds(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeMilliseconds(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeMinute")
  @js.native
  val timeMinute: CountableTimeInterval = js.native
  
  inline def timeMinutes(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeMinutes(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeMonday")
  @js.native
  val timeMonday: CountableTimeInterval = js.native
  
  inline def timeMondays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeMondays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeMonth")
  @js.native
  val timeMonth: CountableTimeInterval = js.native
  
  inline def timeMonths(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeMonths(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeSaturday")
  @js.native
  val timeSaturday: CountableTimeInterval = js.native
  
  inline def timeSaturdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeSaturdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeSecond")
  @js.native
  val timeSecond: CountableTimeInterval = js.native
  
  inline def timeSeconds(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeSeconds(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeSunday")
  @js.native
  val timeSunday: CountableTimeInterval = js.native
  
  inline def timeSundays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeSundays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeThursday")
  @js.native
  val timeThursday: CountableTimeInterval = js.native
  
  inline def timeThursdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeThursdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def timeTickInterval(start: js.Date, stop: js.Date, count: Double): TimeInterval_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTickInterval")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[TimeInterval_ | Null]
  
  inline def timeTicks(start: js.Date, stop: js.Date, count: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTicks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeTuesday")
  @js.native
  val timeTuesday: CountableTimeInterval = js.native
  
  inline def timeTuesdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeTuesdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeWednesday")
  @js.native
  val timeWednesday: CountableTimeInterval = js.native
  
  inline def timeWednesdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeWednesdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeWeek")
  @js.native
  val timeWeek: CountableTimeInterval = js.native
  
  inline def timeWeeks(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeWeeks(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "timeYear")
  @js.native
  val timeYear: CountableTimeInterval = js.native
  
  inline def timeYears(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def timeYears(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcDay")
  @js.native
  val utcDay: CountableTimeInterval = js.native
  
  inline def utcDays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcDays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcFriday")
  @js.native
  val utcFriday: CountableTimeInterval = js.native
  
  inline def utcFridays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcFridays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcHour")
  @js.native
  val utcHour: CountableTimeInterval = js.native
  
  inline def utcHours(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcHours(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcMillisecond")
  @js.native
  val utcMillisecond: CountableTimeInterval = js.native
  
  inline def utcMilliseconds(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcMilliseconds(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcMinute")
  @js.native
  val utcMinute: CountableTimeInterval = js.native
  
  inline def utcMinutes(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcMinutes(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcMonday")
  @js.native
  val utcMonday: CountableTimeInterval = js.native
  
  inline def utcMondays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcMondays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcMonth")
  @js.native
  val utcMonth: CountableTimeInterval = js.native
  
  inline def utcMonths(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcMonths(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcSaturday")
  @js.native
  val utcSaturday: CountableTimeInterval = js.native
  
  inline def utcSaturdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcSaturdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcSecond")
  @js.native
  val utcSecond: CountableTimeInterval = js.native
  
  inline def utcSeconds(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcSeconds(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcSunday")
  @js.native
  val utcSunday: CountableTimeInterval = js.native
  
  inline def utcSundays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcSundays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcThursday")
  @js.native
  val utcThursday: CountableTimeInterval = js.native
  
  inline def utcThursdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcThursdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def utcTickInterval(start: js.Date, stop: js.Date, count: Double): TimeInterval_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTickInterval")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[TimeInterval_ | Null]
  
  inline def utcTicks(start: js.Date, stop: js.Date, count: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTicks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcTuesday")
  @js.native
  val utcTuesday: CountableTimeInterval = js.native
  
  inline def utcTuesdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcTuesdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcWednesday")
  @js.native
  val utcWednesday: CountableTimeInterval = js.native
  
  inline def utcWednesdays(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcWednesdays(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcWeek")
  @js.native
  val utcWeek: CountableTimeInterval = js.native
  
  inline def utcWeeks(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcWeeks(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  @JSImport("victory-vendor/d3-time", "utcYear")
  @js.native
  val utcYear: CountableTimeInterval = js.native
  
  inline def utcYears(start: js.Date, stop: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def utcYears(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
}
