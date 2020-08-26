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

@js.native
trait DebugEventTypes extends js.Object {
  var cacheHit: Value = js.native
  var cacheInvalidation: Response = js.native
  var fetchError: FetchOptionsUrl = js.native
  var fetchRequest: FetchOptions = js.native
  var fetchSuccess: Url = js.native
  var retryRetrying: RetryCount = js.native
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
  @scala.inline
  implicit class DebugEventTypesOps[Self <: DebugEventTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheHit(value: Value): Self = this.set("cacheHit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheInvalidation(value: Response): Self = this.set("cacheInvalidation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchError(value: FetchOptionsUrl): Self = this.set("fetchError", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchRequest(value: FetchOptions): Self = this.set("fetchRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchSuccess(value: Url): Self = this.set("fetchSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryRetrying(value: RetryCount): Self = this.set("retryRetrying", value.asInstanceOf[js.Any])
  }
  
}

