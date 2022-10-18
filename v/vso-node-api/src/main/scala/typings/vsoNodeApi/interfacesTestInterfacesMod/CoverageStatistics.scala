package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageStatistics extends StObject {
  
  var blocksCovered: Double
  
  var blocksNotCovered: Double
  
  var linesCovered: Double
  
  var linesNotCovered: Double
  
  var linesPartiallyCovered: Double
}
object CoverageStatistics {
  
  inline def apply(
    blocksCovered: Double,
    blocksNotCovered: Double,
    linesCovered: Double,
    linesNotCovered: Double,
    linesPartiallyCovered: Double
  ): CoverageStatistics = {
    val __obj = js.Dynamic.literal(blocksCovered = blocksCovered.asInstanceOf[js.Any], blocksNotCovered = blocksNotCovered.asInstanceOf[js.Any], linesCovered = linesCovered.asInstanceOf[js.Any], linesNotCovered = linesNotCovered.asInstanceOf[js.Any], linesPartiallyCovered = linesPartiallyCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageStatistics]
  }
  
  extension [Self <: CoverageStatistics](x: Self) {
    
    inline def setBlocksCovered(value: Double): Self = StObject.set(x, "blocksCovered", value.asInstanceOf[js.Any])
    
    inline def setBlocksNotCovered(value: Double): Self = StObject.set(x, "blocksNotCovered", value.asInstanceOf[js.Any])
    
    inline def setLinesCovered(value: Double): Self = StObject.set(x, "linesCovered", value.asInstanceOf[js.Any])
    
    inline def setLinesNotCovered(value: Double): Self = StObject.set(x, "linesNotCovered", value.asInstanceOf[js.Any])
    
    inline def setLinesPartiallyCovered(value: Double): Self = StObject.set(x, "linesPartiallyCovered", value.asInstanceOf[js.Any])
  }
}
