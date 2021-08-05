package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(files: js.Any): String
}
object OnChange {
  
  inline def apply(onChange: js.Any => String): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setOnChange(value: js.Any => String): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
  }
}
