package typings.tslint

import typings.tslint.ruleMod.RuleSeverity
import typings.tslint.tslintStrings.default
import typings.tslint.tslintStrings.none
import typings.tslint.tslintStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(options: js.Any = null, severity: RuleSeverity | warn | none | default = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

