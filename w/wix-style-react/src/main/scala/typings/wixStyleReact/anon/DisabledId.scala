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
  
  inline def apply(id: String | Double, value: Partialselectedboolean => ReactNode): DisabledId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[DisabledId]
  }
  
  extension [Self <: DisabledId](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Partialselectedboolean => ReactNode): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
