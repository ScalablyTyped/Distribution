package typings.sybasePromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var dbname: String
  var host: String
  var logTiming: js.UndefOr[Boolean] = js.undefined
  var password: String
  var pathToJavaBtidge: js.UndefOr[String] = js.undefined
  var port: Double
  var username: String
}

object ConnectionOptions {
  @scala.inline
  def apply(
    dbname: String,
    host: String,
    password: String,
    port: Double,
    username: String,
    logTiming: js.UndefOr[Boolean] = js.undefined,
    pathToJavaBtidge: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(dbname = dbname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(logTiming)) __obj.updateDynamic("logTiming")(logTiming.asInstanceOf[js.Any])
    if (pathToJavaBtidge != null) __obj.updateDynamic("pathToJavaBtidge")(pathToJavaBtidge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

