package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  var key: String = js.native
  @JSName("success")
  var success_RemoveStorageOptions: js.UndefOr[js.Function1[/* res */ DataResponse, Unit]] = js.native
}

object RemoveStorageOptions {
  @scala.inline
  def apply(key: String): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageOptions]
  }
  @scala.inline
  implicit class RemoveStorageOptionsOps[Self <: RemoveStorageOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ DataResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

