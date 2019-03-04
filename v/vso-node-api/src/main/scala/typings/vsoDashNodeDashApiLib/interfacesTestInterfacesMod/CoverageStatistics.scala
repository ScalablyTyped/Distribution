package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageStatistics extends js.Object {
  var blocksCovered: scala.Double
  var blocksNotCovered: scala.Double
  var linesCovered: scala.Double
  var linesNotCovered: scala.Double
  var linesPartiallyCovered: scala.Double
}

object CoverageStatistics {
  @scala.inline
  def apply(
    blocksCovered: scala.Double,
    blocksNotCovered: scala.Double,
    linesCovered: scala.Double,
    linesNotCovered: scala.Double,
    linesPartiallyCovered: scala.Double
  ): CoverageStatistics = {
    val __obj = js.Dynamic.literal(blocksCovered = blocksCovered, blocksNotCovered = blocksNotCovered, linesCovered = linesCovered, linesNotCovered = linesNotCovered, linesPartiallyCovered = linesPartiallyCovered)
  
    __obj.asInstanceOf[CoverageStatistics]
  }
}

