package typings.timezonecomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Transition")
@js.native
class Transition protected ()
  extends typings.timezonecomplete.tzDatabaseMod.Transition {
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
  offset: typings.timezonecomplete.durationMod.Duration,
    /**
    * New timzone abbreviation letter
    */
  letter: String
  ) = this()
}

