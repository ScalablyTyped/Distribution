package typings.webpack.mod

import typings.webpack.webpackStrings.boolean
import typings.webpack.webpackStrings.number
import typings.webpack.webpackStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument extends StObject {
  
  var configs: js.Array[ArgumentConfig]
  
  var description: String
  
  var multiple: Boolean
  
  var simpleType: string | number | boolean
}
object Argument {
  
  inline def apply(
    configs: js.Array[ArgumentConfig],
    description: String,
    multiple: Boolean,
    simpleType: string | number | boolean
  ): Argument = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], simpleType = simpleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  
  extension [Self <: Argument](x: Self) {
    
    inline def setConfigs(value: js.Array[ArgumentConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsVarargs(value: ArgumentConfig*): Self = StObject.set(x, "configs", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setSimpleType(value: string | number | boolean): Self = StObject.set(x, "simpleType", value.asInstanceOf[js.Any])
  }
}
