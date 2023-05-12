package typings.tufjsModels

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTypesMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[key: string] : @tufjs/models.@tufjs/models/dist/utils/types.JSONValue}
  }}}
  to avoid circular code involving: 
  - @tufjs/models.@tufjs/models/dist/utils/types.JSONObject
  - @tufjs/models.@tufjs/models/dist/utils/types.JSONValue
  */
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = null | boolean | number | string | std.Array<@tufjs/models.@tufjs/models/dist/utils/types.JSONValue> | @tufjs/models.@tufjs/models/dist/utils/types.JSONObject
  }}}
  to avoid circular code involving: 
  - @tufjs/models.@tufjs/models/dist/utils/types.JSONValue
  */
  type JSONValue = Null | Boolean | Double | String | js.Array[Any] | JSONObject
}
