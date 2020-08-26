package typings.wechatMiniprogram.WechatMiniprogram.Page

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProperties extends js.Object {
  /** 页面的文件路径 */
  var is: String = js.native
  /** 打开当前页面路径中的参数 */
  var options: Record[String, js.UndefOr[String]] = js.native
  /** 到当前页面的路径 */
  var route: String = js.native
}

object InstanceProperties {
  @scala.inline
  def apply(is: String, options: Record[String, js.UndefOr[String]], route: String): InstanceProperties = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProperties]
  }
  @scala.inline
  implicit class InstancePropertiesOps[Self <: InstanceProperties] (val x: Self) extends AnyVal {
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
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Record[String, js.UndefOr[String]]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

