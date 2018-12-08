package typings
package teenyDashRequestLib.teenyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request", "teenyRequest")
@js.native
object teenyRequestNs extends js.Object {
  var defaults: js.Function1[
    /* defaults */ requestLib.requestMod.requestNs.OptionalUriUrl, 
    js.Function2[
      /* reqOpts */ requestLib.requestMod.requestNs.Options, 
      /* callback */ js.UndefOr[requestLib.requestMod.requestNs.RequestCallback], 
      scala.Unit | requestLib.requestMod.requestNs.Request
    ]
  ] = js.native
}

