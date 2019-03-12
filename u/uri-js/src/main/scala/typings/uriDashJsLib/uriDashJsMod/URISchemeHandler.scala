package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[scala.Boolean] = js.undefined
  var domainHost: js.UndefOr[scala.Boolean] = js.undefined
  var scheme: java.lang.String
  var unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
  def parse(components: ParentComponents, options: Options): Components
  def serialize(components: Components, options: Options): ParentComponents
}

object URISchemeHandler {
  @scala.inline
  def apply[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */](
    parse: (ParentComponents, Options) => Components,
    scheme: java.lang.String,
    serialize: (Components, Options) => ParentComponents,
    absolutePath: js.UndefOr[scala.Boolean] = js.undefined,
    domainHost: js.UndefOr[scala.Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme, serialize = js.Any.fromFunction2(serialize))
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath)
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost)
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport)
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
}

