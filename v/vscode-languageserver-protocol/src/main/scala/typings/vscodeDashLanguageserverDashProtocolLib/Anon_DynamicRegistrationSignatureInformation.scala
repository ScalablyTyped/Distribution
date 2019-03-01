package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationSignatureInformation extends js.Object {
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[Anon_DocumentationFormat] = js.undefined
}

object Anon_DynamicRegistrationSignatureInformation {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined,
    signatureInformation: Anon_DocumentationFormat = null
  ): Anon_DynamicRegistrationSignatureInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (signatureInformation != null) __obj.updateDynamic("signatureInformation")(signatureInformation)
    __obj.asInstanceOf[Anon_DynamicRegistrationSignatureInformation]
  }
}

