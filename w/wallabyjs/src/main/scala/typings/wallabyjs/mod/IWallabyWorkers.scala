package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyWorkers extends js.Object {
  var recycle: js.UndefOr[Boolean] = js.undefined
}

object IWallabyWorkers {
  @scala.inline
  def apply(recycle: js.UndefOr[Boolean] = js.undefined): IWallabyWorkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recycle)) __obj.updateDynamic("recycle")(recycle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyWorkers]
  }
}

