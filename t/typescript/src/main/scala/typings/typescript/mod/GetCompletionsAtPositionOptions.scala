package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompletionsAtPositionOptions extends UserPreferences {
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.native
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.native
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.native
}

object GetCompletionsAtPositionOptions {
  @scala.inline
  def apply(): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
  @scala.inline
  implicit class GetCompletionsAtPositionOptionsOps[Self <: GetCompletionsAtPositionOptions] (val x: Self) extends AnyVal {
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
    def setIncludeExternalModuleExports(value: Boolean): Self = this.set("includeExternalModuleExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExternalModuleExports: Self = this.set("includeExternalModuleExports", js.undefined)
    @scala.inline
    def setIncludeInsertTextCompletions(value: Boolean): Self = this.set("includeInsertTextCompletions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInsertTextCompletions: Self = this.set("includeInsertTextCompletions", js.undefined)
    @scala.inline
    def setTriggerCharacter(value: CompletionsTriggerCharacter): Self = this.set("triggerCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerCharacter: Self = this.set("triggerCharacter", js.undefined)
  }
  
}

