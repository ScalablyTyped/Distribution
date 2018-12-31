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

