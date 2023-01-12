package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to the empty string for both `String` and `Path`.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * An optional hint for the type of input expected, will be displayed in the help output.
    */
  var hint: js.UndefOr[ParameterHint] = js.undefined
  
  /**
    * Specifies the resolution strategy. If `Path` is provided, values will be resolved according to their
    * location in a file. If `String` or no value is provided, values will not be resolved.
    */
  @JSName("type")
  var type_StringDeclarationOption: js.UndefOr[typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String | Path] = js.undefined
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
}
object StringDeclarationOption {
  
  inline def apply(help: String, name: String): StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeclarationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringDeclarationOption] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setHint(value: ParameterHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setType(value: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String | Path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(value: /* value */ String => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
