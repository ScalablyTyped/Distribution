package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NaturalModuleIdsPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object NaturalModuleIdsPlugin {
  
  inline def apply(apply: Compiler => Unit): NaturalModuleIdsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[NaturalModuleIdsPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NaturalModuleIdsPlugin] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
