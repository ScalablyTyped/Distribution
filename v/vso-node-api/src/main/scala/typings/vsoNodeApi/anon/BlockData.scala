package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockData extends StObject {
  
  var blockData: scala.Double = js.native
  
  var functions: scala.Double = js.native
  
  var modules: scala.Double = js.native
}
object BlockData {
  
  @scala.inline
  def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockData]
  }
  
  @scala.inline
  implicit class BlockDataMutableBuilder[Self <: BlockData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockData(value: scala.Double): Self = StObject.set(x, "blockData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: scala.Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: scala.Double): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
  }
}
