package typings.winrt.WindowsNs.DataNs.JsonNs

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
  
  /* 4 */ val array: typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.array with Double = js.native
  /* 1 */ val boolean: typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.boolean with Double = js.native
  /* 0 */ val null_ : typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.null_ with Double = js.native
  /* 2 */ val number: typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.number with Double = js.native
  /* 5 */ val `object`: typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.`object` with Double = js.native
  /* 3 */ val string: typings.winrt.WindowsNs.DataNs.JsonNs.JsonValueType.string with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsonValueType with Double] = js.native
}

