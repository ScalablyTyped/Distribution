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
  
  val archive: archive with java.lang.String = js.native
  val directory: directory with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val readOnly: readOnly with java.lang.String = js.native
  val temporary: temporary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.FileAttributes with java.lang.String] = js.native
}

