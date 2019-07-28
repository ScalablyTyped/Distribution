package typings.swaggerDashJsdoc.swaggerDashJsdocMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ StringDictionary[js.Any] {
  var apis: js.UndefOr[js.Array[String]] = js.undefined
  var definition: js.UndefOr[SwaggerDefinition] = js.undefined
  var swaggerDefinition: js.UndefOr[SwaggerDefinition] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    apis: js.Array[String] = null,
    definition: SwaggerDefinition = null,
    swaggerDefinition: SwaggerDefinition = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apis != null) __obj.updateDynamic("apis")(apis)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (swaggerDefinition != null) __obj.updateDynamic("swaggerDefinition")(swaggerDefinition)
    __obj.asInstanceOf[Options]
  }
}

