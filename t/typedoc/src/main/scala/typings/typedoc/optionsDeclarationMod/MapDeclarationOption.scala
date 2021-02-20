package typings.typedoc.optionsDeclarationMod

import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapDeclarationOption[T] extends DeclarationOptionBase {
  
  var defaultValue: T = js.native
  
  var map: (Map[String, T]) | (Record[String | Double, T]) = js.native
  
  var mapError: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_MapDeclarationOption: typings.typedoc.optionsDeclarationMod.ParameterType.Map = js.native
}
object MapDeclarationOption {
  
  @scala.inline
  def apply[T](
    defaultValue: T,
    help: String,
    map: (Map[String, T]) | (Record[String | Double, T]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map
  ): MapDeclarationOption[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDeclarationOption[T]]
  }
  
  @scala.inline
  implicit class MapDeclarationOptionMutableBuilder[Self <: MapDeclarationOption[_], T] (val x: Self with MapDeclarationOption[T]) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: (Map[String, T]) | (Record[String | Double, T])): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapError(value: String): Self = StObject.set(x, "mapError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapErrorUndefined: Self = StObject.set(x, "mapError", js.undefined)
    
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
