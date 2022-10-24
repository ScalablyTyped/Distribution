package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDataHook extends StObject {
  
  /** The current Hue value */
  var current: Validator[js.Object]
  
  /** Applied as data-hook HTML attribute that can be used to create driver in testing */
  var dataHook: Requireable[String]
  
  /** A callback function that will be triggered when the value is changed */
  var onChange: Validator[js.Function1[/* repeated */ Any, Any]]
}
object CurrentDataHook {
  
  inline def apply(
    current: Validator[js.Object],
    dataHook: Requireable[String],
    onChange: Validator[js.Function1[/* repeated */ Any, Any]]
  ): CurrentDataHook = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDataHook]
  }
  
  extension [Self <: CurrentDataHook](x: Self) {
    
    inline def setCurrent(value: Validator[js.Object]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
