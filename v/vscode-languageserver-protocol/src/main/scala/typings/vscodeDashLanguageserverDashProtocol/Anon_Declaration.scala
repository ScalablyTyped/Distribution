package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declaration extends js.Object {
  /**
    * Capabilities specific to the `textDocument/declaration`
    */
  var declaration: js.UndefOr[Anon_DynamicRegistrationLinkSupport] = js.undefined
}

object Anon_Declaration {
  @scala.inline
  def apply(declaration: Anon_DynamicRegistrationLinkSupport = null): Anon_Declaration = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declaration]
  }
}

