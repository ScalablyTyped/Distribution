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
  
  val allowOnlyReaders: allowOnlyReaders with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions with java.lang.String] = js.native
}

