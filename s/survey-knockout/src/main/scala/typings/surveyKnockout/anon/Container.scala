package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: String = js.native
  var description: String = js.native
  var footer: String = js.native
  var icon: String = js.native
  var iconExpanded: String = js.native
  var number: String = js.native
  var requiredText: String = js.native
  var title: String = js.native
  var titleExpandable: String = js.native
  var titleOnError: String = js.native
}

object Container {
  @scala.inline
  def apply(
    container: String,
    description: String,
    footer: String,
    icon: String,
    iconExpanded: String,
    number: String,
    requiredText: String,
    title: String,
    titleExpandable: String,
    titleOnError: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any], titleOnError = titleOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconExpanded(value: String): Self = this.set("iconExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredText(value: String): Self = this.set("requiredText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleExpandable(value: String): Self = this.set("titleExpandable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleOnError(value: String): Self = this.set("titleOnError", value.asInstanceOf[js.Any])
  }
  
}

