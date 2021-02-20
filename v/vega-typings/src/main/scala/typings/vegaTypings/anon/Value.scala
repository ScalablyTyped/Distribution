package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value[T] extends BaseValueRef[T] {
  
  var value: T | Null = js.native
}
object Value {
  
  @scala.inline
  def apply[T](): Value[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value[T]]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value[_], T] (val x: Self with Value[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
