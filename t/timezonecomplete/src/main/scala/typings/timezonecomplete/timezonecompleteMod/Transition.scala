package typings.timezonecomplete.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Transition")
@js.native
class Transition protected ()
  extends typings.timezonecomplete.distLibTzDashDatabaseMod.Transition {
  def this(
    /**
    * Transition time in UTC millis
    */
  at: Double,
    /**
    * New offset (type of offset depends on the function)
    */
  offset: typings.timezonecomplete.distLibDurationMod.Duration,
    /**
    * New timzone abbreviation letter
    */
  letter: String
  ) = this()
}

