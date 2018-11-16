package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderDepth extends js.Object

/** Indicates whether all files and subfolders of the folder being queried will be enumerated or if only the top-level files and subfolders will be enumerated. */
@JSGlobal("Windows.Storage.Search.FolderDepth")
@js.native
object FolderDepth extends js.Object {
  /** Perform a deep enumeration of the folder contents. Windows traverses through subfolders to discover content and presents the results in a single list that combines all discovered content. */
  @js.native
  sealed trait deep
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.FolderDepth
  
  /** Perform a shallow enumeration of the folder being queried. Only the top-level, child files and folders of the folder being queried will be returned. This is similar to the view that Windows Explorer would provide for the folder being queried. */
  @js.native
  sealed trait shallow
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.FolderDepth
  
  val deep: deep with java.lang.String = js.native
  val shallow: shallow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.FolderDepth with java.lang.String] = js.native
}

