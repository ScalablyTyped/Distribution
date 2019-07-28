package typings.trustedDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypePolicyOptions extends js.Object {
  var createHTML: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createScript: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createScriptURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
}

object TrustedTypePolicyOptions {
  @scala.inline
  def apply(
    createHTML: /* input */ String => String = null,
    createScript: /* input */ String => String = null,
    createScriptURL: /* input */ String => String = null,
    createURL: /* input */ String => String = null
  ): TrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (createHTML != null) __obj.updateDynamic("createHTML")(js.Any.fromFunction1(createHTML))
    if (createScript != null) __obj.updateDynamic("createScript")(js.Any.fromFunction1(createScript))
    if (createScriptURL != null) __obj.updateDynamic("createScriptURL")(js.Any.fromFunction1(createScriptURL))
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    __obj.asInstanceOf[TrustedTypePolicyOptions]
  }
}

