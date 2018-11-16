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
  
  val copy: copy with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val move: move with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageOperation with java.lang.String
  ] = js.native
}

