package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledId extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  def value(data: Partialselectedboolean): ReactNode
}
object DisabledId {
  
  @scala.inline
  def apply(id: String | Double, value: Partialselectedboolean => ReactNode): DisabledId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[DisabledId]
  }
  
  @scala.inline
  implicit class DisabledIdMutableBuilder[Self <: DisabledId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Partialselectedboolean => ReactNode): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
