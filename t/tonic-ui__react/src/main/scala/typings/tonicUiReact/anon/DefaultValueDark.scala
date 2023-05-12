package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueDark extends StObject {
  
  var defaultValue: Dark
}
object DefaultValueDark {
  
  inline def apply(defaultValue: Dark): DefaultValueDark = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueDark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValueDark] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Dark): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
