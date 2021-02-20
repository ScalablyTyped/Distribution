package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.BooleanDeclarationOption> */
@js.native
trait ReadonlyBooleanDeclaratio extends StObject {
  
  val defaultValue: js.UndefOr[Boolean] = js.native
  
  val help: String = js.native
  
  val name: String = js.native
  
  val scope: js.UndefOr[ParameterScope] = js.native
  
  val short: js.UndefOr[String] = js.native
  
  val `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean = js.native
}
object ReadonlyBooleanDeclaratio {
  
  @scala.inline
  def apply(help: String, name: String, `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): ReadonlyBooleanDeclaratio = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyBooleanDeclaratio]
  }
  
  @scala.inline
  implicit class ReadonlyBooleanDeclaratioMutableBuilder[Self <: ReadonlyBooleanDeclaratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
