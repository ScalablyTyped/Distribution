package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[ParameterHint] = js.undefined
  
  @JSName("type")
  var type_StringDeclarationOption: js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType.String] = js.undefined
}
object StringDeclarationOption {
  
  @scala.inline
  def apply(help: String, name: String): StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeclarationOption]
  }
  
  @scala.inline
  implicit class StringDeclarationOptionMutableBuilder[Self <: StringDeclarationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setHint(value: ParameterHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
