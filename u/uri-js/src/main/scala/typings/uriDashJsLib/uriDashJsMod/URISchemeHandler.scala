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
    parse: js.Function2[ParentComponents, Options, Components],
    scheme: java.lang.String,
    serialize: js.Function2[Components, Options, ParentComponents],
    absolutePath: js.UndefOr[scala.Boolean] = js.undefined,
    domainHost: js.UndefOr[scala.Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("serialize")(serialize)
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath)
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost)
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport)
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
}

