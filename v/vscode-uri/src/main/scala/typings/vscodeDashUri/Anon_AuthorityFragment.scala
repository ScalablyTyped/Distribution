package typings.vscodeDashUri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorityFragment extends js.Object {
  var authority: js.UndefOr[String | Null] = js.undefined
  var fragment: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var query: js.UndefOr[String | Null] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
}

object Anon_AuthorityFragment {
  @scala.inline
  def apply(
    authority: String = null,
    fragment: String = null,
    path: String = null,
    query: String = null,
    scheme: String = null
  ): Anon_AuthorityFragment = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (path != null) __obj.updateDynamic("path")(path)
    if (query != null) __obj.updateDynamic("query")(query)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_AuthorityFragment]
  }
}

