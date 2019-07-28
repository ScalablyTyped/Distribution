package typings.workboxDashSw.workboxDashSwMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class allows you to set up rules determining what status codes and/or headers need to be present in order for a
  * [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response) to be considered cacheable.
  */
trait CacheableResponse extends js.Object {
  /**
  	 * Checks a response to see whether it's cacheable or not, based on this object's configuration.
  	 * @param {Response} response - The response whose cacheability is being checked.
  	 * @returns {boolean} `true` if the `Response` is cacheable, and `false` otherwise.
  	 */
  def isResponseCacheable(response: Response): Boolean
}

object CacheableResponse {
  @scala.inline
  def apply(isResponseCacheable: Response => Boolean): CacheableResponse = {
    val __obj = js.Dynamic.literal(isResponseCacheable = js.Any.fromFunction1(isResponseCacheable))
  
    __obj.asInstanceOf[CacheableResponse]
  }
}

