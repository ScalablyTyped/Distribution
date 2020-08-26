package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted subject from the sentence. */
@js.native
trait SemanticRolesResultSubject extends js.Object {
  /** An array of extracted entities. */
  var entities: js.UndefOr[js.Array[SemanticRolesEntity]] = js.native
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.native
  /** Text that corresponds to the subject role. */
  var text: js.UndefOr[String] = js.native
}

object SemanticRolesResultSubject {
  @scala.inline
  def apply(): SemanticRolesResultSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultSubject]
  }
  @scala.inline
  implicit class SemanticRolesResultSubjectOps[Self <: SemanticRolesResultSubject] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: SemanticRolesEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[SemanticRolesEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: SemanticRolesKeyword*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[SemanticRolesKeyword]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

