package typings.tizenCommonWeb.packageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageInformationEventCallback extends js.Object {
  /**
    * Called when a package is installed.
    * @param info The information of the installed package.
    */
  def oninstalled(info: PackageInformation): Unit = js.native
  /**
    * Called when a package is uninstalled.
    * @param id The ID of the uninstalled package.
    */
  def onuninstalled(id: PackageId): Unit = js.native
  /**
    * Called when a package is updated.
    * @param info The information of the updated package.
    */
  def onupdated(info: PackageInformation): Unit = js.native
}

object PackageInformationEventCallback {
  @scala.inline
  def apply(
    oninstalled: PackageInformation => Unit,
    onuninstalled: PackageId => Unit,
    onupdated: PackageInformation => Unit
  ): PackageInformationEventCallback = {
    val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1(oninstalled), onuninstalled = js.Any.fromFunction1(onuninstalled), onupdated = js.Any.fromFunction1(onupdated))
    __obj.asInstanceOf[PackageInformationEventCallback]
  }
  @scala.inline
  implicit class PackageInformationEventCallbackOps[Self <: PackageInformationEventCallback] (val x: Self) extends AnyVal {
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
    def setOninstalled(value: PackageInformation => Unit): Self = this.set("oninstalled", js.Any.fromFunction1(value))
    @scala.inline
    def setOnuninstalled(value: PackageId => Unit): Self = this.set("onuninstalled", js.Any.fromFunction1(value))
    @scala.inline
    def setOnupdated(value: PackageInformation => Unit): Self = this.set("onupdated", js.Any.fromFunction1(value))
  }
  
}

