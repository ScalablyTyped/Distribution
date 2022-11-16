package typings.typesJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("types-json/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBoolean(): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")().asInstanceOf[/* is boolean */ Boolean]
  inline def isBoolean(value: JSONValue): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isJSONArray(): /* is types-json.types-json/build.JSONArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONArray")().asInstanceOf[/* is types-json.types-json/build.JSONArray */ Boolean]
  inline def isJSONArray(value: JSONValue): /* is types-json.types-json/build.JSONArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is types-json.types-json/build.JSONArray */ Boolean]
  
  inline def isJSONObject(): /* is types-json.types-json/build.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONObject")().asInstanceOf[/* is types-json.types-json/build.JSONObject */ Boolean]
  inline def isJSONObject(value: JSONValue): /* is types-json.types-json/build.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is types-json.types-json/build.JSONObject */ Boolean]
  
  inline def isJSONValue(): /* is types-json.types-json/build.JSONValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONValue")().asInstanceOf[/* is types-json.types-json/build.JSONValue */ Boolean]
  inline def isJSONValue(value: JSONValue): /* is types-json.types-json/build.JSONValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is types-json.types-json/build.JSONValue */ Boolean]
  
  inline def isNull(): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")().asInstanceOf[/* is null */ Boolean]
  inline def isNull(value: JSONValue): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")().asInstanceOf[/* is number */ Boolean]
  inline def isNumber(value: JSONValue): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isString(): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[/* is string */ Boolean]
  inline def isString(value: JSONValue): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")().asInstanceOf[/* is undefined */ Boolean]
  inline def isUndefined(value: JSONValue): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  type JSONArray = js.Array[JSONValue]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in string ]:? types-json.types-json/build.JSONValue}
    }}}
    */
  @js.native
  trait JSONObject extends StObject
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = string | number | boolean | null | types-json.types-json/build.JSONObject | types-json.types-json/build.JSONArray
  }}}
  to avoid circular code involving: 
  - types-json.types-json/build.JSONArray
  - types-json.types-json/build.JSONValue
  */
  type JSONValue = String | Double | Boolean | Null | JSONObject | Any
}
