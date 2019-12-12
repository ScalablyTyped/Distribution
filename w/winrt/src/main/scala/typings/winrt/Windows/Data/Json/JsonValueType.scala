package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Data.Json.JsonValueType.`object`
import typings.winrt.Windows.Data.Json.JsonValueType.array
import typings.winrt.Windows.Data.Json.JsonValueType.boolean
import typings.winrt.Windows.Data.Json.JsonValueType.null_
import typings.winrt.Windows.Data.Json.JsonValueType.number
import typings.winrt.Windows.Data.Json.JsonValueType.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsonValueType extends js.Object

@JSGlobal("Windows.Data.Json.JsonValueType")
@js.native
object JsonValueType extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsonValueType with Double] = js.native
  /* 4 */ @js.native
  object array extends TopLevel[array with Double]
  
  /* 1 */ @js.native
  object boolean extends TopLevel[boolean with Double]
  
  /* 0 */ @js.native
  object null_ extends TopLevel[null_ with Double]
  
  /* 2 */ @js.native
  object number extends TopLevel[number with Double]
  
  /* 5 */ @js.native
  object `object` extends TopLevel[`object` with Double]
  
  /* 3 */ @js.native
  object string extends TopLevel[string with Double]
  
}

