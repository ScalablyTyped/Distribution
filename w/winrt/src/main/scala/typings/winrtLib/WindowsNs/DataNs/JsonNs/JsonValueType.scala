package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsonValueType extends js.Object

@JSGlobal("Windows.Data.Json.JsonValueType")
@js.native
object JsonValueType extends js.Object {
  @js.native
  sealed trait array
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  @js.native
  sealed trait boolean
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  @js.native
  sealed trait null_
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  @js.native
  sealed trait number
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  @js.native
  sealed trait `object`
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  @js.native
  sealed trait string
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType
  
  val array: array with java.lang.String = js.native
  val boolean: boolean with java.lang.String = js.native
  val null_ : null_ with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val `object`: `object` with java.lang.String = js.native
  val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType with java.lang.String] = js.native
}

