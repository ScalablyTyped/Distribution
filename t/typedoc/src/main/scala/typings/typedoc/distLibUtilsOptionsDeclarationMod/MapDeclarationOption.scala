package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapDeclarationOption[T]
  extends StObject
     with DeclarationOptionBase {
  
  /**
    * Unlike the rest of the option types, there is no sensible generic default for mapped option types.
    * The default value for a mapped type must be specified.
    */
  var defaultValue: T
  
  /**
    * Maps a given value to the option type. The map type may be a TypeScript enum.
    * In that case, when generating an error message for a mismatched key, the numeric
    * keys will not be listed.
    */
  var map: (Map[String, T]) | (Record[String | Double, T])
  
  /**
    * Optional override for the error reported when an invalid key is provided.
    */
  var mapError: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_MapDeclarationOption: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map
}
object MapDeclarationOption {
  
  inline def apply[T](
    defaultValue: T,
    help: String,
    map: (Map[String, T]) | (Record[String | Double, T]),
    name: String,
    `type`: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map
  ): MapDeclarationOption[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDeclarationOption[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapDeclarationOption[?], T] (val x: Self & MapDeclarationOption[T]) extends AnyVal {
    
    inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMap(value: (Map[String, T]) | (Record[String | Double, T])): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapError(value: String): Self = StObject.set(x, "mapError", value.asInstanceOf[js.Any])
    
    inline def setMapErrorUndefined: Self = StObject.set(x, "mapError", js.undefined)
    
    inline def setType(value: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
