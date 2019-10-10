package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeInjection extends js.Object {
  var codeinjection_foot: js.UndefOr[Nullable[String]] = js.undefined
  var codeinjection_head: js.UndefOr[Nullable[String]] = js.undefined
}

object CodeInjection {
  @scala.inline
  def apply(codeinjection_foot: Nullable[String] = null, codeinjection_head: Nullable[String] = null): CodeInjection = {
    val __obj = js.Dynamic.literal()
    if (codeinjection_foot != null) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (codeinjection_head != null) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeInjection]
  }
}

