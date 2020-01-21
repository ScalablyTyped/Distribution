package typings.tslint.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationLoadResult extends js.Object {
  var path: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[IConfigurationFile] = js.undefined
}

object IConfigurationLoadResult {
  @scala.inline
  def apply(path: String = null, results: IConfigurationFile = null): IConfigurationLoadResult = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationLoadResult]
  }
}

