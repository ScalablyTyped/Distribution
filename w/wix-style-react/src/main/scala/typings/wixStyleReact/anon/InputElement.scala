package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputElement extends StObject {
  
  var disableEditing: Boolean
  
  var inputElement: typings.react.mod.global.JSX.Element
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var value: Any
}
object InputElement {
  
  inline def apply(disableEditing: Boolean, inputElement: typings.react.mod.global.JSX.Element, value: Any): InputElement = {
    val __obj = js.Dynamic.literal(disableEditing = disableEditing.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputElement]
  }
  
  extension [Self <: InputElement](x: Self) {
    
    inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
    
    inline def setInputElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
