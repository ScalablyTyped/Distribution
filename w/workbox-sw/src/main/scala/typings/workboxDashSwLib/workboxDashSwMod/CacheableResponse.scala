package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class allows you to set up rules determining what status codes and/or headers need to be present in order for a Response to be considered cacheable.
  */
trait CacheableResponse extends js.Object {
  /**
  	 * Checks a response to see whether it's cacheable or not, based on this object's configuration.
  	 * @param {Response} response - The response whose cacheability is being checked.
  	 * @returns {boolean}
  	 */
  def isResponseCacheable(response: stdLib.Response): scala.Boolean
}

object CacheableResponse {
  @scala.inline
  def apply(isResponseCacheable: stdLib.Response => scala.Boolean): CacheableResponse = {
    val __obj = js.Dynamic.literal(isResponseCacheable = js.Any.fromFunction1(isResponseCacheable))
  
    __obj.asInstanceOf[CacheableResponse]
  }
}

