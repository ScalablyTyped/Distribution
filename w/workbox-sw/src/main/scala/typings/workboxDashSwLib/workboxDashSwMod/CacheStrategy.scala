package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStrategy extends js.Object {
  /**
  	 * This method will perform a request strategy and follows an API that will work with the Workbox Router.
  	 * @param {ICacheStrategyHandleOptions} input
  	 * @returns {Promise<Response>}
  	 */
  def handle(input: ICacheStrategyHandleOptions): js.Promise[stdLib.Response]
  /**
  	 * This method can be used to perform a make a standalone request outside the context of the Workbox Router.
  	 * @param {ICacheStrategyMakeRequestOptions} input
  	 * @returns {Promise<Response>}
  	 */
  def makeRequest(input: ICacheStrategyMakeRequestOptions): js.Promise[stdLib.Response]
}

object CacheStrategy {
  @scala.inline
  def apply(
    handle: js.Function1[ICacheStrategyHandleOptions, js.Promise[stdLib.Response]],
    makeRequest: js.Function1[ICacheStrategyMakeRequestOptions, js.Promise[stdLib.Response]]
  ): CacheStrategy = {
    val __obj = js.Dynamic.literal(handle = handle, makeRequest = makeRequest)
  
    __obj.asInstanceOf[CacheStrategy]
  }
}

