package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

/** Describes whether an item that implements the IStorageItem interface is a file or a folder. */
@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  /** A file that is represented as a StorageFile instance. */
  @js.native
  sealed trait file
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes
  
  /** A folder that is represented as a StorageFolder instance. */
  @js.native
  sealed trait folder
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes
  
  /** A storage item that is neither a file nor a folder. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes
  
  val file: file with java.lang.String = js.native
  val folder: folder with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes with java.lang.String] = js.native
}

