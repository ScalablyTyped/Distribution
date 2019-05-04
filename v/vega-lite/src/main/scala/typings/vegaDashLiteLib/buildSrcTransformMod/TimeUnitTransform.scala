package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitTransform extends Transform {
  /**
    * The output field to write the timeUnit value.
    */
  var as: java.lang.String
  /**
    * The data field to apply time unit.
    */
  var field: java.lang.String
  /**
    * The timeUnit.
    */
  var timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
}

object TimeUnitTransform {
  @scala.inline
  def apply(
    as: java.lang.String,
    field: java.lang.String,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
  ): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as, field = field, timeUnit = timeUnit)
  
    __obj.asInstanceOf[TimeUnitTransform]
  }
}

