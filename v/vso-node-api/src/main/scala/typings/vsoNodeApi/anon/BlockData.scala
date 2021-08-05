package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockData extends StObject {
  
  var blockData: scala.Double
  
  var functions: scala.Double
  
  var modules: scala.Double
}
object BlockData {
  
  inline def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockData]
  }
  
  extension [Self <: BlockData](x: Self) {
    
    inline def setBlockData(value: scala.Double): Self = StObject.set(x, "blockData", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: scala.Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setModules(value: scala.Double): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
  }
}
