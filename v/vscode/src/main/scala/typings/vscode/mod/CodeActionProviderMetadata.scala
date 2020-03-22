package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProviderMetadata extends js.Object {
  /**
  		 * List of [CodeActionKinds](#CodeActionKind) that a [CodeActionProvider](#CodeActionProvider) may return.
  		 *
  		 * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
  		 * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
  		 * list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
  		 * such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
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

