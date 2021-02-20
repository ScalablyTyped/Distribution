package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonValueType extends StObject
@JSGlobal("Windows.Data.Json.JsonValueType")
@js.native
object JsonValueType extends StObject {
  
  @js.native
  sealed trait array extends JsonValueType
  
  @js.native
  sealed trait boolean extends JsonValueType
  
  @js.native
  sealed trait null_ extends JsonValueType
  
  @js.native
  sealed trait number extends JsonValueType
  
  @js.native
  sealed trait `object` extends JsonValueType
  
  @js.native
  sealed trait string extends JsonValueType
}
