package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecursiveUseTrash extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
  var useTrash: js.UndefOr[Boolean] = js.undefined
}

object Anon_RecursiveUseTrash {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined, useTrash: js.UndefOr[Boolean] = js.undefined): Anon_RecursiveUseTrash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(useTrash)) __obj.updateDynamic("useTrash")(useTrash)
    __obj.asInstanceOf[Anon_RecursiveUseTrash]
  }
}

