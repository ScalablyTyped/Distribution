package typings.sumoLogger.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sumo-logger.sumo-logger.PerMessageOptions> */
trait PartialPerMessageOptions extends js.Object {
  var sessionKey: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialPerMessageOptions {
  @scala.inline
  def apply(sessionKey: String = null, timestamp: Date = null, url: String = null): PartialPerMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPerMessageOptions]
  }
}

