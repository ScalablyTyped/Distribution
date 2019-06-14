package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

/** Specifies whether to access a file in read-only mode or in read/write mode. */
@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  /** Access the file stream in read-only mode. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAccessMode
  
  /** Access the file stream in read/write mode. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.StorageNs.FileAccessMode
  
  /* 0 */ val read: read with scala.Double = js.native
  /* 1 */ val readWrite: readWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.FileAccessMode with scala.Double] = js.native
}

