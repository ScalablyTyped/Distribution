package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageStatistics extends js.Object {
  
  var blocksCovered: Double = js.native
  
  var blocksNotCovered: Double = js.native
  
  var linesCovered: Double = js.native
  
  var linesNotCovered: Double = js.native
  
  var linesPartiallyCovered: Double = js.native
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
    val __obj = js.Dynamic.literal(blocksCovered = blocksCovered.asInstanceOf[js.Any], blocksNotCovered = blocksNotCovered.asInstanceOf[js.Any], linesCovered = linesCovered.asInstanceOf[js.Any], linesNotCovered = linesNotCovered.asInstanceOf[js.Any], linesPartiallyCovered = linesPartiallyCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageStatistics]
  }
  
  @scala.inline
  implicit class CoverageStatisticsOps[Self <: CoverageStatistics] (val x: Self) extends AnyVal {
    
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
    def setBlocksCovered(value: Double): Self = this.set("blocksCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksNotCovered(value: Double): Self = this.set("blocksNotCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesCovered(value: Double): Self = this.set("linesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesNotCovered(value: Double): Self = this.set("linesNotCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesPartiallyCovered(value: Double): Self = this.set("linesPartiallyCovered", value.asInstanceOf[js.Any])
  }
}
