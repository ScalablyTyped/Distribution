package typings.swaggerDashUiDashExpress.swaggerDashUiDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerUiOptions extends js.Object {
  var customCss: js.UndefOr[String] = js.undefined
  var customCssUrl: js.UndefOr[String] = js.undefined
  var customJs: js.UndefOr[String] = js.undefined
  var customSiteTitle: js.UndefOr[String] = js.undefined
  var customfavIcon: js.UndefOr[String] = js.undefined
  var isExplorer: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[SwaggerOptions] = js.undefined
  var swaggerUrl: js.UndefOr[String] = js.undefined
  var swaggerUrls: js.UndefOr[js.Array[String]] = js.undefined
}

object SwaggerUiOptions {
  @scala.inline
  def apply(
    customCss: String = null,
    customCssUrl: String = null,
    customJs: String = null,
    customSiteTitle: String = null,
    customfavIcon: String = null,
    isExplorer: js.UndefOr[Boolean] = js.undefined,
    options: SwaggerOptions = null,
    swaggerUrl: String = null,
    swaggerUrls: js.Array[String] = null
  ): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    if (customCss != null) __obj.updateDynamic("customCss")(customCss)
    if (customCssUrl != null) __obj.updateDynamic("customCssUrl")(customCssUrl)
    if (customJs != null) __obj.updateDynamic("customJs")(customJs)
    if (customSiteTitle != null) __obj.updateDynamic("customSiteTitle")(customSiteTitle)
    if (customfavIcon != null) __obj.updateDynamic("customfavIcon")(customfavIcon)
    if (!js.isUndefined(isExplorer)) __obj.updateDynamic("isExplorer")(isExplorer)
    if (options != null) __obj.updateDynamic("options")(options)
    if (swaggerUrl != null) __obj.updateDynamic("swaggerUrl")(swaggerUrl)
    if (swaggerUrls != null) __obj.updateDynamic("swaggerUrls")(swaggerUrls)
    __obj.asInstanceOf[SwaggerUiOptions]
  }
}

