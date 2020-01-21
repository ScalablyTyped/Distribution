package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoSuccess extends RenameInfo {
  var canRename: `true`
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
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan,
    fileToRename: java.lang.String = null
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
}

