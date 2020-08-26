package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The object containing the actions and the objects the actions act upon. */
@js.native
trait SemanticRolesResult extends js.Object {
  /** The extracted action from the sentence. */
  var action: js.UndefOr[SemanticRolesResultAction] = js.native
  /** The extracted object from the sentence. */
  var `object`: js.UndefOr[SemanticRolesResultObject] = js.native
  /** Sentence from the source that contains the subject, action, and object. */
  var sentence: js.UndefOr[String] = js.native
  /** The extracted subject from the sentence. */
  var subject: js.UndefOr[SemanticRolesResultSubject] = js.native
}

object SemanticRolesResult {
  @scala.inline
  def apply(): SemanticRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResult]
  }
  @scala.inline
  implicit class SemanticRolesResultOps[Self <: SemanticRolesResult] (val x: Self) extends AnyVal {
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
    def setAction(value: SemanticRolesResultAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setObject(value: SemanticRolesResultObject): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setSentence(value: String): Self = this.set("sentence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentence: Self = this.set("sentence", js.undefined)
    @scala.inline
    def setSubject(value: SemanticRolesResultSubject): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

