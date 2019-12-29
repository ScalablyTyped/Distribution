package typings.typescript.typescriptMod

import typings.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoSuccess extends RenameInfo {
  var canRename: `true`
  var displayName: String
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[String] = js.undefined
  var fullDisplayName: String
  var kind: ScriptElementKind
  var kindModifiers: String
  var triggerSpan: TextSpan
}

object RenameInfoSuccess {
  @scala.inline
  def apply(
    canRename: `true`,
    displayName: String,
    fullDisplayName: String,
    kind: ScriptElementKind,
    kindModifiers: String,
    triggerSpan: TextSpan,
    fileToRename: String = null
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
}

