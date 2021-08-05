package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterScope
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.NumberDeclarationOption> */
trait ReadonlyNumberDeclaration extends StObject {
  
  val defaultValue: js.UndefOr[Double] = js.undefined
  
  val help: String
  
  val maxValue: js.UndefOr[Double] = js.undefined
  
  val minValue: js.UndefOr[Double] = js.undefined
  
  val name: String
  
  val scope: js.UndefOr[ParameterScope] = js.undefined
  
  val short: js.UndefOr[String] = js.undefined
  
  val `type`: Number
}
object ReadonlyNumberDeclaration {
  
  inline def apply(help: String, name: String, `type`: Number): ReadonlyNumberDeclaration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNumberDeclaration]
  }
  
  extension [Self <: ReadonlyNumberDeclaration](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
