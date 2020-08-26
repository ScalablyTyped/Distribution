package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExtConfigSyncRes extends js.Object {
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.native
}

object GetExtConfigSyncRes {
  @scala.inline
  def apply(): GetExtConfigSyncRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigSyncRes]
  }
  @scala.inline
  implicit class GetExtConfigSyncResOps[Self <: GetExtConfigSyncRes] (val x: Self) extends AnyVal {
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
    def setExtConfig(value: js.Any): Self = this.set("extConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtConfig: Self = this.set("extConfig", js.undefined)
  }
  
}

