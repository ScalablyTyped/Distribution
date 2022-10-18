package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to 0.
    */
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Highest possible value.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Lowest possible value.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_NumberDeclarationOption: Number
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
}
object NumberDeclarationOption {
  
  inline def apply(help: String, name: String, `type`: Number): NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberDeclarationOption]
  }
  
  extension [Self <: NumberDeclarationOption](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* value */ Double => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
