package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueBoolean extends StObject {
  
  var value: Boolean = js.native
}
object ValueBoolean {
  
  @scala.inline
  def apply(value: Boolean): ValueBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueBoolean]
  }
  
  @scala.inline
  implicit class ValueBooleanMutableBuilder[Self <: ValueBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
