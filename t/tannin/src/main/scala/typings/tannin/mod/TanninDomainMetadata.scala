package typings.tannin.mod

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TanninDomainMetadata extends js.Object {
  /**
    * Domain name.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Language code.
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Plural forms expression or
    *  function evaluator.
    */
  var plural_forms: js.UndefOr[TimerHandler] = js.undefined
}

object TanninDomainMetadata {
  @scala.inline
  def apply(domain: String = null, lang: String = null, plural_forms: TimerHandler = null): TanninDomainMetadata = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (plural_forms != null) __obj.updateDynamic("plural_forms")(plural_forms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TanninDomainMetadata]
  }
}

