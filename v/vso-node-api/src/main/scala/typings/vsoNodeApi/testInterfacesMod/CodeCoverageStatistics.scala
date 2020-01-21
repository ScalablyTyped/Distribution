package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCoverageStatistics extends js.Object {
  /**
    * Covered units
    */
  var covered: Double
  /**
    * Delta of coverage
    */
  var delta: Double
  /**
    * Is delta valid
    */
  var isDeltaAvailable: Boolean
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: String
  /**
    * Position of label
    */
  var position: Double
  /**
    * Total units
    */
  var total: Double
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
}

