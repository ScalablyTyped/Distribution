package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/tz-database", "Transition")
@js.native
class Transition protected () extends js.Object {
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
  /**
       * Transition time in UTC millis
       */
  var at: scala.Double = js.native
  /**
       * New timzone abbreviation letter
       */
  var letter: java.lang.String = js.native
  /**
       * New offset (type of offset depends on the function)
       */
  var offset: timezonecompleteLib.distLibDurationMod.Duration = js.native
}

