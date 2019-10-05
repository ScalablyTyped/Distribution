package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPackageOperation extends js.Object

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  @js.native
  sealed trait copy extends DataPackageOperation
  
  @js.native
  sealed trait link extends DataPackageOperation
  
  @js.native
  sealed trait move extends DataPackageOperation
  
  @js.native
  sealed trait none extends DataPackageOperation
  
  /* 1 */ val copy: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy with Double = js.native
  /* 3 */ val link: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link with Double = js.native
  /* 2 */ val move: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPackageOperation with Double] = js.native
}

