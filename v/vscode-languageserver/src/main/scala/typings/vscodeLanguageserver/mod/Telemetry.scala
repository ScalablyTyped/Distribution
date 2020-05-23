package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit
}

object Telemetry {
  @scala.inline
  def apply(connection: IConnection, logEvent: js.Any => Unit): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
}

