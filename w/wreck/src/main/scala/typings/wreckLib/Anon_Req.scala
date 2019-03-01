package typings
package wreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.ClientRequest */ js.Any
  var res: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.IncomingMessage */ _
  ]
  var start: scala.Double
  var url: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Url.URL */ js.Any
}

object Anon_Req {
  @scala.inline
  def apply(
    req: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.ClientRequest */ js.Any,
    start: scala.Double,
    url: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Url.URL */ js.Any,
    res: js.Any = null
  ): Anon_Req = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("url")(url)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Req]
  }
}

