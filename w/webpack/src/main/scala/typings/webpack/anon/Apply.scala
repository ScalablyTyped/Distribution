package typings.webpack.anon

import typings.webpack.mod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  @JSName("apply")
  def apply(arg0: Resolver): Unit
}
object Apply {
  
  inline def apply(apply: Resolver => Unit): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Apply]
  }
  
  extension [Self <: Apply](x: Self) {
    
    inline def setApply(value: Resolver => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
