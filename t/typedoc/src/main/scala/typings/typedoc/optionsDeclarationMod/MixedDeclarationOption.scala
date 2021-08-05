package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  @JSName("type")
  var type_MixedDeclarationOption: Mixed
}
object MixedDeclarationOption {
  
  inline def apply(help: String, name: String, `type`: Mixed): MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedDeclarationOption]
  }
  
  extension [Self <: MixedDeclarationOption](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: Mixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
