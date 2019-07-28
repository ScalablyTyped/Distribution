package typings.winrtDashUwp.WindowsNs.StorageNs

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
  sealed trait file extends StorageItemTypes
  
  /** A folder that is represented as a StorageFolder instance. */
  @js.native
  sealed trait folder extends StorageItemTypes
  
  /** A storage item that is neither a file nor a folder. */
  @js.native
  sealed trait none extends StorageItemTypes
  
  /* 1 */ val file: typings.winrtDashUwp.WindowsNs.StorageNs.StorageItemTypes.file with Double = js.native
  /* 2 */ val folder: typings.winrtDashUwp.WindowsNs.StorageNs.StorageItemTypes.folder with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.StorageNs.StorageItemTypes.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageItemTypes with Double] = js.native
}

