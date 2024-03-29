package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to undefined.
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  @JSName("type")
  var type_ObjectDeclarationOption: Object
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object ObjectDeclarationOption {
  
  inline def apply(help: String, name: String, `type`: Object): ObjectDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDeclarationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectDeclarationOption] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* value */ Any => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
