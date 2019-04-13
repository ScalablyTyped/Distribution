package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoSuccess extends RenameInfo {
  var canRename: typescriptLib.typescriptLibNumbers.`true`
  var displayName: java.lang.String
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.undefined
  var fullDisplayName: java.lang.String
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var triggerSpan: TextSpan
}

object RenameInfoSuccess {
  @scala.inline
  def apply(
    canRename: typescriptLib.typescriptLibNumbers.`true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan,
    fileToRename: java.lang.String = null
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename, displayName = displayName, fullDisplayName = fullDisplayName, kind = kind, kindModifiers = kindModifiers, triggerSpan = triggerSpan)
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename)
    __obj.asInstanceOf[RenameInfoSuccess]
  }
}

