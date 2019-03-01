package typings
package tslintLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationLoadResult extends js.Object {
  var path: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[IConfigurationFile] = js.undefined
}

object IConfigurationLoadResult {
  @scala.inline
  def apply(path: java.lang.String = null, results: IConfigurationFile = null): IConfigurationLoadResult = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[IConfigurationLoadResult]
  }
}

