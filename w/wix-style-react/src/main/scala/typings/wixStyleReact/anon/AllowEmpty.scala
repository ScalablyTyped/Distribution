package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEmpty extends StObject {
  
  var allowEmpty: Requireable[Boolean]
  
  var current: Validator[js.Object]
  
  var hexPlaceholder: Requireable[String]
  
  var onAdd: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onChange: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var onEnter: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var showConverter: Validator[Boolean]
  
  var showInput: Validator[Boolean]
}
object AllowEmpty {
  
  inline def apply(
    allowEmpty: Requireable[Boolean],
    current: Validator[js.Object],
    hexPlaceholder: Requireable[String],
    onAdd: Requireable[js.Function1[/* repeated */ Any, Any]],
    onChange: Validator[js.Function1[/* repeated */ Any, Any]],
    onEnter: Validator[js.Function1[/* repeated */ Any, Any]],
    showConverter: Validator[Boolean],
    showInput: Validator[Boolean]
  ): AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], hexPlaceholder = hexPlaceholder.asInstanceOf[js.Any], onAdd = onAdd.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onEnter = onEnter.asInstanceOf[js.Any], showConverter = showConverter.asInstanceOf[js.Any], showInput = showInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmpty]
  }
  
  extension [Self <: AllowEmpty](x: Self) {
    
    inline def setAllowEmpty(value: Requireable[Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Validator[js.Object]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setHexPlaceholder(value: Requireable[String]): Self = StObject.set(x, "hexPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnEnter(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setShowConverter(value: Validator[Boolean]): Self = StObject.set(x, "showConverter", value.asInstanceOf[js.Any])
    
    inline def setShowInput(value: Validator[Boolean]): Self = StObject.set(x, "showInput", value.asInstanceOf[js.Any])
  }
}
