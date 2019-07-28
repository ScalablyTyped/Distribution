package typings.workboxDashSw.workboxDashSwMod

import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidFailPluginContext extends js.Object {
  val error: Error
  val originalRequest: Request
  val request: Request
}

object FetchDidFailPluginContext {
  @scala.inline
  def apply(error: Error, originalRequest: Request, request: Request): FetchDidFailPluginContext = {
    val __obj = js.Dynamic.literal(error = error, originalRequest = originalRequest, request = request)
  
    __obj.asInstanceOf[FetchDidFailPluginContext]
  }
}

