package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeInjection extends js.Object {
  var codeinjection_foot: js.UndefOr[Nullable[String]] = js.undefined
  var codeinjection_head: js.UndefOr[Nullable[String]] = js.undefined
}

object CodeInjection {
  @scala.inline
  def apply(
    codeinjection_foot: js.UndefOr[Null | Nullable[String]] = js.undefined,
    codeinjection_head: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): CodeInjection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(codeinjection_foot)) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (!js.isUndefined(codeinjection_head)) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeInjection]
  }
}

