package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  sealed trait archive
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /** The item is a directory. */
  @js.native
  sealed trait directory
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /** The item is locally incomplete. Windows only. */
  @js.native
  sealed trait locallyIncomplete
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /** The item is normal. That is, the item doesn't have any of the other values in the enumeration. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /** The item is read-only. */
  @js.native
  sealed trait readOnly
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /** The item is a temporary file. */
  @js.native
  sealed trait temporary
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes
  
  /* 3 */ val archive: archive with scala.Double = js.native
  /* 2 */ val directory: directory with scala.Double = js.native
  /* 5 */ val locallyIncomplete: locallyIncomplete with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val readOnly: readOnly with scala.Double = js.native
  /* 4 */ val temporary: temporary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes with scala.Double] = js.native
}

