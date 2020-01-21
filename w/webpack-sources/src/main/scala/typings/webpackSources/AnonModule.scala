package typings.webpackSources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModule extends js.Object {
  var module: js.UndefOr[Boolean] = js.undefined
}

object AnonModule {
  @scala.inline
  def apply(module: js.UndefOr[Boolean] = js.undefined): AnonModule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModule]
  }
}

