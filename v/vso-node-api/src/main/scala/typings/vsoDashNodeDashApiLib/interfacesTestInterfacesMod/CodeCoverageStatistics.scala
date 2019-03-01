package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCoverageStatistics extends js.Object {
  /**
    * Covered units
    */
  var covered: scala.Double
  /**
    * Delta of coverage
    */
  var delta: scala.Double
  /**
    * Is delta valid
    */
  var isDeltaAvailable: scala.Boolean
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: java.lang.String
  /**
    * Position of label
    */
  var position: scala.Double
  /**
    * Total units
    */
  var total: scala.Double
}

object CodeCoverageStatistics {
  @scala.inline
  def apply(
    covered: scala.Double,
    delta: scala.Double,
    isDeltaAvailable: scala.Boolean,
    label: java.lang.String,
    position: scala.Double,
    total: scala.Double
  ): CodeCoverageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("covered")(covered)
    __obj.updateDynamic("delta")(delta)
    __obj.updateDynamic("isDeltaAvailable")(isDeltaAvailable)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
}

