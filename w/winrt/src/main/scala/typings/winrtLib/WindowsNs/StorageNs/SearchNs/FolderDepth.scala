package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderDepth extends js.Object

@JSGlobal("Windows.Storage.Search.FolderDepth")
@js.native
object FolderDepth extends js.Object {
  @js.native
  sealed trait deep
    extends winrtLib.WindowsNs.StorageNs.SearchNs.FolderDepth
  
  @js.native
  sealed trait shallow
    extends winrtLib.WindowsNs.StorageNs.SearchNs.FolderDepth
  
  /* 1 */ val deep: deep with scala.Double = js.native
  /* 0 */ val shallow: shallow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.FolderDepth with scala.Double] = js.native
}

