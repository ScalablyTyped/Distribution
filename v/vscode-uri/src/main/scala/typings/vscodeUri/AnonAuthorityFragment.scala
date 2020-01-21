package typings.vscodeUri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorityFragment extends js.Object {
  var authority: js.UndefOr[String | Null] = js.undefined
  var fragment: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var query: js.UndefOr[String | Null] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
}

object AnonAuthorityFragment {
  @scala.inline
  def apply(
    authority: String = null,
    fragment: String = null,
    path: String = null,
    query: String = null,
    scheme: String = null
  ): AnonAuthorityFragment = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorityFragment]
  }
}

