package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinePlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var definitions: Record[String, CodeValue]
}
object DefinePlugin {
  
  inline def apply(apply: Compiler => Unit, definitions: Record[String, CodeValue]): DefinePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinePlugin]
  }
  
  extension [Self <: DefinePlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setDefinitions(value: Record[String, CodeValue]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
