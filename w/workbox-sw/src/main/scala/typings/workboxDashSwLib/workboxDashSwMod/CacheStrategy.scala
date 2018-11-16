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
  def handle(input: ICacheStrategyHandleOptions): stdLib.Promise[stdLib.Response]
  /**
  	 * This method can be used to perform a make a standalone request outside the context of the Workbox Router.
  	 * @param {ICacheStrategyMakeRequestOptions} input
  	 * @returns {Promise<Response>}
  	 */
  def makeRequest(input: ICacheStrategyMakeRequestOptions): stdLib.Promise[stdLib.Response]
}

