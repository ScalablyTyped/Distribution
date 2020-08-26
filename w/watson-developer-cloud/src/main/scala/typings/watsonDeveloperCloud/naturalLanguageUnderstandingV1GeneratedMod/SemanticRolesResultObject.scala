package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted object from the sentence. */
@js.native
trait SemanticRolesResultObject extends js.Object {
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.native
  /** Object text. */
  var text: js.UndefOr[String] = js.native
}

object SemanticRolesResultObject {
  @scala.inline
  def apply(): SemanticRolesResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultObject]
  }
  @scala.inline
  implicit class SemanticRolesResultObjectOps[Self <: SemanticRolesResultObject] (val x: Self) extends AnyVal {
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

