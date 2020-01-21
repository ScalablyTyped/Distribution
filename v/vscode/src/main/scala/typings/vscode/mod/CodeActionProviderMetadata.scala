package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProviderMetadata extends js.Object {
  /**
  		 * [CodeActionKinds](#CodeActionKind) that this provider may return.
  		 *
  		 * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the provider
  		 * may list our every specific kind they provide, such as `CodeActionKind.Refactor.Extract.append('function`)`
  		 */
  val providedCodeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}

object CodeActionProviderMetadata {
  @scala.inline
  def apply(providedCodeActionKinds: js.Array[CodeActionKind] = null): CodeActionProviderMetadata = {
    val __obj = js.Dynamic.literal()
    if (providedCodeActionKinds != null) __obj.updateDynamic("providedCodeActionKinds")(providedCodeActionKinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionProviderMetadata]
  }
}

