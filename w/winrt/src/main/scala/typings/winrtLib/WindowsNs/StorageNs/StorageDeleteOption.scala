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
  
  val default: default with java.lang.String = js.native
  val permanentDelete: permanentDelete with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StorageDeleteOption with java.lang.String] = js.native
}

