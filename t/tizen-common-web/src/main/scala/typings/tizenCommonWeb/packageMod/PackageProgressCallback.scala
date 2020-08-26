package typings.tizenCommonWeb.packageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageProgressCallback extends js.Object {
  /**
    * Called when the request is completed.
    *
    *
    * @param id The package ID.
    */
  def oncomplete(id: PackageId): Unit = js.native
  /**
    * Called while the request is in progress.
    * @param id The package ID.
    * @param progress The progress in percentage.
    */
  def onprogress(id: PackageId, progress: Double): Unit = js.native
}

object PackageProgressCallback {
  @scala.inline
  def apply(oncomplete: PackageId => Unit, onprogress: (PackageId, Double) => Unit): PackageProgressCallback = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onprogress = js.Any.fromFunction2(onprogress))
    __obj.asInstanceOf[PackageProgressCallback]
  }
  @scala.inline
  implicit class PackageProgressCallbackOps[Self <: PackageProgressCallback] (val x: Self) extends AnyVal {
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
    def setOncomplete(value: PackageId => Unit): Self = this.set("oncomplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnprogress(value: (PackageId, Double) => Unit): Self = this.set("onprogress", js.Any.fromFunction2(value))
  }
  
}

