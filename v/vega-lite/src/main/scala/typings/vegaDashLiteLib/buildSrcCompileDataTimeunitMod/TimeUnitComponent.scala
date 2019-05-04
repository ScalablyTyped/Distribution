package typings
package vegaDashLiteLib.buildSrcCompileDataTimeunitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitComponent extends js.Object {
  var as: java.lang.String
  var field: java.lang.String
  var timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
}

object TimeUnitComponent {
  @scala.inline
  def apply(
    as: java.lang.String,
    field: java.lang.String,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
  ): TimeUnitComponent = {
    val __obj = js.Dynamic.literal(as = as, field = field, timeUnit = timeUnit)
  
    __obj.asInstanceOf[TimeUnitComponent]
  }
}

