package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageStatistics extends StObject {
  
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
  implicit class CoverageStatisticsMutableBuilder[Self <: CoverageStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocksCovered(value: Double): Self = StObject.set(x, "blocksCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksNotCovered(value: Double): Self = StObject.set(x, "blocksNotCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesCovered(value: Double): Self = StObject.set(x, "linesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesNotCovered(value: Double): Self = StObject.set(x, "linesNotCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesPartiallyCovered(value: Double): Self = StObject.set(x, "linesPartiallyCovered", value.asInstanceOf[js.Any])
  }
}
