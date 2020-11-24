package typings.timezonecomplete.tzDatabaseMod

import typings.timezonecomplete.durationMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/tz-database", "Transition")
@js.native
class Transition protected () extends js.Object {
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
