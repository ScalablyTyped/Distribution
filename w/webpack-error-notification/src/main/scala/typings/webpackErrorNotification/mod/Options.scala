package typings.webpackErrorNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** if you do not want to notify warnings, set this to `false` */
  var notifyWarnings: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(notifyWarnings: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notifyWarnings)) __obj.updateDynamic("notifyWarnings")(notifyWarnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

