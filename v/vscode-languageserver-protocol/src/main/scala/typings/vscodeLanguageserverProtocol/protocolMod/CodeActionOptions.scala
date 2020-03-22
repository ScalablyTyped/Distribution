package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionOptions extends WorkDoneProgressOptions {
  /**
    * CodeActionKinds that this server may return.
    *
    * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the server
    * may list out every specific kind they provide.
    */
  var codeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}

object CodeActionOptions {
  @scala.inline
  def apply(
    codeActionKinds: js.Array[CodeActionKind] = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    if (codeActionKinds != null) __obj.updateDynamic("codeActionKinds")(codeActionKinds.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionOptions]
  }
}

