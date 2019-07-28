package typings.vegaDashLite.buildSrcCompileDataTimeunitMod

import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitComponent extends js.Object {
  var as: String
  var field: String
  var timeUnit: TimeUnit
}

object TimeUnitComponent {
  @scala.inline
  def apply(as: String, field: String, timeUnit: TimeUnit): TimeUnitComponent = {
    val __obj = js.Dynamic.literal(as = as, field = field, timeUnit = timeUnit)
  
    __obj.asInstanceOf[TimeUnitComponent]
  }
}

