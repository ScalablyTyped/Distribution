package typings
package trustedDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypePolicyOptions extends js.Object {
  var createHTML: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
  var createScript: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
  var createScriptURL: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
}

object TrustedTypePolicyOptions {
  @scala.inline
  def apply(
    createHTML: /* input */ java.lang.String => java.lang.String = null,
    createScript: /* input */ java.lang.String => java.lang.String = null,
    createScriptURL: /* input */ java.lang.String => java.lang.String = null,
    createURL: /* input */ java.lang.String => java.lang.String = null
  ): TrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (createHTML != null) __obj.updateDynamic("createHTML")(js.Any.fromFunction1(createHTML))
    if (createScript != null) __obj.updateDynamic("createScript")(js.Any.fromFunction1(createScript))
    if (createScriptURL != null) __obj.updateDynamic("createScriptURL")(js.Any.fromFunction1(createScriptURL))
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    __obj.asInstanceOf[TrustedTypePolicyOptions]
  }
}

