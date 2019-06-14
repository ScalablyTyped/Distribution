package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAttributes extends js.Object

@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends js.Object {
  @js.native
  sealed trait archive
    extends winrtLib.WindowsNs.StorageNs.FileAttributes
  
  @js.native
  sealed trait directory
    extends winrtLib.WindowsNs.StorageNs.FileAttributes
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.StorageNs.FileAttributes
  
  @js.native
  sealed trait readOnly
    extends winrtLib.WindowsNs.StorageNs.FileAttributes
  
  @js.native
  sealed trait temporary
    extends winrtLib.WindowsNs.StorageNs.FileAttributes
  
  /* 3 */ val archive: archive with scala.Double = js.native
  /* 2 */ val directory: directory with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val readOnly: readOnly with scala.Double = js.native
  /* 4 */ val temporary: temporary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FileAttributes with scala.Double] = js.native
}

