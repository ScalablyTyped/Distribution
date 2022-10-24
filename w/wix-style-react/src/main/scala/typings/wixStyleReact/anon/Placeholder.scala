package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var current: Validator[js.Object]
  
  var onChange: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var placeholder: Requireable[String]
}
object Placeholder {
  
  inline def apply(
    current: Validator[js.Object],
    onChange: Validator[js.Function1[/* repeated */ Any, Any]],
    placeholder: Requireable[String]
  ): Placeholder = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  extension [Self <: Placeholder](x: Self) {
    
    inline def setCurrent(value: Validator[js.Object]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: Requireable[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
