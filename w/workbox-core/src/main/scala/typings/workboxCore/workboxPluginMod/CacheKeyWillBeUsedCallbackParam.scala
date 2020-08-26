package typings.workboxCore.workboxPluginMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheKeyWillBeUsedCallbackParam extends js.Object {
  var mode: String = js.native
  var request: Request = js.native
}

object CacheKeyWillBeUsedCallbackParam {
  @scala.inline
  def apply(mode: String, request: Request): CacheKeyWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKeyWillBeUsedCallbackParam]
  }
  @scala.inline
  implicit class CacheKeyWillBeUsedCallbackParamOps[Self <: CacheKeyWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

