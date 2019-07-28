package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationLinkSupport extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports additional metadata in the form of definition links.
    */
  var linkSupport: js.UndefOr[Boolean] = js.undefined
}

object Anon_DynamicRegistrationLinkSupport {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    linkSupport: js.UndefOr[Boolean] = js.undefined
  ): Anon_DynamicRegistrationLinkSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (!js.isUndefined(linkSupport)) __obj.updateDynamic("linkSupport")(linkSupport)
    __obj.asInstanceOf[Anon_DynamicRegistrationLinkSupport]
  }
}

