package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCoverageStatistics extends js.Object {
  /**
    * Covered units
    */
  var covered: Double = js.native
  /**
    * Delta of coverage
    */
  var delta: Double = js.native
  /**
    * Is delta valid
    */
  var isDeltaAvailable: Boolean = js.native
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: String = js.native
  /**
    * Position of label
    */
  var position: Double = js.native
  /**
    * Total units
    */
  var total: Double = js.native
}

object CodeCoverageStatistics {
  @scala.inline
  def apply(
    covered: Double,
    delta: Double,
    isDeltaAvailable: Boolean,
    label: String,
    position: Double,
    total: Double
  ): CodeCoverageStatistics = {
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], isDeltaAvailable = isDeltaAvailable.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
  @scala.inline
  implicit class CodeCoverageStatisticsOps[Self <: CodeCoverageStatistics] (val x: Self) extends AnyVal {
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
    def setCovered(value: Double): Self = this.set("covered", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeltaAvailable(value: Boolean): Self = this.set("isDeltaAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

