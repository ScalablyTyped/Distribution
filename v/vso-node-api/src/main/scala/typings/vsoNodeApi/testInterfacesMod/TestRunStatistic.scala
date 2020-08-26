package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunStatistic extends js.Object {
  var run: ShallowReference = js.native
  var runStatistics: js.Array[RunStatistic] = js.native
}

object TestRunStatistic {
  @scala.inline
  def apply(run: ShallowReference, runStatistics: js.Array[RunStatistic]): TestRunStatistic = {
    val __obj = js.Dynamic.literal(run = run.asInstanceOf[js.Any], runStatistics = runStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunStatistic]
  }
  @scala.inline
  implicit class TestRunStatisticOps[Self <: TestRunStatistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRun(value: ShallowReference): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunStatisticsVarargs(value: RunStatistic*): Self = this.set("runStatistics", js.Array(value :_*))
    @scala.inline
    def setRunStatistics(value: js.Array[RunStatistic]): Self = this.set("runStatistics", value.asInstanceOf[js.Any])
  }
  
}

