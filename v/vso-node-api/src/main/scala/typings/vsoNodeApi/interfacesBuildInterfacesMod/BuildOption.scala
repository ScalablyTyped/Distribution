package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOption extends StObject {
  
  /**
    * A reference to the build option.
    */
  var definition: BuildOptionDefinitionReference
  
  /**
    * Indicates whether the behavior is enabled.
    */
  var enabled: Boolean
  
  var inputs: StringDictionary[String]
}
object BuildOption {
  
  inline def apply(definition: BuildOptionDefinitionReference, enabled: Boolean, inputs: StringDictionary[String]): BuildOption = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildOption] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: BuildOptionDefinitionReference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
