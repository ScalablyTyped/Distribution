package typings.workboxStrategies.makeRequestCallbackMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeRequestCallbackOptions extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.native
  var request: String | Request = js.native
}

object MakeRequestCallbackOptions {
  @scala.inline
  def apply(request: String | Request): MakeRequestCallbackOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeRequestCallbackOptions]
  }
  @scala.inline
  implicit class MakeRequestCallbackOptionsOps[Self <: MakeRequestCallbackOptions] (val x: Self) extends AnyVal {
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
    def setRequest(value: String | Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

