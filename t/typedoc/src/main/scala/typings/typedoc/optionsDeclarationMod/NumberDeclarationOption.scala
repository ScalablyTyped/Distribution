package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_NumberDeclarationOption: Number
}
object NumberDeclarationOption {
  
  @scala.inline
  def apply(help: String, name: String, `type`: Number): NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberDeclarationOption]
  }
  
  @scala.inline
  implicit class NumberDeclarationOptionMutableBuilder[Self <: NumberDeclarationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
