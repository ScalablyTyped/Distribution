package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoSuccess extends RenameInfo {
  var canRename: `true` = js.native
  var displayName: java.lang.String = js.native
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.native
  var fullDisplayName: java.lang.String = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var triggerSpan: TextSpan = js.native
}

object RenameInfoSuccess {
  @scala.inline
  def apply(
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
  @scala.inline
  implicit class RenameInfoSuccessOps[Self <: RenameInfoSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanRename(value: `true`): Self = this.set("canRename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: java.lang.String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDisplayName(value: java.lang.String): Self = this.set("fullDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerSpan(value: TextSpan): Self = this.set("triggerSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileToRename(value: java.lang.String): Self = this.set("fileToRename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileToRename: Self = this.set("fileToRename", js.undefined)
  }
  
}

