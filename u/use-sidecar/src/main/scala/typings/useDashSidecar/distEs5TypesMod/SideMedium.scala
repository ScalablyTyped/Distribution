package typings.useDashSidecar.distEs5TypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideMedium[T] extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
  def assignMedium(handler: MediumCallback[T]): Unit
  def assignSyncMedium(handler: MediumCallback[T]): Unit
  def read(): js.UndefOr[T]
  def useMedium(effect: T): removeCb
}

object SideMedium {
  @scala.inline
  def apply[T](
    assignMedium: MediumCallback[T] => Unit,
    assignSyncMedium: MediumCallback[T] => Unit,
    read: () => js.UndefOr[T],
    useMedium: T => removeCb,
    options: js.Object = null
  ): SideMedium[T] = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideMedium[T]]
  }
}

