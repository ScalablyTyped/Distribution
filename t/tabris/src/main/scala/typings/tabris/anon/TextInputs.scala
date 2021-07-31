package typings.tabris.anon

import typings.tabris.mod.Flatten
import typings.tabris.mod.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputs extends StObject {
  
  var children: js.UndefOr[Flatten[String | TextInput]] = js.undefined
  
  var textInputs: js.UndefOr[scala.Nothing] = js.undefined
}
object TextInputs {
  
  @scala.inline
  def apply(): TextInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputs]
  }
  
  @scala.inline
  implicit class TextInputsMutableBuilder[Self <: TextInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Flatten[String | TextInput]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (String | TextInput)*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
