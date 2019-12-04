package typings.workboxDashStrategies.typesMakeRequestCallbackMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeRequestCallbackOptions extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.undefined
  var request: String | Request
}

object MakeRequestCallbackOptions {
  @scala.inline
  def apply(
    request: String | Request,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any = null
  ): MakeRequestCallbackOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeRequestCallbackOptions]
  }
}

