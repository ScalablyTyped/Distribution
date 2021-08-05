package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterHint
import typings.typedoc.optionsDeclarationMod.ParameterScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.StringDeclarationOption> */
trait ReadonlyStringDeclaration extends StObject {
  
  val defaultValue: js.UndefOr[String] = js.undefined
  
  val help: String
  
  val hint: js.UndefOr[ParameterHint] = js.undefined
  
  val name: String
  
  val scope: js.UndefOr[ParameterScope] = js.undefined
  
  val short: js.UndefOr[String] = js.undefined
  
  val `type`: js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType.String] = js.undefined
}
object ReadonlyStringDeclaration {
  
  inline def apply(help: String, name: String): ReadonlyStringDeclaration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyStringDeclaration]
  }
  
  extension [Self <: ReadonlyStringDeclaration](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHint(value: ParameterHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
