package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value[T] extends StObject {
  
  var value: T = js.native
}
object Value {
  
  @scala.inline
  def apply[T](value: T): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value[_], T] (val x: Self with Value[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
