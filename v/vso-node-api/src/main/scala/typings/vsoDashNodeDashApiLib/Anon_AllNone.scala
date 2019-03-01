package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllNone extends js.Object {
  var all: scala.Double
  var none: scala.Double
  var system: scala.Double
  var testResult: scala.Double
  var testRun: scala.Double
}

object Anon_AllNone {
  @scala.inline
  def apply(
    all: scala.Double,
    none: scala.Double,
    system: scala.Double,
    testResult: scala.Double,
    testRun: scala.Double
  ): Anon_AllNone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("testResult")(testResult)
    __obj.updateDynamic("testRun")(testRun)
    __obj.asInstanceOf[Anon_AllNone]
  }
}

