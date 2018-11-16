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
  
  val deep: deep with java.lang.String = js.native
  val shallow: shallow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.FolderDepth with java.lang.String] = js.native
}

