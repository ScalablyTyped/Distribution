package typings.webpack.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.accepted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutdatedDependencies
  extends StObject
     with HotEvent {
  
  /** the chain from where the update was propagated. */
  var chain: js.Array[Double]
  
  /** The module in question. */
  var moduleId: Double
  
  /** the accepted dependencies that are outdated */
  var outdatedDependencies: NumberDictionary[js.Array[Double]]
  
  /** the modules that are outdated and will be disposed */
  var outdatedModules: js.Array[Double]
  
  var `type`: accepted
}
object OutdatedDependencies {
  
  inline def apply(
    chain: js.Array[Double],
    moduleId: Double,
    outdatedDependencies: NumberDictionary[js.Array[Double]],
    outdatedModules: js.Array[Double]
  ): OutdatedDependencies = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], outdatedDependencies = outdatedDependencies.asInstanceOf[js.Any], outdatedModules = outdatedModules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accepted")
    __obj.asInstanceOf[OutdatedDependencies]
  }
  
  extension [Self <: OutdatedDependencies](x: Self) {
    
    inline def setChain(value: js.Array[Double]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainVarargs(value: Double*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setOutdatedDependencies(value: NumberDictionary[js.Array[Double]]): Self = StObject.set(x, "outdatedDependencies", value.asInstanceOf[js.Any])
    
    inline def setOutdatedModules(value: js.Array[Double]): Self = StObject.set(x, "outdatedModules", value.asInstanceOf[js.Any])
    
    inline def setOutdatedModulesVarargs(value: Double*): Self = StObject.set(x, "outdatedModules", js.Array(value*))
    
    inline def setType(value: accepted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
