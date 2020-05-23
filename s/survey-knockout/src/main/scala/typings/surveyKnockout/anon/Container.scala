package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: String
  var description: String
  var footer: String
  var icon: String
  var iconExpanded: String
  var title: String
  var titleExpandable: String
}

object Container {
  @scala.inline
  def apply(
    container: String,
    description: String,
    footer: String,
    icon: String,
    iconExpanded: String,
    title: String,
    titleExpandable: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

