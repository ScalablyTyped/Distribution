package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Implementation extends js.Object {
  /**
    * Capabilities specific to the `textDocument/implementation`
    */
  var implementation: js.UndefOr[Anon_DynamicRegistrationLinkSupport] = js.undefined
}

object Anon_Implementation {
  @scala.inline
  def apply(implementation: Anon_DynamicRegistrationLinkSupport = null): Anon_Implementation = {
    val __obj = js.Dynamic.literal()
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Implementation]
  }
}

