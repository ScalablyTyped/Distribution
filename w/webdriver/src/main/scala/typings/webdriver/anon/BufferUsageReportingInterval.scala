package typings.webdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferUsageReportingInterval extends js.Object {
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.native
  var enableNetwork: js.UndefOr[Boolean] = js.native
  var enablePage: js.UndefOr[Boolean] = js.native
  var enableTimeline: js.UndefOr[Boolean] = js.native
  var tracingCategories: js.UndefOr[Boolean] = js.native
}

object BufferUsageReportingInterval {
  @scala.inline
  def apply(): BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferUsageReportingInterval]
  }
  @scala.inline
  implicit class BufferUsageReportingIntervalOps[Self <: BufferUsageReportingInterval] (val x: Self) extends AnyVal {
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
    def setBufferUsageReportingInterval(value: Boolean): Self = this.set("bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferUsageReportingInterval: Self = this.set("bufferUsageReportingInterval", js.undefined)
    @scala.inline
    def setEnableNetwork(value: Boolean): Self = this.set("enableNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNetwork: Self = this.set("enableNetwork", js.undefined)
    @scala.inline
    def setEnablePage(value: Boolean): Self = this.set("enablePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePage: Self = this.set("enablePage", js.undefined)
    @scala.inline
    def setEnableTimeline(value: Boolean): Self = this.set("enableTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTimeline: Self = this.set("enableTimeline", js.undefined)
    @scala.inline
    def setTracingCategories(value: Boolean): Self = this.set("tracingCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingCategories: Self = this.set("tracingCategories", js.undefined)
  }
  
}

