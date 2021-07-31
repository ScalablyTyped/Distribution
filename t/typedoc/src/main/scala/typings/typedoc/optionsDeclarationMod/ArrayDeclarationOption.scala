package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_ArrayDeclarationOption: Array
}
object ArrayDeclarationOption {
  
  @scala.inline
  def apply(help: String, name: String, `type`: Array): ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayDeclarationOption]
  }
  
  @scala.inline
  implicit class ArrayDeclarationOptionMutableBuilder[Self <: ArrayDeclarationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
