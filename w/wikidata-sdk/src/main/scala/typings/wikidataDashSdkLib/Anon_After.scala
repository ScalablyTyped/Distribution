package typings
package wikidataDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: scala.Double
  var before: scala.Double
  var calendermodel: java.lang.String
  var precision: scala.Double
  var time: java.lang.String
  var timezone: scala.Double
}

object Anon_After {
  @scala.inline
  def apply(
    after: scala.Double,
    before: scala.Double,
    calendermodel: java.lang.String,
    precision: scala.Double,
    time: java.lang.String,
    timezone: scala.Double
  ): Anon_After = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("calendermodel")(calendermodel)
    __obj.updateDynamic("precision")(precision)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Anon_After]
  }
}

