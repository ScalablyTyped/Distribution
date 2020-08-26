package typings.weixinApp.wx

import typings.weixinApp.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatOptions
  extends BaseOptions[js.Any, js.Any] {
  var path: String = js.native
   // 文件/目录路径
  var recursive: js.UndefOr[Boolean] = js.native
   // 是否递归,默认false
  @JSName("success")
  var success_StatOptions: js.UndefOr[js.Function1[/* res */ Stats, Unit]] = js.native
}

object StatOptions {
  @scala.inline
  def apply(path: String): StatOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  @scala.inline
  implicit class StatOptionsOps[Self <: StatOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ Stats => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

