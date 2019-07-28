package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageStatistics extends js.Object {
  var blocksCovered: Double
  var blocksNotCovered: Double
  var linesCovered: Double
  var linesNotCovered: Double
  var linesPartiallyCovered: Double
}

object CoverageStatistics {
  @scala.inline
  def apply(
    blocksCovered: Double,
    blocksNotCovered: Double,
    linesCovered: Double,
    linesNotCovered: Double,
    linesPartiallyCovered: Double
  ): CoverageStatistics = {
    val __obj = js.Dynamic.literal(blocksCovered = blocksCovered, blocksNotCovered = blocksNotCovered, linesCovered = linesCovered, linesNotCovered = linesNotCovered, linesPartiallyCovered = linesPartiallyCovered)
  
    __obj.asInstanceOf[CoverageStatistics]
  }
}

