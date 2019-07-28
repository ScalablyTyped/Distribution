package typings.typescript.typescriptMod

import typings.typescript.typescriptNumbers.`true`
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
    val __obj = js.Dynamic.literal(canRename = canRename, displayName = displayName, fullDisplayName = fullDisplayName, kind = kind, kindModifiers = kindModifiers, triggerSpan = triggerSpan)
    if (fileToRename != null) __obj.updateDynamic("fileToRename")(fileToRename)
    __obj.asInstanceOf[RenameInfoSuccess]
  }
}

