package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitChunkCountPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: js.UndefOr[LimitChunkCountPluginOptions] = js.undefined
}
object LimitChunkCountPlugin {
  
  inline def apply(apply: Compiler => Unit): LimitChunkCountPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[LimitChunkCountPlugin]
  }
  
  extension [Self <: LimitChunkCountPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: LimitChunkCountPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
