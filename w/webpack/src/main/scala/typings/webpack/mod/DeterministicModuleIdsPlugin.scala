package typings.webpack.mod

import typings.webpack.anon.FailOnConflict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeterministicModuleIdsPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: FailOnConflict
}
object DeterministicModuleIdsPlugin {
  
  inline def apply(apply: Compiler => Unit, options: FailOnConflict): DeterministicModuleIdsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeterministicModuleIdsPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeterministicModuleIdsPlugin] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: FailOnConflict): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
