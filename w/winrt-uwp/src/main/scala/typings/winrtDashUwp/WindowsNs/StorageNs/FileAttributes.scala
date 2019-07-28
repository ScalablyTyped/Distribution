package typings.winrtDashUwp.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAttributes extends js.Object

/** Describes the attributes of a file or folder. */
@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends js.Object {
  /** The item is archived. */
  @js.native
  sealed trait archive extends FileAttributes
  
  /** The item is a directory. */
  @js.native
  sealed trait directory extends FileAttributes
  
  /** The item is locally incomplete. Windows only. */
  @js.native
  sealed trait locallyIncomplete extends FileAttributes
  
  /** The item is normal. That is, the item doesn't have any of the other values in the enumeration. */
  @js.native
  sealed trait normal extends FileAttributes
  
  /** The item is read-only. */
  @js.native
  sealed trait readOnly extends FileAttributes
  
  /** The item is a temporary file. */
  @js.native
  sealed trait temporary extends FileAttributes
  
  /* 3 */ val archive: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.archive with Double = js.native
  /* 2 */ val directory: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.directory with Double = js.native
  /* 5 */ val locallyIncomplete: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.locallyIncomplete with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.normal with Double = js.native
  /* 1 */ val readOnly: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.readOnly with Double = js.native
  /* 4 */ val temporary: typings.winrtDashUwp.WindowsNs.StorageNs.FileAttributes.temporary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAttributes with Double] = js.native
}

