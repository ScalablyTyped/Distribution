package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

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
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(wrapped)) __obj.updateDynamic("wrapped")(wrapped)
    __obj.asInstanceOf[XML]
  }
}

