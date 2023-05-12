package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultT[T] extends StObject {
  
  var default: T
}
object DefaultT {
  
  inline def apply[T](default: T): DefaultT[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultT[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultT[?], T] (val x: Self & DefaultT[T]) extends AnyVal {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
