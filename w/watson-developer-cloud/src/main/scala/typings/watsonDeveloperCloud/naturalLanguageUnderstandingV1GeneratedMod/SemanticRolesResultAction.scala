package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted action from the sentence. */
@js.native
trait SemanticRolesResultAction extends js.Object {
  /** normalized version of the action. */
  var normalized: js.UndefOr[String] = js.native
  /** Analyzed text that corresponds to the action. */
  var text: js.UndefOr[String] = js.native
  var verb: js.UndefOr[SemanticRolesVerb] = js.native
}

object SemanticRolesResultAction {
  @scala.inline
  def apply(): SemanticRolesResultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultAction]
  }
  @scala.inline
  implicit class SemanticRolesResultActionOps[Self <: SemanticRolesResultAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNormalized(value: String): Self = this.set("normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalized: Self = this.set("normalized", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVerb(value: SemanticRolesVerb): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
  
}

