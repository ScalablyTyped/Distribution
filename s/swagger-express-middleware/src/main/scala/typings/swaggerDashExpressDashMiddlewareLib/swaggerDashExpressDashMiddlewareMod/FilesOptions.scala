package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesOptions extends js.Object {
  var apiPath: js.UndefOr[java.lang.String] = js.undefined
  var rawFilesPath: js.UndefOr[java.lang.String] = js.undefined
  var useBasePath: js.UndefOr[scala.Boolean] = js.undefined
}

object FilesOptions {
  @scala.inline
  def apply(
    apiPath: java.lang.String = null,
    rawFilesPath: java.lang.String = null,
    useBasePath: js.UndefOr[scala.Boolean] = js.undefined
  ): FilesOptions = {
    val __obj = js.Dynamic.literal()
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath)
    if (rawFilesPath != null) __obj.updateDynamic("rawFilesPath")(rawFilesPath)
    if (!js.isUndefined(useBasePath)) __obj.updateDynamic("useBasePath")(useBasePath)
    __obj.asInstanceOf[FilesOptions]
  }
}

