package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.declined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentId
  extends StObject
     with HotEvent {
  
  /** the chain from where the update was propagated. */
  var chain: js.Array[Double]
  
  /** The module in question. */
  var moduleId: Double
  
  /** the module id of the declining parent */
  var parentId: Double
  
  var `type`: declined
}
object ParentId {
  
  inline def apply(chain: js.Array[Double], moduleId: Double, parentId: Double): ParentId = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("declined")
    __obj.asInstanceOf[ParentId]
  }
  
  extension [Self <: ParentId](x: Self) {
    
    inline def setChain(value: js.Array[Double]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainVarargs(value: Double*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setType(value: declined): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
