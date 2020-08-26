package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestLabData extends js.Object {
  var `test[cron]`: js.UndefOr[String] = js.native
  var `test[enabled]`: js.UndefOr[Boolean] = js.native
  var `test[name]`: js.UndefOr[String] = js.native
  var `test[url]`: js.UndefOr[String] = js.native
}

object TestLabData {
  @scala.inline
  def apply(): TestLabData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestLabData]
  }
  @scala.inline
  implicit class TestLabDataOps[Self <: TestLabData] (val x: Self) extends AnyVal {
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
    def `setTest[cron]`(value: String): Self = this.set("test[cron]", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTest[cron]`: Self = this.set("test[cron]", js.undefined)
    @scala.inline
    def `setTest[enabled]`(value: Boolean): Self = this.set("test[enabled]", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTest[enabled]`: Self = this.set("test[enabled]", js.undefined)
    @scala.inline
    def `setTest[name]`(value: String): Self = this.set("test[name]", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTest[name]`: Self = this.set("test[name]", js.undefined)
    @scala.inline
    def `setTest[url]`(value: String): Self = this.set("test[url]", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTest[url]`: Self = this.set("test[url]", js.undefined)
  }
  
}

