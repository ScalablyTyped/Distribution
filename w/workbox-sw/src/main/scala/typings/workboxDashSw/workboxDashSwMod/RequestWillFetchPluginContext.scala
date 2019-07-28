package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestWillFetchPluginContext extends js.Object {
  val request: Request
}

object RequestWillFetchPluginContext {
  @scala.inline
  def apply(request: Request): RequestWillFetchPluginContext = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[RequestWillFetchPluginContext]
  }
}

