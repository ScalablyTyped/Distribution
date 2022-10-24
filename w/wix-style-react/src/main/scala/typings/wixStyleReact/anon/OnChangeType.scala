package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChangeType extends StObject {
  
  def onChange(): Unit
  
  var `type`: String
}
object OnChangeType {
  
  inline def apply(onChange: () => Unit, `type`: String): OnChangeType = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeType]
  }
  
  extension [Self <: OnChangeType](x: Self) {
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
