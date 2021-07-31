package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(files: js.Any): String
}
object OnChange {
  
  @scala.inline
  def apply(onChange: js.Any => String): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit class OnChangeMutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: js.Any => String): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
  }
}
