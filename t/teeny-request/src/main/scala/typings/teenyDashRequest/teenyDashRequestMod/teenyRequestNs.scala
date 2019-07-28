package typings.teenyDashRequest.teenyDashRequestMod

import typings.request.requestMod.OptionalUriUrl
import typings.request.requestMod.Options
import typings.request.requestMod.Request
import typings.request.requestMod.RequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request", "teenyRequest")
@js.native
object teenyRequestNs extends js.Object {
  var defaults: js.Function1[
    /* defaults */ OptionalUriUrl, 
    js.Function2[/* reqOpts */ Options, /* callback */ js.UndefOr[RequestCallback], Unit | Request]
  ] = js.native
}

