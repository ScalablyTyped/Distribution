package typings
package vscodeDashUriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authority extends js.Object {
  var authority: js.UndefOr[java.lang.String] = js.undefined
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var scheme: java.lang.String
}

object Anon_Authority {
  @scala.inline
  def apply(
    scheme: java.lang.String,
    authority: java.lang.String = null,
    fragment: java.lang.String = null,
    path: java.lang.String = null,
    query: java.lang.String = null
  ): Anon_Authority = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (path != null) __obj.updateDynamic("path")(path)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Authority]
  }
}

