package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecursiveUseTrash extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
  var useTrash: js.UndefOr[Boolean] = js.undefined
}

object AnonRecursiveUseTrash {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined, useTrash: js.UndefOr[Boolean] = js.undefined): AnonRecursiveUseTrash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (!js.isUndefined(useTrash)) __obj.updateDynamic("useTrash")(useTrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecursiveUseTrash]
  }
}

