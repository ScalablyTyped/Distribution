package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitTransform extends Transform {
  /**
    * The output field to write the timeUnit value.
    */
  var as: String
  /**
    * The data field to apply time unit.
    */
  var field: String
  /**
    * The timeUnit.
    */
  var timeUnit: TimeUnit
}

object TimeUnitTransform {
  @scala.inline
  def apply(as: String, field: String, timeUnit: TimeUnit): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as, field = field, timeUnit = timeUnit)
  
    __obj.asInstanceOf[TimeUnitTransform]
  }
}

