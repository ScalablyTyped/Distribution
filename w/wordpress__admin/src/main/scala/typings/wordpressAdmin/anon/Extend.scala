package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extend extends StObject {
  
  def extend(properties: Any): Any
  def extend(properties: Any, classProperties: Any): Any
  @JSName("extend")
  var extend_Original: FnCall
}
object Extend {
  
  inline def apply(extend: FnCall): Extend = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
  
  extension [Self <: Extend](x: Self) {
    
    inline def setExtend(value: FnCall): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
