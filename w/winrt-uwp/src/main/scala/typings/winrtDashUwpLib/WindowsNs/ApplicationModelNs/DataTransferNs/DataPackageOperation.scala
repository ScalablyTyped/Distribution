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
  
  /* 1 */ val copy: copy with scala.Double = js.native
  /* 3 */ val link: link with scala.Double = js.native
  /* 2 */ val move: move with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation with scala.Double
  ] = js.native
}

