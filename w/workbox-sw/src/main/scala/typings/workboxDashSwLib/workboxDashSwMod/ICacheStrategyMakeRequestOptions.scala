package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheStrategyMakeRequestOptions extends js.Object {
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  var request: stdLib.Request | java.lang.String
}

object ICacheStrategyMakeRequestOptions {
  @scala.inline
  def apply(
    request: stdLib.Request | java.lang.String,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): ICacheStrategyMakeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[ICacheStrategyMakeRequestOptions]
  }
}

