package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  /* 1 */ val copy: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy with Double = js.native
  /* 3 */ val link: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link with Double = js.native
  /* 2 */ val move: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation with Double
  ] = js.native
}

