package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideMedium[T] extends js.Object {
  var options: js.UndefOr[js.Object] = js.native
  def assignMedium(handler: MediumCallback[T]): Unit = js.native
  def assignSyncMedium(handler: MediumCallback[T]): Unit = js.native
  def read(): js.UndefOr[T] = js.native
  def useMedium(effect: T): removeCb = js.native
}

object SideMedium {
  @scala.inline
  def apply[T](
    assignMedium: MediumCallback[T] => Unit,
    assignSyncMedium: MediumCallback[T] => Unit,
    read: () => js.UndefOr[T],
    useMedium: T => removeCb
  ): SideMedium[T] = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    __obj.asInstanceOf[SideMedium[T]]
  }
  @scala.inline
  implicit class SideMediumOps[Self <: SideMedium[_], T] (val x: Self with SideMedium[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignMedium(value: MediumCallback[T] => Unit): Self = this.set("assignMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setAssignSyncMedium(value: MediumCallback[T] => Unit): Self = this.set("assignSyncMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: () => js.UndefOr[T]): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setUseMedium(value: T => removeCb): Self = this.set("useMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

