package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyWorkers extends js.Object {
  var recycle: js.UndefOr[scala.Boolean] = js.undefined
}

object IWallabyWorkers {
  @scala.inline
  def apply(recycle: js.UndefOr[scala.Boolean] = js.undefined): IWallabyWorkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recycle)) __obj.updateDynamic("recycle")(recycle)
    __obj.asInstanceOf[IWallabyWorkers]
  }
}

