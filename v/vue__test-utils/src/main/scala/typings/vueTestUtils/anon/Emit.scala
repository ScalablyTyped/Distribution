package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emit extends StObject {
  
  @JSName("$emit")
  def $emit(event: Any, args: Any*): Unit
}
object Emit {
  
  inline def apply($emit: (Any, /* repeated */ Any) => Unit): Emit = {
    val __obj = js.Dynamic.literal($emit = js.Any.fromFunction2($emit))
    __obj.asInstanceOf[Emit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emit] (val x: Self) extends AnyVal {
    
    inline def set$emit(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "$emit", js.Any.fromFunction2(value))
  }
}
