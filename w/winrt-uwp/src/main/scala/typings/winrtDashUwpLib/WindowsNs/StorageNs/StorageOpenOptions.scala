package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageOpenOptions extends js.Object

/** Provides options to use when opening a file. */
@JSGlobal("Windows.Storage.StorageOpenOptions")
@js.native
object StorageOpenOptions extends js.Object {
  /** Only allow the file to be read. */
  @js.native
  sealed trait allowOnlyReaders
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions
  
  /* 1 */ val allowOnlyReaders: allowOnlyReaders with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions with scala.Double] = js.native
}

