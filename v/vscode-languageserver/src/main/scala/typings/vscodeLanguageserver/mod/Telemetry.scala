package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Telemetry extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit = js.native
}

object Telemetry {
  @scala.inline
  def apply(connection: IConnection, logEvent: js.Any => Unit): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
  @scala.inline
  implicit class TelemetryOps[Self <: Telemetry] (val x: Self) extends AnyVal {
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
    def setConnection(value: IConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogEvent(value: js.Any => Unit): Self = this.set("logEvent", js.Any.fromFunction1(value))
  }
  
}

