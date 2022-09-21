package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin instance.
  */
trait WebpackPluginInstance
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
  	 * The run point of the plugin, required method.
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object WebpackPluginInstance {
  
  inline def apply(apply: Compiler => Unit): WebpackPluginInstance = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[WebpackPluginInstance]
  }
  
  extension [Self <: WebpackPluginInstance](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
