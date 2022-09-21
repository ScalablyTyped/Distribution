package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.`self-declined`
import typings.webpack.webpackStrings.unaccepted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain
  extends StObject
     with HotEvent {
  
  /** the chain from where the update was propagated. */
  var chain: js.Array[Double]
  
  /** The module in question. */
  var moduleId: Double
  
  var `type`: `self-declined` | unaccepted
}
object Chain {
  
  inline def apply(chain: js.Array[Double], moduleId: Double, `type`: `self-declined` | unaccepted): Chain = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  
  extension [Self <: Chain](x: Self) {
    
    inline def setChain(value: js.Array[Double]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainVarargs(value: Double*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `self-declined` | unaccepted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
