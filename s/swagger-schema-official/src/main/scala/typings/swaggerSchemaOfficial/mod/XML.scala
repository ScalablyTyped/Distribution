package typings.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XML extends js.Object {
  var attribute: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var wrapped: js.UndefOr[Boolean] = js.undefined
}

object XML {
  @scala.inline
  def apply(
    attribute: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    prefix: String = null,
    wrapped: js.UndefOr[Boolean] = js.undefined
  ): XML = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapped)) __obj.updateDynamic("wrapped")(wrapped.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XML]
  }
}

