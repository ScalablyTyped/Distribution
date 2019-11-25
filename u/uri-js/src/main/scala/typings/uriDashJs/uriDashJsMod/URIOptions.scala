package typings.uriDashJs.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIOptions extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.undefined
  var domainHost: js.UndefOr[Boolean] = js.undefined
  var iri: js.UndefOr[Boolean] = js.undefined
  var reference: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var tolerant: js.UndefOr[Boolean] = js.undefined
  var unicodeSupport: js.UndefOr[Boolean] = js.undefined
}

object URIOptions {
  @scala.inline
  def apply(
    absolutePath: js.UndefOr[Boolean] = js.undefined,
    domainHost: js.UndefOr[Boolean] = js.undefined,
    iri: js.UndefOr[Boolean] = js.undefined,
    reference: String = null,
    scheme: String = null,
    tolerant: js.UndefOr[Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[Boolean] = js.undefined
  ): URIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost.asInstanceOf[js.Any])
    if (!js.isUndefined(iri)) __obj.updateDynamic("iri")(iri.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[URIOptions]
  }
}

