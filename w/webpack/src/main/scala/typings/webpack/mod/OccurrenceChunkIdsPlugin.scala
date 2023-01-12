package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OccurrenceChunkIdsPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: OccurrenceChunkIdsPluginOptions
}
object OccurrenceChunkIdsPlugin {
  
  inline def apply(apply: Compiler => Unit, options: OccurrenceChunkIdsPluginOptions): OccurrenceChunkIdsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OccurrenceChunkIdsPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OccurrenceChunkIdsPlugin] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: OccurrenceChunkIdsPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
