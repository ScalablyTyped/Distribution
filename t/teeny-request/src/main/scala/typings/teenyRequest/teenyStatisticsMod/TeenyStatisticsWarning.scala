package typings.teenyRequest.teenyStatisticsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatisticsWarning")
@js.native
class TeenyStatisticsWarning protected () extends Error {
  /**
    * @param {string} message
    */
  def this(message: String) = this()
  var threshold: Double = js.native
  var `type`: String = js.native
  var value: Double = js.native
}

/* static members */
@JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatisticsWarning")
@js.native
object TeenyStatisticsWarning extends js.Object {
  val CONCURRENT_REQUESTS: /* "ConcurrentRequestsExceededWarning" */ String = js.native
}

