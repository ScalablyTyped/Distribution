package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== MatchCallback =====
  */
trait IMatchContext extends IURLContext {
  /**
  	 * The service workers' fetch event.
  	 */
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
}

object IMatchContext {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    url: stdLib.URL
  ): IMatchContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IMatchContext]
  }
}

