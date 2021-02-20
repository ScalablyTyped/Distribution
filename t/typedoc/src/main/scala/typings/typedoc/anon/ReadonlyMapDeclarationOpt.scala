package typings.typedoc.anon

import typings.std.Map
import typings.std.Record
import typings.typedoc.optionsDeclarationMod.ParameterScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<unknown>> */
@js.native
trait ReadonlyMapDeclarationOpt extends StObject {
  
  val defaultValue: js.Any = js.native
  
  val help: String = js.native
  
  val map: (Map[String, _]) | (Record[String | Double, _]) = js.native
  
  val mapError: js.UndefOr[String] = js.native
  
  val name: String = js.native
  
  val scope: js.UndefOr[ParameterScope] = js.native
  
  val short: js.UndefOr[String] = js.native
  
  val `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map = js.native
}
object ReadonlyMapDeclarationOpt {
  
  @scala.inline
  def apply(
    defaultValue: js.Any,
    help: String,
    map: (Map[String, _]) | (Record[String | Double, _]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map
  ): ReadonlyMapDeclarationOpt = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMapDeclarationOpt]
  }
  
  @scala.inline
  implicit class ReadonlyMapDeclarationOptMutableBuilder[Self <: ReadonlyMapDeclarationOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: (Map[String, _]) | (Record[String | Double, _])): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapError(value: String): Self = StObject.set(x, "mapError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapErrorUndefined: Self = StObject.set(x, "mapError", js.undefined)
    
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
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
