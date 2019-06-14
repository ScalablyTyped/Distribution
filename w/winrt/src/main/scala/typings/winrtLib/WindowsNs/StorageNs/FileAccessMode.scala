package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  @js.native
  sealed trait read
    extends winrtLib.WindowsNs.StorageNs.FileAccessMode
  
  @js.native
  sealed trait readWrite
    extends winrtLib.WindowsNs.StorageNs.FileAccessMode
  
  /* 0 */ val read: read with scala.Double = js.native
  /* 1 */ val readWrite: readWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FileAccessMode with scala.Double] = js.native
}

