package typings.vscodeDashUri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authority extends js.Object {
  var authority: js.UndefOr[String] = js.undefined
  var fragment: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var scheme: String
}

object Anon_Authority {
  @scala.inline
  def apply(
    scheme: String,
    authority: String = null,
    fragment: String = null,
    path: String = null,
    query: String = null
  ): Anon_Authority = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (path != null) __obj.updateDynamic("path")(path)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Authority]
  }
}

