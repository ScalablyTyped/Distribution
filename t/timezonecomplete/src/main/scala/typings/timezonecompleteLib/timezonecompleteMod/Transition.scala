package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Transition")
@js.native
class Transition protected ()
  extends timezonecompleteLib.distLibTzDashDatabaseMod.Transition {
  def this(/**
    * Transition time in UTC millis
    */
  at: scala.Double, /**
    * New offset (type of offset depends on the function)
    */
  offset: timezonecompleteLib.distLibDurationMod.Duration, /**
    * New timzone abbreviation letter
    */
  letter: java.lang.String) = this()
}

