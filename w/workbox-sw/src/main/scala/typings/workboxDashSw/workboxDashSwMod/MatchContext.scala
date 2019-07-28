package typings.workboxDashSw.workboxDashSwMod

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== MatchCallback =====
  */
trait MatchContext extends URLContext {
  /**
  	 * The service workers' fetch event.
  	 */
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
}

object MatchContext {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    url: URL
  ): MatchContext = {
    val __obj = js.Dynamic.literal(event = event, url = url)
  
    __obj.asInstanceOf[MatchContext]
  }
}

