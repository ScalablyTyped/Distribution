package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseTrash extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
  var useTrash: js.UndefOr[Boolean] = js.undefined
}

object UseTrash {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined, useTrash: js.UndefOr[Boolean] = js.undefined): UseTrash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTrash)) __obj.updateDynamic("useTrash")(useTrash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTrash]
  }
}

