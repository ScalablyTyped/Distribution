package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_BooleanDeclarationOption: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
}
object BooleanDeclarationOption {
  
  @scala.inline
  def apply(help: String, name: String, `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanDeclarationOption]
  }
  
  @scala.inline
  implicit class BooleanDeclarationOptionMutableBuilder[Self <: BooleanDeclarationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
