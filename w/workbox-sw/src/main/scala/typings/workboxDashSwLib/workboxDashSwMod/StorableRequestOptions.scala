package typings
package workboxDashSwLib.workboxDashSwMod

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
  var requestInit: stdLib.RequestInit
  var url: java.lang.String
}

object StorableRequestOptions {
  @scala.inline
  def apply(requestInit: stdLib.RequestInit, url: java.lang.String): StorableRequestOptions = {
    val __obj = js.Dynamic.literal(requestInit = requestInit, url = url)
  
    __obj.asInstanceOf[StorableRequestOptions]
  }
}

