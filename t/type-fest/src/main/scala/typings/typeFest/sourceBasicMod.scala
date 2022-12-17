package typings.typeFest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceBasicMod {
  
  type Class[T, Arguments /* <: js.Array[Any] */] = Constructor[T, Arguments]
  
  type Constructor[T, Arguments /* <: js.Array[Any] */] = Instantiable1[/* arguments_ */ Arguments, T]
  
  type JsonArray = js.Array[JsonValue]
  
  @js.native
  trait JsonObject extends StObject
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = type-fest.type-fest/source/basic.JsonPrimitive | type-fest.type-fest/source/basic.JsonObject | type-fest.type-fest/source/basic.JsonArray
  }}}
  to avoid circular code involving: 
  - type-fest.type-fest/source/basic.JsonArray
  - type-fest.type-fest/source/basic.JsonValue
  */
  type JsonValue = JsonPrimitive | JsonObject | Any
}
