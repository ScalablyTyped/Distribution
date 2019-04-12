package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Strategies =====
  */
trait CacheStrategyHandleOptions extends js.Object {
  /**
  	 * The event that triggered the request.
  	 */
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  /**
  	 * The request to run this strategy for.
  	 */
  var request: stdLib.Request
}

object CacheStrategyHandleOptions {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    request: stdLib.Request
  ): CacheStrategyHandleOptions = {
    val __obj = js.Dynamic.literal(event = event, request = request)
  
    __obj.asInstanceOf[CacheStrategyHandleOptions]
  }
}

