package typings.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.undefined
  var domainHost: js.UndefOr[Boolean] = js.undefined
  var scheme: String
  var unicodeSupport: js.UndefOr[Boolean] = js.undefined
  def parse(components: ParentComponents, options: Options): Components
  def serialize(components: Components, options: Options): ParentComponents
}

object URISchemeHandler {
  @scala.inline
  def apply[/* <: typings.uriJs.mod.URIComponents */ Components, /* <: typings.uriJs.mod.URIOptions */ Options, /* <: typings.uriJs.mod.URIComponents */ ParentComponents](
    parse: (ParentComponents, Options) => Components,
    scheme: String,
    serialize: (Components, Options) => ParentComponents,
    absolutePath: js.UndefOr[Boolean] = js.undefined,
    domainHost: js.UndefOr[Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[Boolean] = js.undefined
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
}

