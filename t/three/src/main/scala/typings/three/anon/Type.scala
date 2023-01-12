package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[T, U] extends StObject {
  
  var target: U
  
  var `type`: T
}
object Type {
  
  inline def apply[T, U](target: U, `type`: T): Type[T, U] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type[?, ?], T, U] (val x: Self & (Type[T, U])) extends AnyVal {
    
    inline def setTarget(value: U): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
