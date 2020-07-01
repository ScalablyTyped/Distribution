package typings.webpackClean.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * directory to be resolved to
    * @default null;
    */
  var basePath: js.UndefOr[String | Null] = js.undefined
  /**
    * specify if the files should be force deleted in case of compile errors.
    * If forceDelete is not enabled, the compile errors will be logged to stdout but the deletion of the files will not take place
    * @default false
    */
  var forceDelete: js.UndefOr[Boolean] = js.undefined
  /**
    * specify if the .map files should be automatically removed
    * @default false
    */
  var removeMaps: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: js.UndefOr[Null | String] = js.undefined,
    forceDelete: js.UndefOr[Boolean] = js.undefined,
    removeMaps: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basePath)) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDelete)) __obj.updateDynamic("forceDelete")(forceDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeMaps)) __obj.updateDynamic("removeMaps")(removeMaps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

