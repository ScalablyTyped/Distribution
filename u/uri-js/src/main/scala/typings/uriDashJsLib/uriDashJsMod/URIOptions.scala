package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIOptions extends js.Object {
  var absolutePath: js.UndefOr[scala.Boolean] = js.undefined
  var domainHost: js.UndefOr[scala.Boolean] = js.undefined
  var iri: js.UndefOr[scala.Boolean] = js.undefined
  var reference: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var tolerant: js.UndefOr[scala.Boolean] = js.undefined
  var unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
}

object URIOptions {
  @scala.inline
  def apply(
    absolutePath: js.UndefOr[scala.Boolean] = js.undefined,
    domainHost: js.UndefOr[scala.Boolean] = js.undefined,
    iri: js.UndefOr[scala.Boolean] = js.undefined,
    reference: java.lang.String = null,
    scheme: java.lang.String = null,
    tolerant: js.UndefOr[scala.Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
  ): URIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath)
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost)
    if (!js.isUndefined(iri)) __obj.updateDynamic("iri")(iri)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant)
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport)
    __obj.asInstanceOf[URIOptions]
  }
}

