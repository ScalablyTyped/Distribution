package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentLeft extends js.Object {
  var asCell: String = js.native
  var comment: String = js.native
  var content: String = js.native
  var contentLeft: String = js.native
  var description: String = js.native
  var descriptionUnderInput: String = js.native
  var disabled: String = js.native
  var flowRoot: String = js.native
  var footer: String = js.native
  var formGroup: String = js.native
  var hasError: String = js.native
  var header: String = js.native
  var headerBottom: String = js.native
  var headerLeft: String = js.native
  var headerTop: String = js.native
  var indent: Double = js.native
  var mainRoot: String = js.native
  var number: String = js.native
  var required: String = js.native
  var requiredText: String = js.native
  var title: String = js.native
  var titleLeftRoot: String = js.native
  var titleOnAnswer: String = js.native
  var titleOnError: String = js.native
  var titleRequired: String = js.native
}

object ContentLeft {
  @scala.inline
  def apply(
    asCell: String,
    comment: String,
    content: String,
    contentLeft: String,
    description: String,
    descriptionUnderInput: String,
    disabled: String,
    flowRoot: String,
    footer: String,
    formGroup: String,
    hasError: String,
    header: String,
    headerBottom: String,
    headerLeft: String,
    headerTop: String,
    indent: Double,
    mainRoot: String,
    number: String,
    required: String,
    requiredText: String,
    title: String,
    titleLeftRoot: String,
    titleOnAnswer: String,
    titleOnError: String,
    titleRequired: String
  ): ContentLeft = {
    val __obj = js.Dynamic.literal(asCell = asCell.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentLeft = contentLeft.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionUnderInput = descriptionUnderInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], flowRoot = flowRoot.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], formGroup = formGroup.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerBottom = headerBottom.asInstanceOf[js.Any], headerLeft = headerLeft.asInstanceOf[js.Any], headerTop = headerTop.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], mainRoot = mainRoot.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleLeftRoot = titleLeftRoot.asInstanceOf[js.Any], titleOnAnswer = titleOnAnswer.asInstanceOf[js.Any], titleOnError = titleOnError.asInstanceOf[js.Any], titleRequired = titleRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLeft]
  }
  @scala.inline
  implicit class ContentLeftOps[Self <: ContentLeft] (val x: Self) extends AnyVal {
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
    def setAsCell(value: String): Self = this.set("asCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentLeft(value: String): Self = this.set("contentLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionUnderInput(value: String): Self = this.set("descriptionUnderInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowRoot(value: String): Self = this.set("flowRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormGroup(value: String): Self = this.set("formGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasError(value: String): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderBottom(value: String): Self = this.set("headerBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderLeft(value: String): Self = this.set("headerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTop(value: String): Self = this.set("headerTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainRoot(value: String): Self = this.set("mainRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredText(value: String): Self = this.set("requiredText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleLeftRoot(value: String): Self = this.set("titleLeftRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleOnAnswer(value: String): Self = this.set("titleOnAnswer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleOnError(value: String): Self = this.set("titleOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleRequired(value: String): Self = this.set("titleRequired", value.asInstanceOf[js.Any])
  }
  
}

