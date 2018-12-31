package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeAction extends js.Object {
  /** Text changes to apply to each file as part of the code action */
  var changes: js.Array[FileTextChanges]
  /**
    * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
    * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
    */
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
  /** Description of the code action to display in the UI of the editor */
  var description: java.lang.String
}

