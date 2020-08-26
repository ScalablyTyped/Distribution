package typings.wechatMiniprogram

import typings.wechatMiniprogram.anon.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInitCloudConfig extends js.Object {
  var env: js.UndefOr[String | Database] = js.native
  var traceUser: js.UndefOr[Boolean] = js.native
}

object IInitCloudConfig {
  @scala.inline
  def apply(): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitCloudConfig]
  }
  @scala.inline
  implicit class IInitCloudConfigOps[Self <: IInitCloudConfig] (val x: Self) extends AnyVal {
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
    def setEnv(value: String | Database): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setTraceUser(value: Boolean): Self = this.set("traceUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceUser: Self = this.set("traceUser", js.undefined)
  }
  
}

