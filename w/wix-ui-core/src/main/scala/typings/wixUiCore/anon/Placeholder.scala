package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var placeholder: js.Any
}
object Placeholder {
  
  @scala.inline
  def apply(placeholder: js.Any): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  @scala.inline
  implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: js.Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
