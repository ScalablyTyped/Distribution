package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(covered = covered, delta = delta, isDeltaAvailable = isDeltaAvailable, label = label, position = position, total = total)
  
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
}

