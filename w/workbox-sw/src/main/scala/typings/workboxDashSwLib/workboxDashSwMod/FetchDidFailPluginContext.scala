package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidFailPluginContext extends js.Object {
  val error: stdLib.Error
  val originalRequest: stdLib.Request
  val request: stdLib.Request
}

object FetchDidFailPluginContext {
  @scala.inline
  def apply(error: stdLib.Error, originalRequest: stdLib.Request, request: stdLib.Request): FetchDidFailPluginContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("originalRequest")(originalRequest)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[FetchDidFailPluginContext]
  }
}

