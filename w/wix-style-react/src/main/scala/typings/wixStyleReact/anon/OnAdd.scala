package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAdd extends StObject {
  
  var current: Validator[js.Object]
  
  var dataHook: Requireable[String]
  
  var onAdd: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onChange: Validator[js.Function1[/* repeated */ Any, Any]]
}
object OnAdd {
  
  inline def apply(
    current: Validator[js.Object],
    dataHook: Requireable[String],
    onAdd: Requireable[js.Function1[/* repeated */ Any, Any]],
    onChange: Validator[js.Function1[/* repeated */ Any, Any]]
  ): OnAdd = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], onAdd = onAdd.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAdd]
  }
  
  extension [Self <: OnAdd](x: Self) {
    
    inline def setCurrent(value: Validator[js.Object]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
