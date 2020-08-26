package typings.tizenCommonWeb.applicationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationUsage extends js.Object {
  /**
    * An attribute to store the ID of an application.
    */
  val appId: ApplicationId = js.native
  /**
    * An attribute to store the last time when the application was used.
    */
  val lastTime: Date = js.native
  /**
    * An attribute to store the total number of times the application was in the foreground.
    */
  val totalCount: Double = js.native
  /**
    * An attribute to store the total time of application usage in seconds.
    */
  val totalDuration: Double = js.native
}

object ApplicationUsage {
  @scala.inline
  def apply(appId: ApplicationId, lastTime: Date, totalCount: Double, totalDuration: Double): ApplicationUsage = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationUsage]
  }
  @scala.inline
  implicit class ApplicationUsageOps[Self <: ApplicationUsage] (val x: Self) extends AnyVal {
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
    def setAppId(value: ApplicationId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastTime(value: Date): Self = this.set("lastTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalDuration(value: Double): Self = this.set("totalDuration", value.asInstanceOf[js.Any])
  }
  
}

