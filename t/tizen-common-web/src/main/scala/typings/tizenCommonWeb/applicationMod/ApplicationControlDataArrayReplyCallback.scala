package typings.tizenCommonWeb.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationControlDataArrayReplyCallback extends js.Object {
  /**
    * Called when the callee application calls `RequestedApplicationControl.replyFailure()`.
    *
    */
  var onfailure: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the callee application calls `RequestedApplicationControl.replyResult()`.
    *
    *
    * @param data An array of `ApplicationControlData` objects.
    */
  var onsuccess: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Array[ApplicationControlData]], Unit]] = js.native
}

object ApplicationControlDataArrayReplyCallback {
  @scala.inline
  def apply(): ApplicationControlDataArrayReplyCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationControlDataArrayReplyCallback]
  }
  @scala.inline
  implicit class ApplicationControlDataArrayReplyCallbackOps[Self <: ApplicationControlDataArrayReplyCallback] (val x: Self) extends AnyVal {
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
    def setOnfailure(value: () => Unit): Self = this.set("onfailure", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnfailure: Self = this.set("onfailure", js.undefined)
    @scala.inline
    def setOnsuccess(value: /* data */ js.UndefOr[js.Array[ApplicationControlData]] => Unit): Self = this.set("onsuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnsuccess: Self = this.set("onsuccess", js.undefined)
  }
  
}

