package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKeyWillBeUsedCallbackParam extends js.Object {
  var mode: String
  var request: Request
}

object CacheKeyWillBeUsedCallbackParam {
  @scala.inline
  def apply(mode: String, request: Request): CacheKeyWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(mode = mode, request = request)
  
    __obj.asInstanceOf[CacheKeyWillBeUsedCallbackParam]
  }
}

