package typings.urqlCore.typesMod

import typings.urqlCore.anon.FetchOptions
import typings.urqlCore.anon.FetchOptionsUrl
import typings.urqlCore.anon.Response
import typings.urqlCore.anon.RetryCount
import typings.urqlCore.anon.Url
import typings.urqlCore.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugEventTypes extends js.Object {
  var cacheHit: Value
  var cacheInvalidation: Response
  var fetchError: FetchOptionsUrl
  var fetchRequest: FetchOptions
  var fetchSuccess: Url
  var retryRetrying: RetryCount
}

object DebugEventTypes {
  @scala.inline
  def apply(
    cacheHit: Value,
    cacheInvalidation: Response,
    fetchError: FetchOptionsUrl,
    fetchRequest: FetchOptions,
    fetchSuccess: Url,
    retryRetrying: RetryCount
  ): DebugEventTypes = {
    val __obj = js.Dynamic.literal(cacheHit = cacheHit.asInstanceOf[js.Any], cacheInvalidation = cacheInvalidation.asInstanceOf[js.Any], fetchError = fetchError.asInstanceOf[js.Any], fetchRequest = fetchRequest.asInstanceOf[js.Any], fetchSuccess = fetchSuccess.asInstanceOf[js.Any], retryRetrying = retryRetrying.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugEventTypes]
  }
}

