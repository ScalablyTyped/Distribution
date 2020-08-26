package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SemanticRolesVerb. */
@js.native
trait SemanticRolesVerb extends js.Object {
  /** Verb tense. */
  var tense: js.UndefOr[String] = js.native
  /** The keyword text. */
  var text: js.UndefOr[String] = js.native
}

object SemanticRolesVerb {
  @scala.inline
  def apply(): SemanticRolesVerb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesVerb]
  }
  @scala.inline
  implicit class SemanticRolesVerbOps[Self <: SemanticRolesVerb] (val x: Self) extends AnyVal {
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
    def setTense(value: String): Self = this.set("tense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTense: Self = this.set("tense", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

