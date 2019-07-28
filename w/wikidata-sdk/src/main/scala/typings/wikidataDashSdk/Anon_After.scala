package typings.wikidataDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: Double
  var before: Double
  var calendermodel: String
  var precision: Double
  var time: String
  var timezone: Double
}

object Anon_After {
  @scala.inline
  def apply(
    after: Double,
    before: Double,
    calendermodel: String,
    precision: Double,
    time: String,
    timezone: Double
  ): Anon_After = {
    val __obj = js.Dynamic.literal(after = after, before = before, calendermodel = calendermodel, precision = precision, time = time, timezone = timezone)
  
    __obj.asInstanceOf[Anon_After]
  }
}

