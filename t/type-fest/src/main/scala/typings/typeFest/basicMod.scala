package typings.typeFest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  type Class[T, Arguments /* <: js.Array[Any] */] = (Constructor[T, Arguments]) & js.Object
  
  type Constructor[T, Arguments /* <: js.Array[Any] */] = Instantiable1[/* arguments_ */ Arguments, T]
  
  type JsonArray = js.Array[JsonValue]
  
  @js.native
  trait JsonObject extends StObject
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  type JsonValue = JsonPrimitive | JsonObject | Any
}
