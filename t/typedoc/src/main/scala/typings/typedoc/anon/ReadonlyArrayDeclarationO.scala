package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterScope
import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.ArrayDeclarationOption> */
trait ReadonlyArrayDeclarationO extends StObject {
  
  val defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  
  val help: String
  
  val name: String
  
  val scope: js.UndefOr[ParameterScope] = js.undefined
  
  val short: js.UndefOr[String] = js.undefined
  
  val `type`: Array
}
object ReadonlyArrayDeclarationO {
  
  inline def apply(help: String, name: String, `type`: Array): ReadonlyArrayDeclarationO = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyArrayDeclarationO]
  }
  
  extension [Self <: ReadonlyArrayDeclarationO](x: Self) {
    
    inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
