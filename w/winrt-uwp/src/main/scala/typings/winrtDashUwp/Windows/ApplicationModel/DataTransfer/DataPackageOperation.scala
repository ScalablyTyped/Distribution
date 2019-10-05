package typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer

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
  sealed trait copy extends DataPackageOperation
  
  /** Creates a link for the data. */
  @js.native
  sealed trait link extends DataPackageOperation
  
  /** Copies the content to the target destination and deletes the original. */
  @js.native
  sealed trait move extends DataPackageOperation
  
  /** No action. Typically used when the DataPackage object requires delayed rendering. */
  @js.native
  sealed trait none extends DataPackageOperation
  
  /* 1 */ val copy: typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy with Double = js.native
  /* 3 */ val link: typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link with Double = js.native
  /* 2 */ val move: typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPackageOperation with Double] = js.native
}

