package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeFixAction extends CodeAction {
  var fixAllDescription: js.UndefOr[java.lang.String] = js.native
  /**
    * If present, one may call 'getCombinedCodeFix' with this fixId.
    * This may be omitted to indicate that the code fix can't be applied in a group.
    */
  var fixId: js.UndefOr[js.Object] = js.native
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: java.lang.String = js.native
}

object CodeFixAction {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String, fixName: java.lang.String): CodeFixAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixName = fixName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixAction]
  }
  @scala.inline
  implicit class CodeFixActionOps[Self <: CodeFixAction] (val x: Self) extends AnyVal {
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
    def setFixName(value: java.lang.String): Self = this.set("fixName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixAllDescription(value: java.lang.String): Self = this.set("fixAllDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixAllDescription: Self = this.set("fixAllDescription", js.undefined)
    @scala.inline
    def setFixId(value: js.Object): Self = this.set("fixId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixId: Self = this.set("fixId", js.undefined)
  }
  
}

