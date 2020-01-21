package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecursive extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object AnonRecursive {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined): AnonRecursive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecursive]
  }
}

