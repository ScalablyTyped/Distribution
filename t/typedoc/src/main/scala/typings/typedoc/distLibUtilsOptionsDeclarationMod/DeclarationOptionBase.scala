package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationOptionBase extends StObject {
  
  /**
    * The help text to be displayed to the user when --help is passed.
    */
  var help: String
  
  /**
    * The option name.
    */
  var name: String
  
  /**
    * The parameter type, used to convert user configuration values into the expected type.
    * If not set, the type will be a string.
    */
  var `type`: js.UndefOr[ParameterType] = js.undefined
}
object DeclarationOptionBase {
  
  inline def apply(help: String, name: String): DeclarationOptionBase = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationOptionBase]
  }
  
  extension [Self <: DeclarationOptionBase](x: Self) {
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
