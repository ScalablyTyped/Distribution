package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryOptionPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object EntryOptionPlugin {
  
  inline def apply(apply: Compiler => Unit): EntryOptionPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[EntryOptionPlugin]
  }
  
  extension [Self <: EntryOptionPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
