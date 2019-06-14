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
  
  /* 4 */ val array: array with scala.Double = js.native
  /* 1 */ val boolean: boolean with scala.Double = js.native
  /* 0 */ val null_ : null_ with scala.Double = js.native
  /* 2 */ val number: number with scala.Double = js.native
  /* 5 */ val `object`: `object` with scala.Double = js.native
  /* 3 */ val string: string with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DataNs.JsonNs.JsonValueType with scala.Double] = js.native
}

