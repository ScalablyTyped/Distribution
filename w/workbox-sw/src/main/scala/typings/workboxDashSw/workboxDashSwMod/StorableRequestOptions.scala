package typings.workboxDashSw.workboxDashSwMod

import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== BackgroundSync =====
  */
trait StorableRequestOptions extends js.Object {
  /**
  	 * See: https://fetch.spec.whatwg.org/#requestinit
  	 */
  var requestInit: RequestInit
  var url: String
}

object StorableRequestOptions {
  @scala.inline
  def apply(requestInit: RequestInit, url: String): StorableRequestOptions = {
    val __obj = js.Dynamic.literal(requestInit = requestInit, url = url)
  
    __obj.asInstanceOf[StorableRequestOptions]
  }
}

