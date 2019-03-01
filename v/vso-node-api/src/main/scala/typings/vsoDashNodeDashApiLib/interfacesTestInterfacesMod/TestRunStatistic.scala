package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunStatistic extends js.Object {
  var run: ShallowReference
  var runStatistics: js.Array[RunStatistic]
}

object TestRunStatistic {
  @scala.inline
  def apply(run: ShallowReference, runStatistics: js.Array[RunStatistic]): TestRunStatistic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("runStatistics")(runStatistics)
    __obj.asInstanceOf[TestRunStatistic]
  }
}

