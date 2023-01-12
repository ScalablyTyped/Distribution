package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinChunkSizePlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: MinChunkSizePluginOptions
}
object MinChunkSizePlugin {
  
  inline def apply(apply: Compiler => Unit, options: MinChunkSizePluginOptions): MinChunkSizePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinChunkSizePlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinChunkSizePlugin] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: MinChunkSizePluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
