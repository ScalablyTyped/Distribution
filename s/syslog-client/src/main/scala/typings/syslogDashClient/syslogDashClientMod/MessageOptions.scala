package typings.syslogDashClient.syslogDashClientMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  var facility: js.UndefOr[Facility] = js.undefined
  var msgid: js.UndefOr[String] = js.undefined
  var rfc3164: js.UndefOr[Boolean] = js.undefined
  var severity: js.UndefOr[Severity] = js.undefined
  var syslogHostname: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(
    appName: String = null,
    facility: Facility = null,
    msgid: String = null,
    rfc3164: js.UndefOr[Boolean] = js.undefined,
    severity: Severity = null,
    syslogHostname: String = null,
    timestamp: Date = null
  ): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (facility != null) __obj.updateDynamic("facility")(facility)
    if (msgid != null) __obj.updateDynamic("msgid")(msgid)
    if (!js.isUndefined(rfc3164)) __obj.updateDynamic("rfc3164")(rfc3164)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (syslogHostname != null) __obj.updateDynamic("syslogHostname")(syslogHostname)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[MessageOptions]
  }
}

