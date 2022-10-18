package typings.webpack.mod

import typings.webpack.anon.Dry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: Dry
}
object CleanPlugin {
  
  inline def apply(apply: Compiler => Unit, options: Dry): CleanPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanPlugin]
  }
  
  extension [Self <: CleanPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Dry): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
