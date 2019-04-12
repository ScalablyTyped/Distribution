package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStrategy extends js.Object {
  /**
  	 * This method will perform a request strategy and follows an API that will work with the Workbox Router.
  	 * @param {CacheStrategyHandleOptions} input
  	 * @returns {Promise<Response>}
  	 */
  def handle(input: CacheStrategyHandleOptions): js.Promise[stdLib.Response]
  /**
  	 * This method can be used to perform a make a standalone request outside the
  	 * context of the Workbox Router.
  	 *
  	 * See "[Advanced Recipes](https://developers.google.com/web/tools/workbox/guides/advanced-recipes#make-requests)"
  	 * for more usage information.
  	 * @param {CacheStrategyMakeRequestOptions} input
  	 * @returns {Promise<Response>}
  	 */
  def makeRequest(input: CacheStrategyMakeRequestOptions): js.Promise[stdLib.Response]
}

object CacheStrategy {
  @scala.inline
  def apply(
    handle: CacheStrategyHandleOptions => js.Promise[stdLib.Response],
    makeRequest: CacheStrategyMakeRequestOptions => js.Promise[stdLib.Response]
  ): CacheStrategy = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), makeRequest = js.Any.fromFunction1(makeRequest))
  
    __obj.asInstanceOf[CacheStrategy]
  }
}

