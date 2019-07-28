package typings.swaggerDashTools.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerUiOptions extends js.Object {
  var apiDocs: js.UndefOr[String] = js.undefined
  var apiDocsPrefix: js.UndefOr[String] = js.undefined
  var swaggerUi: js.UndefOr[String] = js.undefined
  var swaggerUiDir: js.UndefOr[String] = js.undefined
  var swaggerUiPrefix: js.UndefOr[String] = js.undefined
}

object SwaggerUiOptions {
  @scala.inline
  def apply(
    apiDocs: String = null,
    apiDocsPrefix: String = null,
    swaggerUi: String = null,
    swaggerUiDir: String = null,
    swaggerUiPrefix: String = null
  ): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    if (apiDocs != null) __obj.updateDynamic("apiDocs")(apiDocs)
    if (apiDocsPrefix != null) __obj.updateDynamic("apiDocsPrefix")(apiDocsPrefix)
    if (swaggerUi != null) __obj.updateDynamic("swaggerUi")(swaggerUi)
    if (swaggerUiDir != null) __obj.updateDynamic("swaggerUiDir")(swaggerUiDir)
    if (swaggerUiPrefix != null) __obj.updateDynamic("swaggerUiPrefix")(swaggerUiPrefix)
    __obj.asInstanceOf[SwaggerUiOptions]
  }
}

