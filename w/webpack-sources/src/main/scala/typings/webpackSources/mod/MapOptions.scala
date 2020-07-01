package typings.webpackSources.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  /**
    * If set to false the implementation may omit mappings for columns
    * @default true
    */
  var columns: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false the implementation may omit inner mappings for modules.
    * @default true
    */
  var module: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(columns: js.UndefOr[Boolean] = js.undefined, module: js.UndefOr[Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

