package typings.teenyDashRequest.teenyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request", "teenyRequest")
@js.native
object teenyRequest extends js.Object {
  var defaults: js.Function1[
    /* defaults */ CoreOptions, 
    js.Function2[
      /* reqOpts */ Options, 
      /* callback */ js.UndefOr[RequestCallback[js.Any]], 
      Unit | Request
    ]
  ] = js.native
  def apply(reqOpts: Options): Request = js.native
  def apply(reqOpts: Options, callback: RequestCallback[_]): Unit = js.native
}

