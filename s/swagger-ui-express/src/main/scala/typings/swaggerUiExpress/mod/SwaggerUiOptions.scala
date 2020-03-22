package typings.swaggerUiExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerUiOptions extends js.Object {
  var customCss: js.UndefOr[String] = js.undefined
  var customCssUrl: js.UndefOr[String] = js.undefined
  var customJs: js.UndefOr[String] = js.undefined
  var customSiteTitle: js.UndefOr[String] = js.undefined
  var customfavIcon: js.UndefOr[String] = js.undefined
  var explorer: js.UndefOr[Boolean] = js.undefined
  var isExplorer: js.UndefOr[Boolean] = js.undefined
  var swaggerOptions: js.UndefOr[SwaggerOptions] = js.undefined
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
    explorer: js.UndefOr[Boolean] = js.undefined,
    isExplorer: js.UndefOr[Boolean] = js.undefined,
    swaggerOptions: SwaggerOptions = null,
    swaggerUrl: String = null,
    swaggerUrls: js.Array[String] = null
  ): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    if (customCss != null) __obj.updateDynamic("customCss")(customCss.asInstanceOf[js.Any])
    if (customCssUrl != null) __obj.updateDynamic("customCssUrl")(customCssUrl.asInstanceOf[js.Any])
    if (customJs != null) __obj.updateDynamic("customJs")(customJs.asInstanceOf[js.Any])
    if (customSiteTitle != null) __obj.updateDynamic("customSiteTitle")(customSiteTitle.asInstanceOf[js.Any])
    if (customfavIcon != null) __obj.updateDynamic("customfavIcon")(customfavIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(explorer)) __obj.updateDynamic("explorer")(explorer.asInstanceOf[js.Any])
    if (!js.isUndefined(isExplorer)) __obj.updateDynamic("isExplorer")(isExplorer.asInstanceOf[js.Any])
    if (swaggerOptions != null) __obj.updateDynamic("swaggerOptions")(swaggerOptions.asInstanceOf[js.Any])
    if (swaggerUrl != null) __obj.updateDynamic("swaggerUrl")(swaggerUrl.asInstanceOf[js.Any])
    if (swaggerUrls != null) __obj.updateDynamic("swaggerUrls")(swaggerUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerUiOptions]
  }
}

