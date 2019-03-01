package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerUiOptions extends js.Object {
  var apiDocs: js.UndefOr[java.lang.String] = js.undefined
  var apiDocsPrefix: js.UndefOr[java.lang.String] = js.undefined
  var swaggerUi: js.UndefOr[java.lang.String] = js.undefined
  var swaggerUiDir: js.UndefOr[java.lang.String] = js.undefined
  var swaggerUiPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object SwaggerUiOptions {
  @scala.inline
  def apply(
    apiDocs: java.lang.String = null,
    apiDocsPrefix: java.lang.String = null,
    swaggerUi: java.lang.String = null,
    swaggerUiDir: java.lang.String = null,
    swaggerUiPrefix: java.lang.String = null
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

