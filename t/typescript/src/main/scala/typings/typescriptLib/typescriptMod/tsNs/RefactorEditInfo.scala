package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A set of edits to make in response to a refactor action, plus an optional
     * location where renaming should be invoked from
     */

trait RefactorEditInfo extends js.Object {
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
  var edits: js.Array[FileTextChanges]
  var renameFilename: js.UndefOr[java.lang.String] = js.undefined
  var renameLocation: js.UndefOr[scala.Double] = js.undefined
}

