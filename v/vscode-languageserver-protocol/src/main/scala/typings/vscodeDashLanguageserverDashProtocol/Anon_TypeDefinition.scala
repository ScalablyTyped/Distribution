package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeDefinition extends js.Object {
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    */
  var typeDefinition: js.UndefOr[Anon_DynamicRegistrationLinkSupport] = js.undefined
}

object Anon_TypeDefinition {
  @scala.inline
  def apply(typeDefinition: Anon_DynamicRegistrationLinkSupport = null): Anon_TypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (typeDefinition != null) __obj.updateDynamic("typeDefinition")(typeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeDefinition]
  }
}

