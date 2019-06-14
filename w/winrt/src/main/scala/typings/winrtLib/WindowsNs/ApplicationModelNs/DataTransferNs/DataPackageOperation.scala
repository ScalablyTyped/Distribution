package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPackageOperation extends js.Object

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  @js.native
  sealed trait copy
    extends winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  @js.native
  sealed trait link
    extends winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  @js.native
  sealed trait move
    extends winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation
  
  /* 1 */ val copy: copy with scala.Double = js.native
  /* 3 */ val link: link with scala.Double = js.native
  /* 2 */ val move: move with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation with scala.Double
  ] = js.native
}

