package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageDeleteOption extends js.Object

@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.StorageNs.StorageDeleteOption
  
  @js.native
  sealed trait permanentDelete
    extends winrtLib.WindowsNs.StorageNs.StorageDeleteOption
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val permanentDelete: permanentDelete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StorageDeleteOption with scala.Double] = js.native
}

