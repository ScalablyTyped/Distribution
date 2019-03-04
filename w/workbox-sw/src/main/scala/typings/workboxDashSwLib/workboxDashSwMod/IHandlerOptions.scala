package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== NavigationRoute =====
  */
trait IHandlerOptions extends js.Object {
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  var params: stdLib.URLSearchParams
  var url: java.lang.String
}

object IHandlerOptions {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    params: stdLib.URLSearchParams,
    url: java.lang.String
  ): IHandlerOptions = {
    val __obj = js.Dynamic.literal(event = event, params = params, url = url)
  
    __obj.asInstanceOf[IHandlerOptions]
  }
}

