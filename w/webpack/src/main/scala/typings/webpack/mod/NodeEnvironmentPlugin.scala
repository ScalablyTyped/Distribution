package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeEnvironmentPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: typings.webpack.anon.InfrastructureLogging
}
object NodeEnvironmentPlugin {
  
  inline def apply(apply: Compiler => Unit, options: typings.webpack.anon.InfrastructureLogging): NodeEnvironmentPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeEnvironmentPlugin]
  }
  
  extension [Self <: NodeEnvironmentPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: typings.webpack.anon.InfrastructureLogging): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
