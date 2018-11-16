package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPackageOperation extends js.Object

/** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  /** Copies the content to the target destination. */
  @js.native
  sealed trait copy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  /** Creates a link for the data. */
  @js.native
  sealed trait link
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  /** Copies the content to the target destination and deletes the original. */
  @js.native
  sealed trait move
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  /** No action. Typically used when the DataPackage object requires delayed rendering. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  val copy: copy with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val move: move with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation with java.lang.String
  ] = js.native
}

