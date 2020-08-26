package typings.tizenCommonWeb.applicationMod

import typings.tizenCommonWeb.packageMod.PackageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInformationEventCallback extends js.Object {
  /**
    * Called when an application is installed.
    *
    * @param info The information of the installed application.
    */
  var oninstalled: js.UndefOr[js.Function1[/* info */ ApplicationInformation, Unit]] = js.native
  /**
    * Called when an application is uninstalled.
    *
    * @param id The ID of the uninstalled application.
    */
  var onuninstalled: js.UndefOr[js.Function1[/* id */ PackageId, Unit]] = js.native
  /**
    * Called when an application is updated.
    *
    * @param info The information of the updated application.
    */
  var onupdated: js.UndefOr[js.Function1[/* info */ ApplicationInformation, Unit]] = js.native
}

object ApplicationInformationEventCallback {
  @scala.inline
  def apply(): ApplicationInformationEventCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInformationEventCallback]
  }
  @scala.inline
  implicit class ApplicationInformationEventCallbackOps[Self <: ApplicationInformationEventCallback] (val x: Self) extends AnyVal {
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
    def setOninstalled(value: /* info */ ApplicationInformation => Unit): Self = this.set("oninstalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOninstalled: Self = this.set("oninstalled", js.undefined)
    @scala.inline
    def setOnuninstalled(value: /* id */ PackageId => Unit): Self = this.set("onuninstalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnuninstalled: Self = this.set("onuninstalled", js.undefined)
    @scala.inline
    def setOnupdated(value: /* info */ ApplicationInformation => Unit): Self = this.set("onupdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnupdated: Self = this.set("onupdated", js.undefined)
  }
  
}

